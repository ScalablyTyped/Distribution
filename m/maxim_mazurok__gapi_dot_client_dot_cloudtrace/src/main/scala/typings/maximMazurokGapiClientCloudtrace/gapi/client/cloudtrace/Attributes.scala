package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  /**
    * The set of attributes. Each attribute's key can be up to 128 bytes long. The value can be a string up to 256 bytes, a signed 64-bit integer, or the Boolean values `true` and
    * `false`. For example: "/instance_id": { "string_value": { "value": "my-instance" } } "/http/request_bytes": { "int_value": 300 } "abc.com/myattribute": { "bool_value": false }
    */
  var attributeMap: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.cloudtrace.gapi.client.cloudtrace.AttributeValue}
    */ typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.Attributes with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The number of attributes that were discarded. Attributes can be discarded because their keys are too long or because there are too many attributes. If this value is 0 then all
    * attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setAttributeMap(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudtrace.gapi.client.cloudtrace.AttributeValue}
      */ typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.Attributes with TopLevel[js.Any]
    ): Self = this.set("attributeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeMap: Self = this.set("attributeMap", js.undefined)
    
    @scala.inline
    def setDroppedAttributesCount(value: Double): Self = this.set("droppedAttributesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppedAttributesCount: Self = this.set("droppedAttributesCount", js.undefined)
  }
}
