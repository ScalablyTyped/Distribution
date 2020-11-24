package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of an Android device tests may be run on.
  */
@js.native
trait SchemaAndroidModel extends js.Object {
  
  /**
    * The company that this device is branded with. Example:
    * &quot;Google&quot;, &quot;Samsung&quot;.
    */
  var brand: js.UndefOr[String] = js.native
  
  /**
    * The name of the industrial design. This corresponds to
    * android.os.Build.DEVICE.
    */
  var codename: js.UndefOr[String] = js.native
  
  /**
    * Whether this device is virtual or physical.
    */
  var form: js.UndefOr[String] = js.native
  
  /**
    * Whether this device is a phone, tablet, wearable, etc.
    */
  var formFactor: js.UndefOr[String] = js.native
  
  /**
    * The unique opaque id for this model. Use this for invoking the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * True if and only if tests with this model are recorded by stitching
    * together screenshots. See use_low_spec_video_recording in device config.
    */
  var lowFpsVideoRecording: js.UndefOr[Boolean] = js.native
  
  /**
    * The manufacturer of this device.
    */
  var manufacturer: js.UndefOr[String] = js.native
  
  /**
    * The human-readable marketing name for this device model. Examples:
    * &quot;Nexus 5&quot;, &quot;Galaxy S5&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Screen density in DPI. This corresponds to ro.sf.lcd_density
    */
  var screenDensity: js.UndefOr[Double] = js.native
  
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    */
  var screenX: js.UndefOr[Double] = js.native
  
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    */
  var screenY: js.UndefOr[Double] = js.native
  
  /**
    * The list of supported ABIs for this device. This corresponds to either
    * android.os.Build.SUPPORTED_ABIS (for API level 21 and above) or
    * android.os.Build.CPU_ABI/CPU_ABI2. The most preferred ABI is the first
    * element in the list.  Elements are optionally prefixed by
    * &quot;version_id:&quot; (where version_id is the id of an
    * AndroidVersion), denoting an ABI that is supported only on a particular
    * version.
    */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The set of Android versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAndroidModel {
  
  @scala.inline
  def apply(): SchemaAndroidModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidModel]
  }
  
  @scala.inline
  implicit class SchemaAndroidModelOps[Self <: SchemaAndroidModel] (val x: Self) extends AnyVal {
    
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
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCodename(value: String): Self = this.set("codename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodename: Self = this.set("codename", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setFormFactor(value: String): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormFactor: Self = this.set("formFactor", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLowFpsVideoRecording(value: Boolean): Self = this.set("lowFpsVideoRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowFpsVideoRecording: Self = this.set("lowFpsVideoRecording", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScreenDensity(value: Double): Self = this.set("screenDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenDensity: Self = this.set("screenDensity", js.undefined)
    
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenX: Self = this.set("screenX", js.undefined)
    
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenY: Self = this.set("screenY", js.undefined)
    
    @scala.inline
    def setSupportedAbisVarargs(value: String*): Self = this.set("supportedAbis", js.Array(value :_*))
    
    @scala.inline
    def setSupportedAbis(value: js.Array[String]): Self = this.set("supportedAbis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedAbis: Self = this.set("supportedAbis", js.undefined)
    
    @scala.inline
    def setSupportedVersionIdsVarargs(value: String*): Self = this.set("supportedVersionIds", js.Array(value :_*))
    
    @scala.inline
    def setSupportedVersionIds(value: js.Array[String]): Self = this.set("supportedVersionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedVersionIds: Self = this.set("supportedVersionIds", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
