package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Routine extends StObject {
  
  /** Optional. */
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  
  /** Output only. The time when this routine was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example,
    * for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, "\n", y))` The definition_body is `concat(x, "\n", y)` (\n is not
    * replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION
    * f() RETURNS STRING LANGUAGE js AS 'return "\n";\n'` The definition_body is `return "\n";\n` Note that both \n are replaced with linebreaks.
    */
  var definitionBody: js.UndefOr[String] = js.undefined
  
  /** Optional. [Experimental] The description of the routine if defined. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. [Experimental] The determinism level of the JavaScript UDF if defined. */
  var determinismLevel: js.UndefOr[String] = js.undefined
  
  /** Output only. A hash of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Optional. If language = "JAVASCRIPT", this field stores the path of the imported JAVASCRIPT libraries. */
  var importedLibraries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Defaults to "SQL". */
  var language: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when this routine was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional if language = "SQL"; required otherwise. If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present,
    * then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x
    * FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));`
    * The return_type is `{type_kind: "FLOAT64"}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by
    * `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of
    * `Decrement` remains FLOAT64.
    */
  var returnType: js.UndefOr[StandardSqlDataType] = js.undefined
  
  /** Required. Reference describing the ID of this routine. */
  var routineReference: js.UndefOr[RoutineReference] = js.undefined
  
  /** Required. The type of routine. */
  var routineType: js.UndefOr[String] = js.undefined
}
object Routine {
  
  @scala.inline
  def apply(): Routine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Routine]
  }
  
  @scala.inline
  implicit class RoutineMutableBuilder[Self <: Routine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDefinitionBody(value: String): Self = StObject.set(x, "definitionBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionBodyUndefined: Self = StObject.set(x, "definitionBody", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDeterminismLevel(value: String): Self = StObject.set(x, "determinismLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeterminismLevelUndefined: Self = StObject.set(x, "determinismLevel", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setImportedLibraries(value: js.Array[String]): Self = StObject.set(x, "importedLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedLibrariesUndefined: Self = StObject.set(x, "importedLibraries", js.undefined)
    
    @scala.inline
    def setImportedLibrariesVarargs(value: String*): Self = StObject.set(x, "importedLibraries", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setReturnType(value: StandardSqlDataType): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    @scala.inline
    def setRoutineReference(value: RoutineReference): Self = StObject.set(x, "routineReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutineReferenceUndefined: Self = StObject.set(x, "routineReference", js.undefined)
    
    @scala.inline
    def setRoutineType(value: String): Self = StObject.set(x, "routineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutineTypeUndefined: Self = StObject.set(x, "routineType", js.undefined)
  }
}
