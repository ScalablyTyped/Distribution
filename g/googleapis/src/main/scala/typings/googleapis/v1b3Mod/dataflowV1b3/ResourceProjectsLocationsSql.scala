package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Sql")
@js.native
open class ResourceProjectsLocationsSql protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def validate(): GaxiosPromise[SchemaValidateResponse] = js.native
  def validate(callback: BodyResponseCallback[SchemaValidateResponse]): Unit = js.native
  def validate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaValidateResponse] = js.native
  def validate(params: ParamsResourceProjectsLocationsSqlValidate): GaxiosPromise[SchemaValidateResponse] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsSqlValidate,
    callback: BodyResponseCallback[SchemaValidateResponse]
  ): Unit = js.native
  def validate(
    params: ParamsResourceProjectsLocationsSqlValidate,
    options: BodyResponseCallback[Readable | SchemaValidateResponse],
    callback: BodyResponseCallback[Readable | SchemaValidateResponse]
  ): Unit = js.native
  def validate(params: ParamsResourceProjectsLocationsSqlValidate, options: MethodOptions): GaxiosPromise[SchemaValidateResponse] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsSqlValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaValidateResponse]
  ): Unit = js.native
  /**
    * Validates a GoogleSQL query for Cloud Dataflow syntax. Will always confirm the given query parses correctly, and if able to look up schema information from DataCatalog, will validate that the query analyzes properly as well.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.locations.sql.validate({
    *     // The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    *     location: 'placeholder-value',
    *     // Required. The ID of the Cloud Platform project that the job belongs to.
    *     projectId: 'placeholder-value',
    *     // The sql query to validate.
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errorMessage": "my_errorMessage",
    *   //   "queryInfo": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def validate(params: ParamsResourceProjectsLocationsSqlValidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsSqlValidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
