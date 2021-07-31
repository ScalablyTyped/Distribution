package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KiiThingFields
  extends StObject
     with /**
  * custom fields.
  */
/* name */ StringDictionary[js.Any] {
  
  /**
    * firmware version given by thing vendor.
    */
  var _firmwareVersion: js.UndefOr[String] = js.undefined
  
  /**
    * lot identifier given by thing vendor.
    */
  var _lot: js.UndefOr[String] = js.undefined
  
  /**
    * arbitrary number field.
    */
  var _numberField1: js.UndefOr[Double] = js.undefined
  
  /**
    * arbitrary number field.
    */
  var _numberField2: js.UndefOr[Double] = js.undefined
  
  /**
    * arbitrary number field.
    */
  var _numberField3: js.UndefOr[Double] = js.undefined
  
  /**
    * arbitrary number field.
    */
  var _numberField4: js.UndefOr[Double] = js.undefined
  
  /**
    * arbitrary number field.
    */
  var _numberField5: js.UndefOr[Double] = js.undefined
  
  /**
    * thing password given by thing vendor.
    */
  var _password: String
  
  /**
    * product name given by thing vendor.
    */
  var _productName: js.UndefOr[String] = js.undefined
  
  /**
    * arbitrary string field.
    */
  var _stringField1: js.UndefOr[String] = js.undefined
  
  /**
    * arbitrary string field.
    */
  var _stringField2: js.UndefOr[String] = js.undefined
  
  /**
    * arbitrary string field.
    */
  var _stringField3: js.UndefOr[String] = js.undefined
  
  /**
    * arbitrary string field.
    */
  var _stringField4: js.UndefOr[String] = js.undefined
  
  /**
    * arbitrary string field.
    */
  var _stringField5: js.UndefOr[String] = js.undefined
  
  /**
    * thing type given by thing vendor.
    */
  var _thingType: js.UndefOr[String] = js.undefined
  
  /**
    * vendor identifier given by thing vendor.
    */
  var _vendor: js.UndefOr[String] = js.undefined
  
  /**
    * thing identifier given by thing vendor.
    */
  var _vendorThingID: String
}
object KiiThingFields {
  
  @scala.inline
  def apply(_password: String, _vendorThingID: String): KiiThingFields = {
    val __obj = js.Dynamic.literal(_password = _password.asInstanceOf[js.Any], _vendorThingID = _vendorThingID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiThingFields]
  }
  
  @scala.inline
  implicit class KiiThingFieldsMutableBuilder[Self <: KiiThingFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_firmwareVersion(value: String): Self = StObject.set(x, "_firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_firmwareVersionUndefined: Self = StObject.set(x, "_firmwareVersion", js.undefined)
    
    @scala.inline
    def set_lot(value: String): Self = StObject.set(x, "_lot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lotUndefined: Self = StObject.set(x, "_lot", js.undefined)
    
    @scala.inline
    def set_numberField1(value: Double): Self = StObject.set(x, "_numberField1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberField1Undefined: Self = StObject.set(x, "_numberField1", js.undefined)
    
    @scala.inline
    def set_numberField2(value: Double): Self = StObject.set(x, "_numberField2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberField2Undefined: Self = StObject.set(x, "_numberField2", js.undefined)
    
    @scala.inline
    def set_numberField3(value: Double): Self = StObject.set(x, "_numberField3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberField3Undefined: Self = StObject.set(x, "_numberField3", js.undefined)
    
    @scala.inline
    def set_numberField4(value: Double): Self = StObject.set(x, "_numberField4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberField4Undefined: Self = StObject.set(x, "_numberField4", js.undefined)
    
    @scala.inline
    def set_numberField5(value: Double): Self = StObject.set(x, "_numberField5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberField5Undefined: Self = StObject.set(x, "_numberField5", js.undefined)
    
    @scala.inline
    def set_password(value: String): Self = StObject.set(x, "_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_productName(value: String): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
    
    @scala.inline
    def set_stringField1(value: String): Self = StObject.set(x, "_stringField1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stringField1Undefined: Self = StObject.set(x, "_stringField1", js.undefined)
    
    @scala.inline
    def set_stringField2(value: String): Self = StObject.set(x, "_stringField2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stringField2Undefined: Self = StObject.set(x, "_stringField2", js.undefined)
    
    @scala.inline
    def set_stringField3(value: String): Self = StObject.set(x, "_stringField3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stringField3Undefined: Self = StObject.set(x, "_stringField3", js.undefined)
    
    @scala.inline
    def set_stringField4(value: String): Self = StObject.set(x, "_stringField4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stringField4Undefined: Self = StObject.set(x, "_stringField4", js.undefined)
    
    @scala.inline
    def set_stringField5(value: String): Self = StObject.set(x, "_stringField5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stringField5Undefined: Self = StObject.set(x, "_stringField5", js.undefined)
    
    @scala.inline
    def set_thingType(value: String): Self = StObject.set(x, "_thingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_thingTypeUndefined: Self = StObject.set(x, "_thingType", js.undefined)
    
    @scala.inline
    def set_vendor(value: String): Self = StObject.set(x, "_vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vendorThingID(value: String): Self = StObject.set(x, "_vendorThingID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vendorUndefined: Self = StObject.set(x, "_vendor", js.undefined)
  }
}
