package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Revisions")
@js.native
class ResourceRevisions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * games.revisions.check
    * @desc Checks whether the games client is out of date.
    * @alias games.revisions.check
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clientRevision The revision of the client SDK used by your application. Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible values of PLATFORM_TYPE are:   - "ANDROID" - Client is running the Android SDK.  - "IOS" - Client is running the iOS SDK.  - "WEB_APP" - Client is running as a Web App.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def check(): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(callback: BodyResponseCallback[SchemaRevisionCheckResponse]): Unit = js.native
  def check(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(params: ParamsResourceRevisionsCheck): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(params: ParamsResourceRevisionsCheck, callback: BodyResponseCallback[SchemaRevisionCheckResponse]): Unit = js.native
  def check(
    params: ParamsResourceRevisionsCheck,
    options: BodyResponseCallback[SchemaRevisionCheckResponse],
    callback: BodyResponseCallback[SchemaRevisionCheckResponse]
  ): Unit = js.native
  def check(params: ParamsResourceRevisionsCheck, options: MethodOptions): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(
    params: ParamsResourceRevisionsCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevisionCheckResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
