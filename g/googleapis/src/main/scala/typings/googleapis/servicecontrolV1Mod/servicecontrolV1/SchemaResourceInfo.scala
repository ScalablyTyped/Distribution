package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceInfo extends StObject {
  
  /**
    * The identifier of the parent of this resource instance. Must be in one of the following formats: - `projects/` - `folders/` - `organizations/`
    */
  var resourceContainer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location of the resource. If not empty, the resource will be checked against location policy. The value must be a valid zone, region or multiregion. For example: "europe-west4" or "northamerica-northeast1-a"
    */
  var resourceLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the resource. This is used for auditing purposes.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceInfo {
  
  inline def apply(): SchemaResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceInfo]
  }
  
  extension [Self <: SchemaResourceInfo](x: Self) {
    
    inline def setResourceContainer(value: String): Self = StObject.set(x, "resourceContainer", value.asInstanceOf[js.Any])
    
    inline def setResourceContainerNull: Self = StObject.set(x, "resourceContainer", null)
    
    inline def setResourceContainerUndefined: Self = StObject.set(x, "resourceContainer", js.undefined)
    
    inline def setResourceLocation(value: String): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    inline def setResourceLocationNull: Self = StObject.set(x, "resourceLocation", null)
    
    inline def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
