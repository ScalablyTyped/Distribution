package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Orderdocuments")
@js.native
class ResourceOrderdocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.orderDocuments.get
    * @desc Gets one order document by ID.
    * @alias dfareporting.orderDocuments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Order document ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(callback: BodyResponseCallback[SchemaOrderDocument]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(params: ParamsResourceOrderdocumentsGet): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(params: ParamsResourceOrderdocumentsGet, callback: BodyResponseCallback[SchemaOrderDocument]): Unit = js.native
  def get(
    params: ParamsResourceOrderdocumentsGet,
    options: BodyResponseCallback[SchemaOrderDocument],
    callback: BodyResponseCallback[SchemaOrderDocument]
  ): Unit = js.native
  def get(params: ParamsResourceOrderdocumentsGet, options: MethodOptions): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(
    params: ParamsResourceOrderdocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderDocument]
  ): Unit = js.native
  
  /**
    * dfareporting.orderDocuments.list
    * @desc Retrieves a list of order documents, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.orderDocuments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.approved Select only order documents that have been approved by at least one user.
    * @param {string=} params.ids Select only order documents with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderId Select only order documents for specified orders.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.projectId Project ID for order documents.
    * @param {string=} params.searchString Allows searching for order documents by name or ID. Wildcards (*) are allowed. For example, "orderdocument*2015" will return order documents with names like "orderdocument June 2015", "orderdocument April 2015", or simply "orderdocument 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "orderdocument" will match order documents with name "my orderdocument", "orderdocument 2015", or simply "orderdocument".
    * @param {string=} params.siteId Select only order documents that are associated with these sites.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(params: ParamsResourceOrderdocumentsList): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    options: BodyResponseCallback[SchemaOrderDocumentsListResponse],
    callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrderdocumentsList, options: MethodOptions): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]
  ): Unit = js.native
}
