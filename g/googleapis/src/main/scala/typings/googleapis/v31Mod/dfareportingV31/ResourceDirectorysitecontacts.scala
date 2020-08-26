package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Directorysitecontacts")
@js.native
class ResourceDirectorysitecontacts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.directorySiteContacts.get
    * @desc Gets one directory site contact by ID.
    * @alias dfareporting.directorySiteContacts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Directory site contact ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDirectorySiteContact] = js.native
  def get(callback: BodyResponseCallback[SchemaDirectorySiteContact]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectorySiteContact] = js.native
  def get(params: ParamsResourceDirectorysitecontactsGet): GaxiosPromise[SchemaDirectorySiteContact] = js.native
  def get(
    params: ParamsResourceDirectorysitecontactsGet,
    callback: BodyResponseCallback[SchemaDirectorySiteContact]
  ): Unit = js.native
  def get(
    params: ParamsResourceDirectorysitecontactsGet,
    options: BodyResponseCallback[SchemaDirectorySiteContact],
    callback: BodyResponseCallback[SchemaDirectorySiteContact]
  ): Unit = js.native
  def get(params: ParamsResourceDirectorysitecontactsGet, options: MethodOptions): GaxiosPromise[SchemaDirectorySiteContact] = js.native
  def get(
    params: ParamsResourceDirectorysitecontactsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySiteContact]
  ): Unit = js.native
  /**
    * dfareporting.directorySiteContacts.list
    * @desc Retrieves a list of directory site contacts, possibly filtered.
    * This method supports paging.
    * @alias dfareporting.directorySiteContacts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.directorySiteIds Select only directory site contacts with these directory site IDs. This is a required field.
    * @param {string=} params.ids Select only directory site contacts with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name, ID or email. Wildcards (*) are allowed. For example, "directory site contact*2015" will return objects with names like "directory site contact June 2015", "directory site contact April 2015", or simply "directory site contact 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "directory site contact" will match objects with name "my directory site contact", "directory site contact 2015", or simply "directory site contact".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDirectorySiteContactsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDirectorySiteContactsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectorySiteContactsListResponse] = js.native
  def list(params: ParamsResourceDirectorysitecontactsList): GaxiosPromise[SchemaDirectorySiteContactsListResponse] = js.native
  def list(
    params: ParamsResourceDirectorysitecontactsList,
    callback: BodyResponseCallback[SchemaDirectorySiteContactsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDirectorysitecontactsList,
    options: BodyResponseCallback[SchemaDirectorySiteContactsListResponse],
    callback: BodyResponseCallback[SchemaDirectorySiteContactsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDirectorysitecontactsList, options: MethodOptions): GaxiosPromise[SchemaDirectorySiteContactsListResponse] = js.native
  def list(
    params: ParamsResourceDirectorysitecontactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySiteContactsListResponse]
  ): Unit = js.native
}

