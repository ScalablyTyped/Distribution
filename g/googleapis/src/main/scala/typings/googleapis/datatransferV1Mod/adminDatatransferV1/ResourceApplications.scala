package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Resource$Applications")
@js.native
class ResourceApplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * datatransfer.applications.get
    * @desc Retrieves information about an application for the given
    * application ID.
    * @alias datatransfer.applications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId ID of the application resource to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet, callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: BodyResponseCallback[SchemaApplication],
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceApplicationsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  
  /**
    * datatransfer.applications.list
    * @desc Lists the applications available for data transfer for a customer.
    * @alias datatransfer.applications.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customerId Immutable ID of the Google Apps account.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100.
    * @param {string=} params.pageToken Token to specify next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApplicationsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(params: ParamsResourceApplicationsList): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(
    params: ParamsResourceApplicationsList,
    callback: BodyResponseCallback[SchemaApplicationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceApplicationsList,
    options: BodyResponseCallback[SchemaApplicationsListResponse],
    callback: BodyResponseCallback[SchemaApplicationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceApplicationsList, options: MethodOptions): GaxiosPromise[SchemaApplicationsListResponse] = js.native
  def list(
    params: ParamsResourceApplicationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplicationsListResponse]
  ): Unit = js.native
}
