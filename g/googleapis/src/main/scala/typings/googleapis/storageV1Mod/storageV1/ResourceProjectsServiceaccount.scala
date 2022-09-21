package typings.googleapis.storageV1Mod.storageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Projects$Serviceaccount")
@js.native
open class ResourceProjectsServiceaccount protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(params: ParamsResourceProjectsServiceaccountGet): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountGet,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountGet,
    options: BodyResponseCallback[Readable | SchemaServiceAccount],
    callback: BodyResponseCallback[Readable | SchemaServiceAccount]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsServiceaccountGet, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  /**
    * Get the email address of this project's Google Cloud Storage service account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storage = google.storage('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storage.projects.serviceAccount.get({
    *     // Project ID
    *     projectId: 'placeholder-value',
    *     // The project to be billed for this request.
    *     userProject: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email_address": "my_email_address",
    *   //   "kind": "my_kind"
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
  def get(params: ParamsResourceProjectsServiceaccountGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsServiceaccountGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
