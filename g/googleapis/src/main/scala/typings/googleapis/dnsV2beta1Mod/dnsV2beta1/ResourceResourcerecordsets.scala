package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Resourcerecordsets")
@js.native
open class ResourceResourcerecordsets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(params: ParamsResourceResourcerecordsetsList): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: BodyResponseCallback[Readable | SchemaResourceRecordSetsListResponse],
    callback: BodyResponseCallback[Readable | SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResourcerecordsetsList, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  /**
    * dns.resourceRecordSets.list
    * @desc Enumerate ResourceRecordSets that have been created but not yet deleted.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.resourceRecordSets.list({
    *     // Identifies the managed zone addressed by this request. Can be the managed
    *     // zone name or id.
    *     managedZone: 'placeholder-value',
    *     // Optional. Maximum number of results to be returned. If unspecified, the
    *     // server will decide how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Restricts the list to return only records with this fully qualified domain
    *     // name.
    *     name: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated.
    *     // Use this parameter to continue a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // Restricts the list to return only records of this type. If present, the
    *     // "name" parameter must also be present.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rrsets": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias dns.resourceRecordSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone Identifies the managed zone addressed by this request. Can be the managed zone name or id.
    * @param {integer=} params.maxResults Optional. Maximum number of results to be returned. If unspecified, the server will decide how many results to return.
    * @param {string=} params.name Restricts the list to return only records with this fully qualified domain name.
    * @param {string=} params.pageToken Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {string=} params.type Restricts the list to return only records of this type. If present, the "name" parameter must also be present.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceResourcerecordsetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
