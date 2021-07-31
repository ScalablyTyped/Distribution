package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQuerySql
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Should column names be included (in the first row)?. Default is true.
    */
  var hdrs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An SQL SELECT/SHOW/DESCRIBE/INSERT/UPDATE/DELETE/CREATE statement.
    */
  var sql: js.UndefOr[String] = js.undefined
  
  /**
    * Should typed values be returned in the (JSON) response -- numbers for
    * numeric values and parsed geometries for KML values? Default is true.
    */
  var typed: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceQuerySql {
  
  @scala.inline
  def apply(): ParamsResourceQuerySql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySql]
  }
  
  @scala.inline
  implicit class ParamsResourceQuerySqlMutableBuilder[Self <: ParamsResourceQuerySql] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHdrs(value: Boolean): Self = StObject.set(x, "hdrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdrsUndefined: Self = StObject.set(x, "hdrs", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    @scala.inline
    def setTyped(value: Boolean): Self = StObject.set(x, "typed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedUndefined: Self = StObject.set(x, "typed", js.undefined)
  }
}
