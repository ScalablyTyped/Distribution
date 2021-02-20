package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of an iOS device tests may be run on.
  */
@js.native
trait SchemaIosModel extends StObject {
  
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
  implicit class SchemaIosModelMutableBuilder[Self <: SchemaIosModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCapabilities(value: js.Array[String]): Self = StObject.set(x, "deviceCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCapabilitiesUndefined: Self = StObject.set(x, "deviceCapabilities", js.undefined)
    
    @scala.inline
    def setDeviceCapabilitiesVarargs(value: String*): Self = StObject.set(x, "deviceCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
