package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Routine extends js.Object {
  
  /** Optional. */
  var arguments: js.UndefOr[js.Array[Argument]] = js.native
  
  /** Output only. The time when this routine was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example,
    * for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, "\n", y))` The definition_body is `concat(x, "\n", y)` (\n is not
    * replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION
    * f() RETURNS STRING LANGUAGE js AS 'return "\n";\n'` The definition_body is `return "\n";\n` Note that both \n are replaced with linebreaks.
    */
  var definitionBody: js.UndefOr[String] = js.native
  
  /** Optional. [Experimental] The description of the routine if defined. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. [Experimental] The determinism level of the JavaScript UDF if defined. */
  var determinismLevel: js.UndefOr[String] = js.native
  
  /** Output only. A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Optional. If language = "JAVASCRIPT", this field stores the path of the imported JAVASCRIPT libraries. */
  var importedLibraries: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Defaults to "SQL". */
  var language: js.UndefOr[String] = js.native
  
  /** Output only. The time when this routine was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /**
    * Optional if language = "SQL"; required otherwise. If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present,
    * then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x
    * FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));`
    * The return_type is `{type_kind: "FLOAT64"}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by
    * `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of
    * `Decrement` remains FLOAT64.
    */
  var returnType: js.UndefOr[StandardSqlDataType] = js.native
  
  /** Required. Reference describing the ID of this routine. */
  var routineReference: js.UndefOr[RoutineReference] = js.native
  
  /** Required. The type of routine. */
  var routineType: js.UndefOr[String] = js.native
}
object Routine {
  
  @scala.inline
  def apply(): Routine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Routine]
  }
  
  @scala.inline
  implicit class RoutineOps[Self <: Routine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDefinitionBody(value: String): Self = this.set("definitionBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionBody: Self = this.set("definitionBody", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDeterminismLevel(value: String): Self = this.set("determinismLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterminismLevel: Self = this.set("determinismLevel", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setImportedLibrariesVarargs(value: String*): Self = this.set("importedLibraries", js.Array(value :_*))
    
    @scala.inline
    def setImportedLibraries(value: js.Array[String]): Self = this.set("importedLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportedLibraries: Self = this.set("importedLibraries", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setReturnType(value: StandardSqlDataType): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnType: Self = this.set("returnType", js.undefined)
    
    @scala.inline
    def setRoutineReference(value: RoutineReference): Self = this.set("routineReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutineReference: Self = this.set("routineReference", js.undefined)
    
    @scala.inline
    def setRoutineType(value: String): Self = this.set("routineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutineType: Self = this.set("routineType", js.undefined)
  }
}
