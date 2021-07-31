package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Resource$Transfers")
@js.native
class ResourceTransfers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * datatransfer.transfers.get
    * @desc Retrieves a data transfer request by its resource ID.
    * @alias datatransfer.transfers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dataTransferId ID of the resource to be retrieved. This is returned in the response from the insert method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(params: ParamsResourceTransfersGet): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(params: ParamsResourceTransfersGet, callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def get(
    params: ParamsResourceTransfersGet,
    options: BodyResponseCallback[SchemaDataTransfer],
    callback: BodyResponseCallback[SchemaDataTransfer]
  ): Unit = js.native
  def get(params: ParamsResourceTransfersGet, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(
    params: ParamsResourceTransfersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataTransfer]
  ): Unit = js.native
  
  /**
    * datatransfer.transfers.insert
    * @desc Inserts a data transfer request.
    * @alias datatransfer.transfers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DataTransfer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(params: ParamsResourceTransfersInsert): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(params: ParamsResourceTransfersInsert, callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def insert(
    params: ParamsResourceTransfersInsert,
    options: BodyResponseCallback[SchemaDataTransfer],
    callback: BodyResponseCallback[SchemaDataTransfer]
  ): Unit = js.native
  def insert(params: ParamsResourceTransfersInsert, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(
    params: ParamsResourceTransfersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataTransfer]
  ): Unit = js.native
  
  /**
    * datatransfer.transfers.list
    * @desc Lists the transfers for a customer by source user, destination
    * user, or status.
    * @alias datatransfer.transfers.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customerId Immutable ID of the Google Apps account.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100.
    * @param {string=} params.newOwnerUserId Destination user's profile ID.
    * @param {string=} params.oldOwnerUserId Source user's profile ID.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {string=} params.status Status of the transfer.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDataTransfersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(params: ParamsResourceTransfersList): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(
    params: ParamsResourceTransfersList,
    callback: BodyResponseCallback[SchemaDataTransfersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTransfersList,
    options: BodyResponseCallback[SchemaDataTransfersListResponse],
    callback: BodyResponseCallback[SchemaDataTransfersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTransfersList, options: MethodOptions): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(
    params: ParamsResourceTransfersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataTransfersListResponse]
  ): Unit = js.native
}
