package typings.googleapis.driveactivityV2Mod.driveactivityV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/driveactivity/v2", "driveactivity_v2.Resource$Activity")
@js.native
class ResourceActivity protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * driveactivity.activity.query
    * @desc Query past activity in Google Drive.
    * @alias driveactivity.activity.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QueryDriveActivityRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]): Unit = js.native
  def query(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(params: ParamsResourceActivityQuery): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(
    params: ParamsResourceActivityQuery,
    callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]
  ): Unit = js.native
  def query(
    params: ParamsResourceActivityQuery,
    options: BodyResponseCallback[SchemaQueryDriveActivityResponse],
    callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]
  ): Unit = js.native
  def query(params: ParamsResourceActivityQuery, options: MethodOptions): GaxiosPromise[SchemaQueryDriveActivityResponse] = js.native
  def query(
    params: ParamsResourceActivityQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryDriveActivityResponse]
  ): Unit = js.native
}
