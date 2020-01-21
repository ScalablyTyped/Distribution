package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Savedadstyles")
@js.native
class ResourceSavedadstyles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.savedadstyles.get
    * @desc Get a specific saved ad style from the user's account.
    * @alias adsense.savedadstyles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.savedAdStyleId Saved ad style to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(callback: BodyResponseCallback[SchemaSavedAdStyle]): Unit = js.native
  def get(params: ParamsResourceSavedadstylesGet): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(params: ParamsResourceSavedadstylesGet, callback: BodyResponseCallback[SchemaSavedAdStyle]): Unit = js.native
  def get(
    params: ParamsResourceSavedadstylesGet,
    options: BodyResponseCallback[SchemaSavedAdStyle],
    callback: BodyResponseCallback[SchemaSavedAdStyle]
  ): Unit = js.native
  def get(params: ParamsResourceSavedadstylesGet, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(
    params: ParamsResourceSavedadstylesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedAdStyle]
  ): Unit = js.native
  /**
    * adsense.savedadstyles.list
    * @desc List all saved ad styles in the user's account.
    * @alias adsense.savedadstyles.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of saved ad styles to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved ad styles. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedAdStyles]): Unit = js.native
  def list(params: ParamsResourceSavedadstylesList): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(params: ParamsResourceSavedadstylesList, callback: BodyResponseCallback[SchemaSavedAdStyles]): Unit = js.native
  def list(
    params: ParamsResourceSavedadstylesList,
    options: BodyResponseCallback[SchemaSavedAdStyles],
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
  def list(params: ParamsResourceSavedadstylesList, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(
    params: ParamsResourceSavedadstylesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
}

