package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidModel extends StObject {
  
  /**
    * The company that this device is branded with. Example: "Google", "Samsung".
    */
  var brand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the industrial design. This corresponds to android.os.Build.DEVICE.
    */
  var codename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this device is virtual or physical.
    */
  var form: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this device is a phone, tablet, wearable, etc.
    */
  var formFactor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique opaque id for this model. Use this for invoking the TestExecutionService.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if and only if tests with this model are recorded by stitching together screenshots. See use_low_spec_video_recording in device config.
    */
  var lowFpsVideoRecording: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The manufacturer of this device.
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human-readable marketing name for this device model. Examples: "Nexus 5", "Galaxy S5".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Screen density in DPI. This corresponds to ro.sf.lcd_density
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
    * The list of supported ABIs for this device. This corresponds to either android.os.Build.SUPPORTED_ABIS (for API level 21 and above) or android.os.Build.CPU_ABI/CPU_ABI2. The most preferred ABI is the first element in the list. Elements are optionally prefixed by "version_id:" (where version_id is the id of an AndroidVersion), denoting an ABI that is supported only on a particular version.
    */
  var supportedAbis: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The set of Android versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Tags for this dimension. Examples: "default", "preview", "deprecated".
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * URL of a thumbnail image (photo) of the device.
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidModel {
  
  inline def apply(): SchemaAndroidModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidModel]
  }
  
  extension [Self <: SchemaAndroidModel](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandNull: Self = StObject.set(x, "brand", null)
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
    
    inline def setCodenameNull: Self = StObject.set(x, "codename", null)
    
    inline def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorNull: Self = StObject.set(x, "formFactor", null)
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLowFpsVideoRecording(value: Boolean): Self = StObject.set(x, "lowFpsVideoRecording", value.asInstanceOf[js.Any])
    
    inline def setLowFpsVideoRecordingNull: Self = StObject.set(x, "lowFpsVideoRecording", null)
    
    inline def setLowFpsVideoRecordingUndefined: Self = StObject.set(x, "lowFpsVideoRecording", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
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
    
    inline def setSupportedAbis(value: js.Array[String]): Self = StObject.set(x, "supportedAbis", value.asInstanceOf[js.Any])
    
    inline def setSupportedAbisNull: Self = StObject.set(x, "supportedAbis", null)
    
    inline def setSupportedAbisUndefined: Self = StObject.set(x, "supportedAbis", js.undefined)
    
    inline def setSupportedAbisVarargs(value: String*): Self = StObject.set(x, "supportedAbis", js.Array(value*))
    
    inline def setSupportedVersionIds(value: js.Array[String]): Self = StObject.set(x, "supportedVersionIds", value.asInstanceOf[js.Any])
    
    inline def setSupportedVersionIdsNull: Self = StObject.set(x, "supportedVersionIds", null)
    
    inline def setSupportedVersionIdsUndefined: Self = StObject.set(x, "supportedVersionIds", js.undefined)
    
    inline def setSupportedVersionIdsVarargs(value: String*): Self = StObject.set(x, "supportedVersionIds", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
