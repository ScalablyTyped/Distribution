package typings.hellosignSdk.mod

import typings.hellosignSdk.hellosignSdkStrings.bank_account_number
import typings.hellosignSdk.hellosignSdkStrings.bank_routing_number
import typings.hellosignSdk.hellosignSdkStrings.custom_regex
import typings.hellosignSdk.hellosignSdkStrings.email_address
import typings.hellosignSdk.hellosignSdkStrings.employer_identification_number
import typings.hellosignSdk.hellosignSdkStrings.letters_only
import typings.hellosignSdk.hellosignSdkStrings.numbers_only
import typings.hellosignSdk.hellosignSdkStrings.phone_number
import typings.hellosignSdk.hellosignSdkStrings.social_security_number
import typings.hellosignSdk.hellosignSdkStrings.zip_code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormField extends StObject {
  
  var api_id: String
  
  var height: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var page: Double
  
  var required: Boolean
  
  var signer: Double
  
  var `type`: Field
  
  var validation_type: js.UndefOr[
    numbers_only | letters_only | phone_number | bank_routing_number | bank_account_number | email_address | zip_code | social_security_number | employer_identification_number | custom_regex
  ] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object FormField {
  
  inline def apply(
    api_id: String,
    height: Double,
    page: Double,
    required: Boolean,
    signer: Double,
    `type`: Field,
    width: Double,
    x: Double,
    y: Double
  ): FormField = {
    val __obj = js.Dynamic.literal(api_id = api_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormField] (val x: Self) extends AnyVal {
    
    inline def setApi_id(value: String): Self = StObject.set(x, "api_id", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSigner(value: Double): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setType(value: Field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidation_type(
      value: numbers_only | letters_only | phone_number | bank_routing_number | bank_account_number | email_address | zip_code | social_security_number | employer_identification_number | custom_regex
    ): Self = StObject.set(x, "validation_type", value.asInstanceOf[js.Any])
    
    inline def setValidation_typeUndefined: Self = StObject.set(x, "validation_type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
