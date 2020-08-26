package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Accountuserprofiles")
@js.native
class ResourceAccountuserprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.accountUserProfiles.get
    * @desc Gets one account user profile by ID.
    * @alias dfareporting.accountUserProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User profile ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(params: ParamsResourceAccountuserprofilesGet): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    options: BodyResponseCallback[SchemaAccountUserProfile],
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def get(params: ParamsResourceAccountuserprofilesGet, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.insert
    * @desc Inserts a new account user profile.
    * @alias dfareporting.accountUserProfiles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AccountUserProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(params: ParamsResourceAccountuserprofilesInsert): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    options: BodyResponseCallback[SchemaAccountUserProfile],
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def insert(params: ParamsResourceAccountuserprofilesInsert, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.list
    * @desc Retrieves a list of account user profiles, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.accountUserProfiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active user profiles.
    * @param {string=} params.ids Select only user profiles with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name, ID or email. Wildcards (*) are allowed. For example, "user profile*2015" will return objects with names like "user profile June 2015", "user profile April 2015", or simply "user profile 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "user profile" will match objects with name "my user profile", "user profile 2015", or simply "user profile".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only user profiles with the specified subaccount ID.
    * @param {string=} params.userRoleId Select only user profiles with the specified user role ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(params: ParamsResourceAccountuserprofilesList): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    options: BodyResponseCallback[SchemaAccountUserProfilesListResponse],
    callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountuserprofilesList, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.patch
    * @desc Updates an existing account user profile. This method supports
    * patch semantics.
    * @alias dfareporting.accountUserProfiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User profile ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AccountUserProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(params: ParamsResourceAccountuserprofilesPatch): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    options: BodyResponseCallback[SchemaAccountUserProfile],
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountuserprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.update
    * @desc Updates an existing account user profile.
    * @alias dfareporting.accountUserProfiles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AccountUserProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(params: ParamsResourceAccountuserprofilesUpdate): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    options: BodyResponseCallback[SchemaAccountUserProfile],
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def update(params: ParamsResourceAccountuserprofilesUpdate, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
}

