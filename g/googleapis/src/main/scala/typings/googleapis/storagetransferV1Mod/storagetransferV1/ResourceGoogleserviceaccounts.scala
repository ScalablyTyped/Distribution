package typings.googleapis.storagetransferV1Mod.storagetransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Googleserviceaccounts")
@js.native
class ResourceGoogleserviceaccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * storagetransfer.googleServiceAccounts.get
    * @desc Returns the Google service account that is used by Storage Transfer
    * Service to access buckets in the project where transfers run or in other
    * projects. Each Google service account is associated with one Google Cloud
    * Platform Console project. Users should add this service account to the
    * Google Cloud Storage bucket ACLs to grant access to Storage Transfer
    * Service. This service account is created and owned by Storage Transfer
    * Service and can only be used by Storage Transfer Service.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the Google Cloud Platform Console project that the
    * Google service
    *     // account is associated with.
    *     // Required.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.googleServiceAccounts.get(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storagetransfer.googleServiceAccounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the Google Cloud Platform Console project that the Google service account is associated with. Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleServiceAccount]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(params: ParamsResourceGoogleserviceaccountsGet): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    callback: BodyResponseCallback[SchemaGoogleServiceAccount]
  ): Unit = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    options: BodyResponseCallback[SchemaGoogleServiceAccount],
    callback: BodyResponseCallback[SchemaGoogleServiceAccount]
  ): Unit = js.native
  def get(params: ParamsResourceGoogleserviceaccountsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleServiceAccount]
  ): Unit = js.native
}
