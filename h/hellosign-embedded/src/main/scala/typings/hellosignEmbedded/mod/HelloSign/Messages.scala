package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonconfigure
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonerror
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColoninitialize
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserCancelRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserCreateTemplate
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserDeclineRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserFinishRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserReassignRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserSendRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonuserSignRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonverifyDomainRequest
import typings.hellosignEmbedded.hellosignEmbeddedStrings.hellosignColonverifyDomainResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
  var APP_CONFIGURE: hellosignColonconfigure
  
  var APP_ERROR: hellosignColonerror
  
  var APP_INITIALIZE: hellosignColoninitialize
  
  var APP_VERIFY_DOMAIN_REQUEST: hellosignColonverifyDomainRequest
  
  var APP_VERIFY_DOMAIN_RESPONSE: hellosignColonverifyDomainResponse
  
  var USER_CANCEL_REQUEST: hellosignColonuserCancelRequest
  
  var USER_CREATE_TEMPLATE: hellosignColonuserCreateTemplate
  
  var USER_DECLINE_REQUEST: hellosignColonuserDeclineRequest
  
  var USER_FINISH_REQUEST: hellosignColonuserFinishRequest
  
  var USER_REASSIGN_REQUEST: hellosignColonuserReassignRequest
  
  var USER_SEND_REQUEST: hellosignColonuserSendRequest
  
  var USER_SIGN_REQUEST: hellosignColonuserSignRequest
}
object Messages {
  
  inline def apply(): Messages = {
    val __obj = js.Dynamic.literal(APP_CONFIGURE = "hellosign:configure", APP_ERROR = "hellosign:error", APP_INITIALIZE = "hellosign:initialize", APP_VERIFY_DOMAIN_REQUEST = "hellosign:verifyDomainRequest", APP_VERIFY_DOMAIN_RESPONSE = "hellosign:verifyDomainResponse", USER_CANCEL_REQUEST = "hellosign:userCancelRequest", USER_CREATE_TEMPLATE = "hellosign:userCreateTemplate", USER_DECLINE_REQUEST = "hellosign:userDeclineRequest", USER_FINISH_REQUEST = "hellosign:userFinishRequest", USER_REASSIGN_REQUEST = "hellosign:userReassignRequest", USER_SEND_REQUEST = "hellosign:userSendRequest", USER_SIGN_REQUEST = "hellosign:userSignRequest")
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
    
    inline def setAPP_CONFIGURE(value: hellosignColonconfigure): Self = StObject.set(x, "APP_CONFIGURE", value.asInstanceOf[js.Any])
    
    inline def setAPP_ERROR(value: hellosignColonerror): Self = StObject.set(x, "APP_ERROR", value.asInstanceOf[js.Any])
    
    inline def setAPP_INITIALIZE(value: hellosignColoninitialize): Self = StObject.set(x, "APP_INITIALIZE", value.asInstanceOf[js.Any])
    
    inline def setAPP_VERIFY_DOMAIN_REQUEST(value: hellosignColonverifyDomainRequest): Self = StObject.set(x, "APP_VERIFY_DOMAIN_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setAPP_VERIFY_DOMAIN_RESPONSE(value: hellosignColonverifyDomainResponse): Self = StObject.set(x, "APP_VERIFY_DOMAIN_RESPONSE", value.asInstanceOf[js.Any])
    
    inline def setUSER_CANCEL_REQUEST(value: hellosignColonuserCancelRequest): Self = StObject.set(x, "USER_CANCEL_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setUSER_CREATE_TEMPLATE(value: hellosignColonuserCreateTemplate): Self = StObject.set(x, "USER_CREATE_TEMPLATE", value.asInstanceOf[js.Any])
    
    inline def setUSER_DECLINE_REQUEST(value: hellosignColonuserDeclineRequest): Self = StObject.set(x, "USER_DECLINE_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setUSER_FINISH_REQUEST(value: hellosignColonuserFinishRequest): Self = StObject.set(x, "USER_FINISH_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setUSER_REASSIGN_REQUEST(value: hellosignColonuserReassignRequest): Self = StObject.set(x, "USER_REASSIGN_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setUSER_SEND_REQUEST(value: hellosignColonuserSendRequest): Self = StObject.set(x, "USER_SEND_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setUSER_SIGN_REQUEST(value: hellosignColonuserSignRequest): Self = StObject.set(x, "USER_SIGN_REQUEST", value.asInstanceOf[js.Any])
  }
}
