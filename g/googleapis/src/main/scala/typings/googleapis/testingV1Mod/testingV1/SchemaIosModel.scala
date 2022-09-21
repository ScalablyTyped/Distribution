package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosModel extends StObject {
  
  /**
    * Device capabilities. Copied from https://developer.apple.com/library/archive/documentation/DeviceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMatrix.html
    */
  var deviceCapabilities: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether this device is a phone, tablet, wearable, etc.
    */
  var formFactor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique opaque id for this model. Use this for invoking the TestExecutionService.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human-readable name for this device model. Examples: "iPhone 4s", "iPad Mini 2".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Screen density in DPI.
    */
  var screenDensity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    */
  var screenX: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    */
  var screenY: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The set of iOS major software versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Tags for this dimension. Examples: "default", "preview", "deprecated".
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIosModel {
  
  inline def apply(): SchemaIosModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosModel]
  }
  
  extension [Self <: SchemaIosModel](x: Self) {
    
    inline def setDeviceCapabilities(value: js.Array[String]): Self = StObject.set(x, "deviceCapabilities", value.asInstanceOf[js.Any])
    
    inline def setDeviceCapabilitiesNull: Self = StObject.set(x, "deviceCapabilities", null)
    
    inline def setDeviceCapabilitiesUndefined: Self = StObject.set(x, "deviceCapabilities", js.undefined)
    
    inline def setDeviceCapabilitiesVarargs(value: String*): Self = StObject.set(x, "deviceCapabilities", js.Array(value*))
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorNull: Self = StObject.set(x, "formFactor", null)
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScreenDensity(value: Double): Self = StObject.set(x, "screenDensity", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityNull: Self = StObject.set(x, "screenDensity", null)
    
    inline def setScreenDensityUndefined: Self = StObject.set(x, "screenDensity", js.undefined)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenXNull: Self = StObject.set(x, "screenX", null)
    
    inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setScreenYNull: Self = StObject.set(x, "screenY", null)
    
    inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    inline def setSupportedVersionIds(value: js.Array[String]): Self = StObject.set(x, "supportedVersionIds", value.asInstanceOf[js.Any])
    
    inline def setSupportedVersionIdsNull: Self = StObject.set(x, "supportedVersionIds", null)
    
    inline def setSupportedVersionIdsUndefined: Self = StObject.set(x, "supportedVersionIds", js.undefined)
    
    inline def setSupportedVersionIdsVarargs(value: String*): Self = StObject.set(x, "supportedVersionIds", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
