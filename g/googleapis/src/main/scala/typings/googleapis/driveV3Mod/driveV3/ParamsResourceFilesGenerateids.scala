package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesGenerateids
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The number of IDs to return.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The space in which the IDs can be used to create new files. Supported
    * values are 'drive' and 'appDataFolder'.
    */
  var space: js.UndefOr[String] = js.undefined
}
object ParamsResourceFilesGenerateids {
  
  @scala.inline
  def apply(): ParamsResourceFilesGenerateids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesGenerateids]
  }
  
  @scala.inline
  implicit class ParamsResourceFilesGenerateidsMutableBuilder[Self <: ParamsResourceFilesGenerateids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
