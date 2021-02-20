package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountCustomerService extends StObject {
  
  /**
    * Customer service email.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Customer service phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * Customer service URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaAccountCustomerService {
  
  @scala.inline
  def apply(): SchemaAccountCustomerService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountCustomerService]
  }
  
  @scala.inline
  implicit class SchemaAccountCustomerServiceMutableBuilder[Self <: SchemaAccountCustomerService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
