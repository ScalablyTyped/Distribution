package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$V1")
@js.native
class ResourceV1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * firebasedynamiclinks.getLinkStats
    * @desc Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs, app
    * first opens, and app reopens.
    * @alias firebasedynamiclinks.getLinkStats
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.durationDays The span of time requested in days.
    * @param {string} params.dynamicLink Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    * @param {string=} params.sdkVersion Google SDK version. Version takes the form "$major.$minor.$patch"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLinkStats(): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(callback: BodyResponseCallback[SchemaDynamicLinkStats]): Unit = js.native
  def getLinkStats(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(params: ParamsResourceV1Getlinkstats): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(params: ParamsResourceV1Getlinkstats, callback: BodyResponseCallback[SchemaDynamicLinkStats]): Unit = js.native
  def getLinkStats(
    params: ParamsResourceV1Getlinkstats,
    options: BodyResponseCallback[SchemaDynamicLinkStats],
    callback: BodyResponseCallback[SchemaDynamicLinkStats]
  ): Unit = js.native
  def getLinkStats(params: ParamsResourceV1Getlinkstats, options: MethodOptions): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(
    params: ParamsResourceV1Getlinkstats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDynamicLinkStats]
  ): Unit = js.native
  
  /**
    * firebasedynamiclinks.installAttribution
    * @desc Get iOS strong/weak-match info for post-install attribution.
    * @alias firebasedynamiclinks.installAttribution
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetIosPostInstallAttributionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def installAttribution(): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]): Unit = js.native
  def installAttribution(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(params: ParamsResourceV1Installattribution): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]
  ): Unit = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    options: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse],
    callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]
  ): Unit = js.native
  def installAttribution(params: ParamsResourceV1Installattribution, options: MethodOptions): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]
  ): Unit = js.native
  
  /**
    * firebasedynamiclinks.reopenAttribution
    * @desc Get iOS reopen attribution for app universal link open deeplinking.
    * @alias firebasedynamiclinks.reopenAttribution
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetIosReopenAttributionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reopenAttribution(): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]): Unit = js.native
  def reopenAttribution(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(params: ParamsResourceV1Reopenattribution): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]
  ): Unit = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    options: BodyResponseCallback[SchemaGetIosReopenAttributionResponse],
    callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]
  ): Unit = js.native
  def reopenAttribution(params: ParamsResourceV1Reopenattribution, options: MethodOptions): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]
  ): Unit = js.native
}
