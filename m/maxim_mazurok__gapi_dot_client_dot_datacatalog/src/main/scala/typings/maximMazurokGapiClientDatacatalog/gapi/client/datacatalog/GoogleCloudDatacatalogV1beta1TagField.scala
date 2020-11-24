package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1TagField extends js.Object {
  
  /** Holds the value for a tag field with boolean type. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** Output only. The display name of this field. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Holds the value for a tag field with double type. */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /** Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum. */
  var enumValue: js.UndefOr[GoogleCloudDatacatalogV1beta1TagFieldEnumValue] = js.native
  
  /**
    * Output only. The order of this field with respect to other fields in this tag. It can be set in Tag. For example, a higher value can indicate a more important field. The value can
    * be negative. Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
    */
  var order: js.UndefOr[Double] = js.native
  
  /** Holds the value for a tag field with string type. */
  var stringValue: js.UndefOr[String] = js.native
  
  /** Holds the value for a tag field with timestamp type. */
  var timestampValue: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1TagField {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TagField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagField]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagFieldOps[Self <: GoogleCloudDatacatalogV1beta1TagField] (val x: Self) extends AnyVal {
    
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
    @scala.inline
    def setEnumValue(value: GoogleCloudDatacatalogV1beta1TagFieldEnumValue): Self = this.set("enumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumValue: Self = this.set("enumValue", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
}
