package typings.googleapis.surveysV2Mod.surveysV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSurveysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * External URL ID for the survey.
    */
  var surveyUrlId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSurveysGet {
  
  inline def apply(): ParamsResourceSurveysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSurveysGet]
  }
  
  extension [Self <: ParamsResourceSurveysGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setSurveyUrlId(value: String): Self = StObject.set(x, "surveyUrlId", value.asInstanceOf[js.Any])
    
    inline def setSurveyUrlIdUndefined: Self = StObject.set(x, "surveyUrlId", js.undefined)
  }
}
