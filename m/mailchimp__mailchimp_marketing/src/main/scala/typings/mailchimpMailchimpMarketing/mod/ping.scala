package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ping {
  
  @JSImport("@mailchimp/mailchimp_marketing", "ping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A health check for the API that won't return any account-specific information.
    * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/APIHealthStatus}
    */
  inline def get(): APIHealthStatus | ErrorResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[APIHealthStatus | ErrorResponse]
  
  trait APIHealthStatus extends StObject {
    
    /**
      * The current status of the Mailchimp API.
      */
    var health_status: String
  }
  object APIHealthStatus {
    
    inline def apply(health_status: String): APIHealthStatus = {
      val __obj = js.Dynamic.literal(health_status = health_status.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIHealthStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APIHealthStatus] (val x: Self) extends AnyVal {
      
      inline def setHealth_status(value: String): Self = StObject.set(x, "health_status", value.asInstanceOf[js.Any])
    }
  }
}
