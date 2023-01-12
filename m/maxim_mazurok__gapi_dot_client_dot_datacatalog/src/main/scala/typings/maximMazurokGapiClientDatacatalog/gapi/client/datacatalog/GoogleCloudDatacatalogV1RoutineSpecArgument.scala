package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1RoutineSpecArgument extends StObject {
  
  /** Specifies whether the argument is input or output. */
  var mode: js.UndefOr[String] = js.undefined
  
  /** The name of the argument. A return argument of a function might not have a name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Type of the argument. The exact value depends on the source system and the language. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1RoutineSpecArgument {
  
  inline def apply(): GoogleCloudDatacatalogV1RoutineSpecArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1RoutineSpecArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1RoutineSpecArgument] (val x: Self) extends AnyVal {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
