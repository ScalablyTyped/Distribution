package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Targetingtemplates")
@js.native
class ResourceTargetingtemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.targetingTemplates.get
    * @desc Gets one targeting template by ID.
    * @alias dfareporting.targetingTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Targeting template ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(params: ParamsResourceTargetingtemplatesGet): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    options: BodyResponseCallback[SchemaTargetingTemplate],
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceTargetingtemplatesGet, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def get(
    params: ParamsResourceTargetingtemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  
  /**
    * dfareporting.targetingTemplates.insert
    * @desc Inserts a new targeting template.
    * @alias dfareporting.targetingTemplates.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().TargetingTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(params: ParamsResourceTargetingtemplatesInsert): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    options: BodyResponseCallback[SchemaTargetingTemplate],
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def insert(params: ParamsResourceTargetingtemplatesInsert, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def insert(
    params: ParamsResourceTargetingtemplatesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  
  /**
    * dfareporting.targetingTemplates.list
    * @desc Retrieves a list of targeting templates, optionally filtered. This
    * method supports paging.
    * @alias dfareporting.targetingTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only targeting templates with this advertiser ID.
    * @param {string=} params.ids Select only targeting templates with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "template*2015" will return objects with names like "template June 2015", "template April 2015", or simply "template 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "template" will match objects with name "my template", "template 2015", or simply "template".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(params: ParamsResourceTargetingtemplatesList): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    options: BodyResponseCallback[SchemaTargetingTemplatesListResponse],
    callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTargetingtemplatesList, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplatesListResponse] = js.native
  def list(
    params: ParamsResourceTargetingtemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplatesListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.targetingTemplates.patch
    * @desc Updates an existing targeting template. This method supports patch
    * semantics.
    * @alias dfareporting.targetingTemplates.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Targeting template ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().TargetingTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(params: ParamsResourceTargetingtemplatesPatch): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    options: BodyResponseCallback[SchemaTargetingTemplate],
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def patch(params: ParamsResourceTargetingtemplatesPatch, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def patch(
    params: ParamsResourceTargetingtemplatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  
  /**
    * dfareporting.targetingTemplates.update
    * @desc Updates an existing targeting template.
    * @alias dfareporting.targetingTemplates.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().TargetingTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(callback: BodyResponseCallback[SchemaTargetingTemplate]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(params: ParamsResourceTargetingtemplatesUpdate): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    options: BodyResponseCallback[SchemaTargetingTemplate],
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
  def update(params: ParamsResourceTargetingtemplatesUpdate, options: MethodOptions): GaxiosPromise[SchemaTargetingTemplate] = js.native
  def update(
    params: ParamsResourceTargetingtemplatesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingTemplate]
  ): Unit = js.native
}
