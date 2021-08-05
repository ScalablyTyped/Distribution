package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePipelinesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Caller must have WRITE access to the project in which this pipeline is
    * defined.
    */
  var pipelineId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePipelinesDelete {
  
  inline def apply(): ParamsResourcePipelinesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesDelete]
  }
  
  extension [Self <: ParamsResourcePipelinesDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPipelineId(value: String): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
  }
}
