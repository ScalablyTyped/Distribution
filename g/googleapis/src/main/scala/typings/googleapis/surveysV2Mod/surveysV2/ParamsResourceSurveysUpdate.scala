package typings.googleapis.surveysV2Mod.surveysV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSurveysUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSurvey] = js.undefined
  
  /**
    * External URL ID for the survey.
    */
  var surveyUrlId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSurveysUpdate {
  
  @scala.inline
  def apply(): ParamsResourceSurveysUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSurveysUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceSurveysUpdateMutableBuilder[Self <: ParamsResourceSurveysUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSurvey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSurveyUrlId(value: String): Self = StObject.set(x, "surveyUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyUrlIdUndefined: Self = StObject.set(x, "surveyUrlId", js.undefined)
  }
}
