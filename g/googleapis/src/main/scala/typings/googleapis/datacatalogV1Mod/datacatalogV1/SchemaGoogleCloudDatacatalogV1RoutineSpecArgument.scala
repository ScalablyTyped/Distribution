package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1RoutineSpecArgument extends StObject {
  
  /**
    * Specifies whether the argument is input or output.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the argument. A return argument of a function might not have a name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the argument. The exact value depends on the source system and the language.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1RoutineSpecArgument {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1RoutineSpecArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1RoutineSpecArgument]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1RoutineSpecArgument](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
