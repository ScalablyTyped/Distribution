package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountBusinessInformation extends StObject {
  
  /**
    * The address of the business.
    */
  var address: js.UndefOr[SchemaAccountAddress] = js.undefined
  
  /**
    * The customer service information of the business.
    */
  var customerService: js.UndefOr[SchemaAccountCustomerService] = js.undefined
  
  /**
    * The phone number of the business.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object SchemaAccountBusinessInformation {
  
  @scala.inline
  def apply(): SchemaAccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountBusinessInformation]
  }
  
  @scala.inline
  implicit class SchemaAccountBusinessInformationMutableBuilder[Self <: SchemaAccountBusinessInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SchemaAccountAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCustomerService(value: SchemaAccountCustomerService): Self = StObject.set(x, "customerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerServiceUndefined: Self = StObject.set(x, "customerService", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
