package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFlagsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Database type and version you want to retrieve flags for. By default,
    * this method returns flags for all database types and versions.
    */
  var databaseVersion: js.UndefOr[String] = js.undefined
}
object ParamsResourceFlagsList {
  
  @scala.inline
  def apply(): ParamsResourceFlagsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFlagsList]
  }
  
  @scala.inline
  implicit class ParamsResourceFlagsListMutableBuilder[Self <: ParamsResourceFlagsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDatabaseVersion(value: String): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
  }
}
