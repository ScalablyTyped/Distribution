package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1RoutineSpec extends StObject {
  
  /** Fields specific for BigQuery routines. */
  var bigqueryRoutineSpec: js.UndefOr[GoogleCloudDatacatalogV1BigQueryRoutineSpec] = js.undefined
  
  /** The body of the routine. */
  var definitionBody: js.UndefOr[String] = js.undefined
  
  /** The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT` */
  var language: js.UndefOr[String] = js.undefined
  
  /** Return type of the argument. The exact value depends on the source system and the language. */
  var returnType: js.UndefOr[String] = js.undefined
  
  /** Arguments of the routine. */
  var routineArguments: js.UndefOr[js.Array[GoogleCloudDatacatalogV1RoutineSpecArgument]] = js.undefined
  
  /** The type of the routine. */
  var routineType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1RoutineSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1RoutineSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1RoutineSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1RoutineSpec] (val x: Self) extends AnyVal {
    
    inline def setBigqueryRoutineSpec(value: GoogleCloudDatacatalogV1BigQueryRoutineSpec): Self = StObject.set(x, "bigqueryRoutineSpec", value.asInstanceOf[js.Any])
    
    inline def setBigqueryRoutineSpecUndefined: Self = StObject.set(x, "bigqueryRoutineSpec", js.undefined)
    
    inline def setDefinitionBody(value: String): Self = StObject.set(x, "definitionBody", value.asInstanceOf[js.Any])
    
    inline def setDefinitionBodyUndefined: Self = StObject.set(x, "definitionBody", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setRoutineArguments(value: js.Array[GoogleCloudDatacatalogV1RoutineSpecArgument]): Self = StObject.set(x, "routineArguments", value.asInstanceOf[js.Any])
    
    inline def setRoutineArgumentsUndefined: Self = StObject.set(x, "routineArguments", js.undefined)
    
    inline def setRoutineArgumentsVarargs(value: GoogleCloudDatacatalogV1RoutineSpecArgument*): Self = StObject.set(x, "routineArguments", js.Array(value*))
    
    inline def setRoutineType(value: String): Self = StObject.set(x, "routineType", value.asInstanceOf[js.Any])
    
    inline def setRoutineTypeUndefined: Self = StObject.set(x, "routineType", js.undefined)
  }
}
