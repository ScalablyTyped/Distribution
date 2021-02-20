package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Apps")
@js.native
class ResourceApps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.apps.get
    * @desc Gets a specific app.
    * @alias drive.apps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appId The ID of the app.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaApp] = js.native
  def get(callback: BodyResponseCallback[SchemaApp]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApp] = js.native
  def get(params: ParamsResourceAppsGet): GaxiosPromise[SchemaApp] = js.native
  def get(params: ParamsResourceAppsGet, callback: BodyResponseCallback[SchemaApp]): Unit = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: BodyResponseCallback[SchemaApp],
    callback: BodyResponseCallback[SchemaApp]
  ): Unit = js.native
  def get(params: ParamsResourceAppsGet, options: MethodOptions): GaxiosPromise[SchemaApp] = js.native
  def get(params: ParamsResourceAppsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaApp]): Unit = js.native
  
  /**
    * drive.apps.list
    * @desc Lists a user's installed apps.
    * @alias drive.apps.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.appFilterExtensions A comma-separated list of file extensions for open with filtering. All apps within the given app query scope which can open any of the given file extensions will be included in the response. If appFilterMimeTypes are provided as well, the result is a union of the two resulting app lists.
    * @param {string=} params.appFilterMimeTypes A comma-separated list of MIME types for open with filtering. All apps within the given app query scope which can open any of the given MIME types will be included in the response. If appFilterExtensions are provided as well, the result is a union of the two resulting app lists.
    * @param {string=} params.languageCode A language or locale code, as defined by BCP 47, with some extensions from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAppList] = js.native
  def list(callback: BodyResponseCallback[SchemaAppList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppList] = js.native
  def list(params: ParamsResourceAppsList): GaxiosPromise[SchemaAppList] = js.native
  def list(params: ParamsResourceAppsList, callback: BodyResponseCallback[SchemaAppList]): Unit = js.native
  def list(
    params: ParamsResourceAppsList,
    options: BodyResponseCallback[SchemaAppList],
    callback: BodyResponseCallback[SchemaAppList]
  ): Unit = js.native
  def list(params: ParamsResourceAppsList, options: MethodOptions): GaxiosPromise[SchemaAppList] = js.native
  def list(
    params: ParamsResourceAppsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppList]
  ): Unit = js.native
}
