package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSubscriptionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of the subscription. It must have the format
    * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}`
    * must start with a letter, and contain only letters (`[A-Za-z]`), numbers
    * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
    * plus (`+`) or percent signs (`%`). It must be between 3 and 255
    * characters in length, and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateSubscriptionRequest] = js.undefined
}
object ParamsResourceProjectsSubscriptionsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsSubscriptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSubscriptionsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsSubscriptionsPatchMutableBuilder[Self <: ParamsResourceProjectsSubscriptionsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUpdateSubscriptionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
