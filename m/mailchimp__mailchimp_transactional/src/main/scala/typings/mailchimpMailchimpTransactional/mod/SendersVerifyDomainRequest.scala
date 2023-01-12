package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersVerifyDomainRequest
  extends StObject
     with BaseRequest {
  
  /** domain name at which you can receive email */
  var domain: String
  
  /** a mailbox at the domain where the verification email should be sent */
  var mailbox: String
}
object SendersVerifyDomainRequest {
  
  inline def apply(domain: String, mailbox: String): SendersVerifyDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], mailbox = mailbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersVerifyDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendersVerifyDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setMailbox(value: String): Self = StObject.set(x, "mailbox", value.asInstanceOf[js.Any])
  }
}
