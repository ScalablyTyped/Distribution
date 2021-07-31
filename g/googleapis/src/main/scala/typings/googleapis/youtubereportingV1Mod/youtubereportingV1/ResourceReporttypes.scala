package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Reporttypes")
@js.native
class ResourceReporttypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtubereporting.reportTypes.list
    * @desc Lists report types.
    * @alias youtubereporting.reportTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSystemManaged If set to true, also system-managed report types will be returned; otherwise only the report types that can be used to create new reporting jobs will be returned.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {integer=} params.pageSize Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListReportTypesResponse.next_page_token returned in response to the previous call to the `ListReportTypes` method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReportTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(params: ParamsResourceReporttypesList): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(
    params: ParamsResourceReporttypesList,
    callback: BodyResponseCallback[SchemaListReportTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceReporttypesList,
    options: BodyResponseCallback[SchemaListReportTypesResponse],
    callback: BodyResponseCallback[SchemaListReportTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReporttypesList, options: MethodOptions): GaxiosPromise[SchemaListReportTypesResponse] = js.native
  def list(
    params: ParamsResourceReporttypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportTypesResponse]
  ): Unit = js.native
}
