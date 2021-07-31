package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Languages")
@js.native
class ResourceLanguages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.languages.list
    * @desc Retrieves a list of languages.
    * @alias dfareporting.languages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLanguagesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(params: ParamsResourceLanguagesList): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(params: ParamsResourceLanguagesList, callback: BodyResponseCallback[SchemaLanguagesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: BodyResponseCallback[SchemaLanguagesListResponse],
    callback: BodyResponseCallback[SchemaLanguagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLanguagesList, options: MethodOptions): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLanguagesListResponse]
  ): Unit = js.native
}
