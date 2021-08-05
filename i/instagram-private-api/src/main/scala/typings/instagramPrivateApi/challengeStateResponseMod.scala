package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountRepositoryLoginResponseMod.AccountRepositoryLoginResponseLoggedInUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object challengeStateResponseMod {
  
  trait ChallengeRepositoryStateResponseStepData extends StObject {
    
    var big_blue_token: String
    
    var choice: String
    
    var contact_point: String
    
    var email: String
    
    var fb_access_token: String
    
    var form_type: String
    
    var google_oauth_token: String
    
    var resend_delay: Double
    
    var security_code: String
  }
  object ChallengeRepositoryStateResponseStepData {
    
    inline def apply(
      big_blue_token: String,
      choice: String,
      contact_point: String,
      email: String,
      fb_access_token: String,
      form_type: String,
      google_oauth_token: String,
      resend_delay: Double,
      security_code: String
    ): ChallengeRepositoryStateResponseStepData = {
      val __obj = js.Dynamic.literal(big_blue_token = big_blue_token.asInstanceOf[js.Any], choice = choice.asInstanceOf[js.Any], contact_point = contact_point.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fb_access_token = fb_access_token.asInstanceOf[js.Any], form_type = form_type.asInstanceOf[js.Any], google_oauth_token = google_oauth_token.asInstanceOf[js.Any], resend_delay = resend_delay.asInstanceOf[js.Any], security_code = security_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengeRepositoryStateResponseStepData]
    }
    
    extension [Self <: ChallengeRepositoryStateResponseStepData](x: Self) {
      
      inline def setBig_blue_token(value: String): Self = StObject.set(x, "big_blue_token", value.asInstanceOf[js.Any])
      
      inline def setChoice(value: String): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
      
      inline def setContact_point(value: String): Self = StObject.set(x, "contact_point", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFb_access_token(value: String): Self = StObject.set(x, "fb_access_token", value.asInstanceOf[js.Any])
      
      inline def setForm_type(value: String): Self = StObject.set(x, "form_type", value.asInstanceOf[js.Any])
      
      inline def setGoogle_oauth_token(value: String): Self = StObject.set(x, "google_oauth_token", value.asInstanceOf[js.Any])
      
      inline def setResend_delay(value: Double): Self = StObject.set(x, "resend_delay", value.asInstanceOf[js.Any])
      
      inline def setSecurity_code(value: String): Self = StObject.set(x, "security_code", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChallengeStateResponse extends StObject {
    
    var action: String
    
    var logged_in_user: js.UndefOr[AccountRepositoryLoginResponseLoggedInUser] = js.undefined
    
    var nonce_code: String
    
    var status: String
    
    var step_data: ChallengeRepositoryStateResponseStepData
    
    var step_name: String
    
    var user_id: Double
  }
  object ChallengeStateResponse {
    
    inline def apply(
      action: String,
      nonce_code: String,
      status: String,
      step_data: ChallengeRepositoryStateResponseStepData,
      step_name: String,
      user_id: Double
    ): ChallengeStateResponse = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], nonce_code = nonce_code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], step_data = step_data.asInstanceOf[js.Any], step_name = step_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengeStateResponse]
    }
    
    extension [Self <: ChallengeStateResponse](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLogged_in_user(value: AccountRepositoryLoginResponseLoggedInUser): Self = StObject.set(x, "logged_in_user", value.asInstanceOf[js.Any])
      
      inline def setLogged_in_userUndefined: Self = StObject.set(x, "logged_in_user", js.undefined)
      
      inline def setNonce_code(value: String): Self = StObject.set(x, "nonce_code", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStep_data(value: ChallengeRepositoryStateResponseStepData): Self = StObject.set(x, "step_data", value.asInstanceOf[js.Any])
      
      inline def setStep_name(value: String): Self = StObject.set(x, "step_name", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
}
