package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1RoutineSpec extends StObject {
  
  /**
    * Fields specific for BigQuery routines.
    */
  var bigqueryRoutineSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec] = js.undefined
  
  /**
    * The body of the routine.
    */
  var definitionBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Return type of the argument. The exact value depends on the source system and the language.
    */
  var returnType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Arguments of the routine.
    */
  var routineArguments: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1RoutineSpecArgument]] = js.undefined
  
  /**
    * The type of the routine.
    */
  var routineType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1RoutineSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1RoutineSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1RoutineSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1RoutineSpec](x: Self) {
    
    inline def setBigqueryRoutineSpec(value: SchemaGoogleCloudDatacatalogV1BigQueryRoutineSpec): Self = StObject.set(x, "bigqueryRoutineSpec", value.asInstanceOf[js.Any])
    
    inline def setBigqueryRoutineSpecUndefined: Self = StObject.set(x, "bigqueryRoutineSpec", js.undefined)
    
    inline def setDefinitionBody(value: String): Self = StObject.set(x, "definitionBody", value.asInstanceOf[js.Any])
    
    inline def setDefinitionBodyNull: Self = StObject.set(x, "definitionBody", null)
    
    inline def setDefinitionBodyUndefined: Self = StObject.set(x, "definitionBody", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setRoutineArguments(value: js.Array[SchemaGoogleCloudDatacatalogV1RoutineSpecArgument]): Self = StObject.set(x, "routineArguments", value.asInstanceOf[js.Any])
    
    inline def setRoutineArgumentsUndefined: Self = StObject.set(x, "routineArguments", js.undefined)
    
    inline def setRoutineArgumentsVarargs(value: SchemaGoogleCloudDatacatalogV1RoutineSpecArgument*): Self = StObject.set(x, "routineArguments", js.Array(value*))
    
    inline def setRoutineType(value: String): Self = StObject.set(x, "routineType", value.asInstanceOf[js.Any])
    
    inline def setRoutineTypeNull: Self = StObject.set(x, "routineType", null)
    
    inline def setRoutineTypeUndefined: Self = StObject.set(x, "routineType", js.undefined)
  }
}
