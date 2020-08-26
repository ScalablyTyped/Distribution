package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceQuerySqlget extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Should column names be included (in the first row)?. Default is true.
    */
  var hdrs: js.UndefOr[Boolean] = js.native
  /**
    * An SQL SELECT/SHOW/DESCRIBE statement.
    */
  var sql: js.UndefOr[String] = js.native
  /**
    * Should typed values be returned in the (JSON) response -- numbers for
    * numeric values and parsed geometries for KML values? Default is true.
    */
  var typed: js.UndefOr[Boolean] = js.native
}

object ParamsResourceQuerySqlget {
  @scala.inline
  def apply(): ParamsResourceQuerySqlget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySqlget]
  }
  @scala.inline
  implicit class ParamsResourceQuerySqlgetOps[Self <: ParamsResourceQuerySqlget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setHdrs(value: Boolean): Self = this.set("hdrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHdrs: Self = this.set("hdrs", js.undefined)
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSql: Self = this.set("sql", js.undefined)
    @scala.inline
    def setTyped(value: Boolean): Self = this.set("typed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTyped: Self = this.set("typed", js.undefined)
  }
  
}

