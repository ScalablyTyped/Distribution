package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Savedadstyles")
@js.native
class ResourceAccountsSavedadstyles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.accounts.savedadstyles.get
    * @desc List a specific saved ad style for the specified account.
    * @alias adsense.accounts.savedadstyles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to get the saved ad style.
    * @param {string} params.savedAdStyleId Saved ad style to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(callback: BodyResponseCallback[SchemaSavedAdStyle]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(params: ParamsResourceAccountsSavedadstylesGet): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(params: ParamsResourceAccountsSavedadstylesGet, callback: BodyResponseCallback[SchemaSavedAdStyle]): Unit = js.native
  def get(
    params: ParamsResourceAccountsSavedadstylesGet,
    options: BodyResponseCallback[SchemaSavedAdStyle],
    callback: BodyResponseCallback[SchemaSavedAdStyle]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsSavedadstylesGet, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(
    params: ParamsResourceAccountsSavedadstylesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedAdStyle]
  ): Unit = js.native
  
  /**
    * adsense.accounts.savedadstyles.list
    * @desc List all saved ad styles in the specified account.
    * @alias adsense.accounts.savedadstyles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to list saved ad styles.
    * @param {integer=} params.maxResults The maximum number of saved ad styles to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved ad styles. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedAdStyles]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(params: ParamsResourceAccountsSavedadstylesList): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    options: BodyResponseCallback[SchemaSavedAdStyles],
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsSavedadstylesList, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
}
