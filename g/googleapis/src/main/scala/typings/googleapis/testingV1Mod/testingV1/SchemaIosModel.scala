package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of an iOS device tests may be run on.
  */
@js.native
trait SchemaIosModel extends js.Object {
  
  /**
    * Device capabilities. Copied from
    * https://developer.apple.com/library/archive/documentation/DeviceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMatrix.html
    */
  var deviceCapabilities: js.UndefOr[js.Array[String]] = js.native
  
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
    * The human-readable name for this device model. Examples: &quot;iPhone
    * 4s&quot;, &quot;iPad Mini 2&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The set of iOS major software versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object SchemaIosModel {
  
  @scala.inline
  def apply(): SchemaIosModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosModel]
  }
  
  @scala.inline
  implicit class SchemaIosModelOps[Self <: SchemaIosModel] (val x: Self) extends AnyVal {
    
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
    def setDeviceCapabilitiesVarargs(value: String*): Self = this.set("deviceCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCapabilities(value: js.Array[String]): Self = this.set("deviceCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCapabilities: Self = this.set("deviceCapabilities", js.undefined)
    
    @scala.inline
    def setFormFactor(value: String): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormFactor: Self = this.set("formFactor", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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
