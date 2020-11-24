package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KiiThingFields
  extends /**
  * custom fields.
  */
/* name */ StringDictionary[js.Any] {
  
  /**
    * firmware version given by thing vendor.
    */
  var _firmwareVersion: js.UndefOr[String] = js.native
  
  /**
    * lot identifier given by thing vendor.
    */
  var _lot: js.UndefOr[String] = js.native
  
  /**
    * arbitrary number field.
    */
  var _numberField1: js.UndefOr[Double] = js.native
  
  /**
    * arbitrary number field.
    */
  var _numberField2: js.UndefOr[Double] = js.native
  
  /**
    * arbitrary number field.
    */
  var _numberField3: js.UndefOr[Double] = js.native
  
  /**
    * arbitrary number field.
    */
  var _numberField4: js.UndefOr[Double] = js.native
  
  /**
    * arbitrary number field.
    */
  var _numberField5: js.UndefOr[Double] = js.native
  
  /**
    * thing password given by thing vendor.
    */
  var _password: String = js.native
  
  /**
    * product name given by thing vendor.
    */
  var _productName: js.UndefOr[String] = js.native
  
  /**
    * arbitrary string field.
    */
  var _stringField1: js.UndefOr[String] = js.native
  
  /**
    * arbitrary string field.
    */
  var _stringField2: js.UndefOr[String] = js.native
  
  /**
    * arbitrary string field.
    */
  var _stringField3: js.UndefOr[String] = js.native
  
  /**
    * arbitrary string field.
    */
  var _stringField4: js.UndefOr[String] = js.native
  
  /**
    * arbitrary string field.
    */
  var _stringField5: js.UndefOr[String] = js.native
  
  /**
    * thing type given by thing vendor.
    */
  var _thingType: js.UndefOr[String] = js.native
  
  /**
    * vendor identifier given by thing vendor.
    */
  var _vendor: js.UndefOr[String] = js.native
  
  /**
    * thing identifier given by thing vendor.
    */
  var _vendorThingID: String = js.native
}
object KiiThingFields {
  
  @scala.inline
  def apply(_password: String, _vendorThingID: String): KiiThingFields = {
    val __obj = js.Dynamic.literal(_password = _password.asInstanceOf[js.Any], _vendorThingID = _vendorThingID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiThingFields]
  }
  
  @scala.inline
  implicit class KiiThingFieldsOps[Self <: KiiThingFields] (val x: Self) extends AnyVal {
    
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
    def set_password(value: String): Self = this.set("_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vendorThingID(value: String): Self = this.set("_vendorThingID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_firmwareVersion(value: String): Self = this.set("_firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_firmwareVersion: Self = this.set("_firmwareVersion", js.undefined)
    
    @scala.inline
    def set_lot(value: String): Self = this.set("_lot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lot: Self = this.set("_lot", js.undefined)
    
    @scala.inline
    def set_numberField1(value: Double): Self = this.set("_numberField1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_numberField1: Self = this.set("_numberField1", js.undefined)
    
    @scala.inline
    def set_numberField2(value: Double): Self = this.set("_numberField2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_numberField2: Self = this.set("_numberField2", js.undefined)
    
    @scala.inline
    def set_numberField3(value: Double): Self = this.set("_numberField3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_numberField3: Self = this.set("_numberField3", js.undefined)
    
    @scala.inline
    def set_numberField4(value: Double): Self = this.set("_numberField4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_numberField4: Self = this.set("_numberField4", js.undefined)
    
    @scala.inline
    def set_numberField5(value: Double): Self = this.set("_numberField5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_numberField5: Self = this.set("_numberField5", js.undefined)
    
    @scala.inline
    def set_productName(value: String): Self = this.set("_productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_productName: Self = this.set("_productName", js.undefined)
    
    @scala.inline
    def set_stringField1(value: String): Self = this.set("_stringField1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_stringField1: Self = this.set("_stringField1", js.undefined)
    
    @scala.inline
    def set_stringField2(value: String): Self = this.set("_stringField2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_stringField2: Self = this.set("_stringField2", js.undefined)
    
    @scala.inline
    def set_stringField3(value: String): Self = this.set("_stringField3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_stringField3: Self = this.set("_stringField3", js.undefined)
    
    @scala.inline
    def set_stringField4(value: String): Self = this.set("_stringField4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_stringField4: Self = this.set("_stringField4", js.undefined)
    
    @scala.inline
    def set_stringField5(value: String): Self = this.set("_stringField5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_stringField5: Self = this.set("_stringField5", js.undefined)
    
    @scala.inline
    def set_thingType(value: String): Self = this.set("_thingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_thingType: Self = this.set("_thingType", js.undefined)
    
    @scala.inline
    def set_vendor(value: String): Self = this.set("_vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_vendor: Self = this.set("_vendor", js.undefined)
  }
}
