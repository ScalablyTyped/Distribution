package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of an Android device tests may be run on.
  */
trait SchemaAndroidModel extends StObject {
  
  /**
    * The company that this device is branded with. Example:
    * &quot;Google&quot;, &quot;Samsung&quot;.
    */
  var brand: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the industrial design. This corresponds to
    * android.os.Build.DEVICE.
    */
  var codename: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this device is virtual or physical.
    */
  var form: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this device is a phone, tablet, wearable, etc.
    */
  var formFactor: js.UndefOr[String] = js.undefined
  
  /**
    * The unique opaque id for this model. Use this for invoking the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * True if and only if tests with this model are recorded by stitching
    * together screenshots. See use_low_spec_video_recording in device config.
    */
  var lowFpsVideoRecording: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The manufacturer of this device.
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * The human-readable marketing name for this device model. Examples:
    * &quot;Nexus 5&quot;, &quot;Galaxy S5&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Screen density in DPI. This corresponds to ro.sf.lcd_density
    */
  var screenDensity: js.UndefOr[Double] = js.undefined
  
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    */
  var screenX: js.UndefOr[Double] = js.undefined
  
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    */
  var screenY: js.UndefOr[Double] = js.undefined
  
  /**
    * The list of supported ABIs for this device. This corresponds to either
    * android.os.Build.SUPPORTED_ABIS (for API level 21 and above) or
    * android.os.Build.CPU_ABI/CPU_ABI2. The most preferred ABI is the first
    * element in the list.  Elements are optionally prefixed by
    * &quot;version_id:&quot; (where version_id is the id of an
    * AndroidVersion), denoting an ABI that is supported only on a particular
    * version.
    */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The set of Android versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAndroidModel {
  
  @scala.inline
  def apply(): SchemaAndroidModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidModel]
  }
  
  @scala.inline
  implicit class SchemaAndroidModelMutableBuilder[Self <: SchemaAndroidModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLowFpsVideoRecording(value: Boolean): Self = StObject.set(x, "lowFpsVideoRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFpsVideoRecordingUndefined: Self = StObject.set(x, "lowFpsVideoRecording", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScreenDensity(value: Double): Self = StObject.set(x, "screenDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenDensityUndefined: Self = StObject.set(x, "screenDensity", js.undefined)
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    @scala.inline
    def setSupportedAbis(value: js.Array[String]): Self = StObject.set(x, "supportedAbis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedAbisUndefined: Self = StObject.set(x, "supportedAbis", js.undefined)
    
    @scala.inline
    def setSupportedAbisVarargs(value: String*): Self = StObject.set(x, "supportedAbis", js.Array(value :_*))
    
    @scala.inline
    def setSupportedVersionIds(value: js.Array[String]): Self = StObject.set(x, "supportedVersionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedVersionIdsUndefined: Self = StObject.set(x, "supportedVersionIds", js.undefined)
    
    @scala.inline
    def setSupportedVersionIdsVarargs(value: String*): Self = StObject.set(x, "supportedVersionIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
