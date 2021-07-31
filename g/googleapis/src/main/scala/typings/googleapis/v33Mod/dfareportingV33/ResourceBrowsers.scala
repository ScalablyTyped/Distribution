package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Browsers")
@js.native
class ResourceBrowsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.browsers.list
    * @desc Retrieves a list of browsers.
    * @alias dfareporting.browsers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBrowsersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(params: ParamsResourceBrowsersList): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(params: ParamsResourceBrowsersList, callback: BodyResponseCallback[SchemaBrowsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceBrowsersList,
    options: BodyResponseCallback[SchemaBrowsersListResponse],
    callback: BodyResponseCallback[SchemaBrowsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBrowsersList, options: MethodOptions): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(
    params: ParamsResourceBrowsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBrowsersListResponse]
  ): Unit = js.native
}
