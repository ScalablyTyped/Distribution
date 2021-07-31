package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePipelinesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Caller must have READ access to the project in which this pipeline is
    * defined.
    */
  var pipelineId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePipelinesGet {
  
  @scala.inline
  def apply(): ParamsResourcePipelinesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesGet]
  }
  
  @scala.inline
  implicit class ParamsResourcePipelinesGetMutableBuilder[Self <: ParamsResourcePipelinesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPipelineId(value: String): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
  }
}
