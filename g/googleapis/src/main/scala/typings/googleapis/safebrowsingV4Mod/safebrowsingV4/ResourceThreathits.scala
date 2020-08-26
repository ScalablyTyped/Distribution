package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threathits")
@js.native
class ResourceThreathits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.threatHits.create
    * @desc Reports a Safe Browsing threat list hit to Google. Only projects
    * with TRUSTED_REPORTER visibility can use this method.
    * @alias safebrowsing.threatHits.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ThreatHit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaEmpty] = js.native
  def create(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def create(params: ParamsResourceThreathitsCreate): GaxiosPromise[SchemaEmpty] = js.native
  def create(params: ParamsResourceThreathitsCreate, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def create(
    params: ParamsResourceThreathitsCreate,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def create(params: ParamsResourceThreathitsCreate, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def create(
    params: ParamsResourceThreathitsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

