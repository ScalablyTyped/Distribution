package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/connection", "Connection")
@js.native
class Connection protected () extends BaseConnection {
  def this(params: ConnectionOptions) = this()
  var accessToken: java.lang.String = js.native
  var analytics: jsforceLib.apiAnalyticsMod.Analytics = js.native
  var apex: jsforceLib.apiApexMod.Apex = js.native
  var bulk: jsforceLib.bulkMod.Bulk = js.native
  var cache: jsforceLib.cacheMod.Cache = js.native
  var chatter: jsforceLib.apiChatterMod.Chatter = js.native
  // Specific to Connection
  var instanceUrl: java.lang.String = js.native
  var metadata: jsforceLib.apiMetadataMod.Metadata = js.native
  var oauth2: jsforceLib.jsforceMod.OAuth2 = js.native
  var streaming: jsforceLib.jsforceMod.Streaming = js.native
  var tooling: Tooling = js.native
  var version: java.lang.String = js.native
  def authorize(code: java.lang.String): js.Promise[UserInfo] = js.native
  def authorize(
    code: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ UserInfo, scala.Unit]
  ): js.Promise[UserInfo] = js.native
  def initialize(): scala.Unit = js.native
  def initialize(options: ConnectionOptions): scala.Unit = js.native
  def limits(): js.Promise[jsforceLib.limitsDashInfoMod.LimitsInfo] = js.native
  def limits(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]): js.Promise[jsforceLib.limitsDashInfoMod.LimitsInfo] = js.native
  def login(user: java.lang.String, password: java.lang.String): js.Promise[UserInfo] = js.native
  def login(
    user: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ UserInfo, scala.Unit]
  ): js.Promise[UserInfo] = js.native
  def loginByOAuth2(user: java.lang.String, password: java.lang.String): js.Promise[UserInfo] = js.native
  def loginByOAuth2(
    user: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ UserInfo, scala.Unit]
  ): js.Promise[UserInfo] = js.native
  def loginBySoap(user: java.lang.String, password: java.lang.String): js.Promise[UserInfo] = js.native
  def loginBySoap(
    user: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ UserInfo, scala.Unit]
  ): js.Promise[UserInfo] = js.native
  def logout(): js.Promise[scala.Unit] = js.native
  def logout(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]): js.Promise[scala.Unit] = js.native
  def logout(revoke: scala.Boolean): js.Promise[scala.Unit] = js.native
  def logout(
    revoke: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def logoutByOAuth2(): js.Promise[scala.Unit] = js.native
  def logoutByOAuth2(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]): js.Promise[scala.Unit] = js.native
  def logoutByOAuth2(revoke: scala.Boolean): js.Promise[scala.Unit] = js.native
  def logoutByOAuth2(
    revoke: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def logoutBySoap(): js.Promise[scala.Unit] = js.native
  def logoutBySoap(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]): js.Promise[scala.Unit] = js.native
  def logoutBySoap(revoke: scala.Boolean): js.Promise[scala.Unit] = js.native
  def logoutBySoap(
    revoke: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.UndefOr[scala.Nothing], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def queryAll[T](soql: java.lang.String): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryAll[T](soql: java.lang.String, options: js.Object): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryAll[T](
    soql: java.lang.String,
    options: js.Object,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ jsforceLib.queryMod.QueryResult[T], scala.Unit]
  ): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
}

