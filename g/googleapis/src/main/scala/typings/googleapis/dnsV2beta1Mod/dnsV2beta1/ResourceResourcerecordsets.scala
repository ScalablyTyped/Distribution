package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Resourcerecordsets")
@js.native
class ResourceResourcerecordsets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.resourceRecordSets.list
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud DNS API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dns
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
    * var dns = google.dns('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request. Can be the
    * managed zone name or id. managedZone: 'my-managed-zone',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var rrsetsPage = response['rrsets'];
    *     if (!rrsetsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < rrsetsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `rrsetsPage`: console.log(JSON.stringify(rrsetsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       dns.resourceRecordSets.list(request, handlePage);
    *     }
    *   };
    *
    *   dns.resourceRecordSets.list(request, handlePage);
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
    * @alias dns.resourceRecordSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.name
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.type
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(params: ParamsResourceResourcerecordsetsList): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: BodyResponseCallback[SchemaResourceRecordSetsListResponse],
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResourcerecordsetsList, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
}
