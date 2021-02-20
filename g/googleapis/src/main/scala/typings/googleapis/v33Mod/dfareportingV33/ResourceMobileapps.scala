package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Mobileapps")
@js.native
class ResourceMobileapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.mobileApps.get
    * @desc Gets one mobile app by ID.
    * @alias dfareporting.mobileApps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Mobile app ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMobileApp] = js.native
  def get(callback: BodyResponseCallback[SchemaMobileApp]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMobileApp] = js.native
  def get(params: ParamsResourceMobileappsGet): GaxiosPromise[SchemaMobileApp] = js.native
  def get(params: ParamsResourceMobileappsGet, callback: BodyResponseCallback[SchemaMobileApp]): Unit = js.native
  def get(
    params: ParamsResourceMobileappsGet,
    options: BodyResponseCallback[SchemaMobileApp],
    callback: BodyResponseCallback[SchemaMobileApp]
  ): Unit = js.native
  def get(params: ParamsResourceMobileappsGet, options: MethodOptions): GaxiosPromise[SchemaMobileApp] = js.native
  def get(
    params: ParamsResourceMobileappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileApp]
  ): Unit = js.native
  
  /**
    * dfareporting.mobileApps.list
    * @desc Retrieves list of available mobile apps.
    * @alias dfareporting.mobileApps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.directories Select only apps from these directories.
    * @param {string=} params.ids Select only apps with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "app*2015" will return objects with names like "app Jan 2018", "app Jan 2018", or simply "app 2018". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "app" will match objects with name "my app", "app 2018", or simply "app".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMobileAppsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(params: ParamsResourceMobileappsList): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(params: ParamsResourceMobileappsList, callback: BodyResponseCallback[SchemaMobileAppsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceMobileappsList,
    options: BodyResponseCallback[SchemaMobileAppsListResponse],
    callback: BodyResponseCallback[SchemaMobileAppsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMobileappsList, options: MethodOptions): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(
    params: ParamsResourceMobileappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileAppsListResponse]
  ): Unit = js.native
}
