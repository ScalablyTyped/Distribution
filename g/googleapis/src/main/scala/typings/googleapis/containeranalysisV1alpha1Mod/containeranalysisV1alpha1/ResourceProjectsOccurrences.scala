package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Occurrences")
@js.native
open class ResourceProjectsOccurrences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOccurrence] = js.native
  def create(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def create(params: ParamsResourceProjectsOccurrencesCreate): GaxiosPromise[SchemaOccurrence] = js.native
  def create(params: ParamsResourceProjectsOccurrencesCreate, callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def create(
    params: ParamsResourceProjectsOccurrencesCreate,
    options: BodyResponseCallback[Readable | SchemaOccurrence],
    callback: BodyResponseCallback[Readable | SchemaOccurrence]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsOccurrencesCreate, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def create(
    params: ParamsResourceProjectsOccurrencesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  /**
    * Creates a new `Occurrence`. Use this method to create `Occurrences` for a resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.create({
    *     // The name of the project. Should be of the form "projects/{project_id\}". @Deprecated
    *     name: 'placeholder-value',
    *     // This field contains the project Id for example: "projects/{project_id\}"
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attestation": {},
    *       //   "buildDetails": {},
    *       //   "compliance": {},
    *       //   "createTime": "my_createTime",
    *       //   "deployment": {},
    *       //   "derivedImage": {},
    *       //   "discovered": {},
    *       //   "dsseAttestation": {},
    *       //   "envelope": {},
    *       //   "installation": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "noteName": "my_noteName",
    *       //   "remediation": "my_remediation",
    *       //   "resource": {},
    *       //   "resourceUrl": "my_resourceUrl",
    *       //   "sbom": {},
    *       //   "spdxFile": {},
    *       //   "spdxPackage": {},
    *       //   "spdxRelationship": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "upgrade": {},
    *       //   "vulnerabilityDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attestation": {},
    *   //   "buildDetails": {},
    *   //   "compliance": {},
    *   //   "createTime": "my_createTime",
    *   //   "deployment": {},
    *   //   "derivedImage": {},
    *   //   "discovered": {},
    *   //   "dsseAttestation": {},
    *   //   "envelope": {},
    *   //   "installation": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "noteName": "my_noteName",
    *   //   "remediation": "my_remediation",
    *   //   "resource": {},
    *   //   "resourceUrl": "my_resourceUrl",
    *   //   "sbom": {},
    *   //   "spdxFile": {},
    *   //   "spdxPackage": {},
    *   //   "spdxRelationship": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "upgrade": {},
    *   //   "vulnerabilityDetails": {}
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
  def create(params: ParamsResourceProjectsOccurrencesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsOccurrencesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsOccurrencesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsOccurrencesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsOccurrencesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsOccurrencesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsOccurrencesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the given `Occurrence` from the system. Use this when an `Occurrence` is no longer applicable for the given resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.delete({
    *     // The name of the occurrence in the form of "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}"
    *     name: 'projects/my-project/occurrences/my-occurrence',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsOccurrencesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsOccurrencesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaOccurrence] = js.native
  def get(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def get(params: ParamsResourceProjectsOccurrencesGet): GaxiosPromise[SchemaOccurrence] = js.native
  def get(params: ParamsResourceProjectsOccurrencesGet, callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def get(
    params: ParamsResourceProjectsOccurrencesGet,
    options: BodyResponseCallback[Readable | SchemaOccurrence],
    callback: BodyResponseCallback[Readable | SchemaOccurrence]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsOccurrencesGet, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def get(
    params: ParamsResourceProjectsOccurrencesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  /**
    * Returns the requested `Occurrence`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.get({
    *     // The name of the occurrence of the form "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}"
    *     name: 'projects/my-project/occurrences/my-occurrence',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attestation": {},
    *   //   "buildDetails": {},
    *   //   "compliance": {},
    *   //   "createTime": "my_createTime",
    *   //   "deployment": {},
    *   //   "derivedImage": {},
    *   //   "discovered": {},
    *   //   "dsseAttestation": {},
    *   //   "envelope": {},
    *   //   "installation": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "noteName": "my_noteName",
    *   //   "remediation": "my_remediation",
    *   //   "resource": {},
    *   //   "resourceUrl": "my_resourceUrl",
    *   //   "sbom": {},
    *   //   "spdxFile": {},
    *   //   "spdxPackage": {},
    *   //   "spdxRelationship": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "upgrade": {},
    *   //   "vulnerabilityDetails": {}
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
  def get(params: ParamsResourceProjectsOccurrencesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsOccurrencesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsOccurrencesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsOccurrencesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a note or an `Occurrence` resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. Attempting to call this method on a resource without the required permission will result in a `PERMISSION_DENIED` error. Attempting to call this method on a non-existent resource will result in a `NOT_FOUND` error if the user has list permission on the project, or a `PERMISSION_DENIED` error otherwise. The resource takes the following formats: `projects/{PROJECT_ID\}/occurrences/{OCCURRENCE_ID\}` for occurrences and projects/{PROJECT_ID\}/notes/{NOTE_ID\} for notes
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.getIamPolicy({
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/occurrences/my-occurrence',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "options": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceProjectsOccurrencesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsOccurrencesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getNotes(): GaxiosPromise[SchemaNote] = js.native
  def getNotes(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def getNotes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes): GaxiosPromise[SchemaNote] = js.native
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def getNotes(
    params: ParamsResourceProjectsOccurrencesGetnotes,
    options: BodyResponseCallback[Readable | SchemaNote],
    callback: BodyResponseCallback[Readable | SchemaNote]
  ): Unit = js.native
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def getNotes(
    params: ParamsResourceProjectsOccurrencesGetnotes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  /**
    * Gets the `Note` attached to the given `Occurrence`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.getNotes({
    *     // The name of the occurrence in the form "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}"
    *     name: 'projects/my-project/occurrences/my-occurrence',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attestationAuthority": {},
    *   //   "baseImage": {},
    *   //   "buildType": {},
    *   //   "compliance": {},
    *   //   "createTime": "my_createTime",
    *   //   "deployable": {},
    *   //   "discovery": {},
    *   //   "dsseAttestation": {},
    *   //   "expirationTime": "my_expirationTime",
    *   //   "kind": "my_kind",
    *   //   "longDescription": "my_longDescription",
    *   //   "name": "my_name",
    *   //   "package": {},
    *   //   "relatedUrl": [],
    *   //   "sbom": {},
    *   //   "shortDescription": "my_shortDescription",
    *   //   "spdxFile": {},
    *   //   "spdxPackage": {},
    *   //   "spdxRelationship": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "upgrade": {},
    *   //   "vulnerabilityType": {}
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
  def getNotes(params: ParamsResourceProjectsOccurrencesGetnotes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getNotes(
    params: ParamsResourceProjectsOccurrencesGetnotes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVulnerabilitySummary(): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]): Unit = js.native
  def getVulnerabilitySummary(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: BodyResponseCallback[Readable | SchemaGetVulnzOccurrencesSummaryResponse],
    callback: BodyResponseCallback[Readable | SchemaGetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary, options: MethodOptions): GaxiosPromise[SchemaGetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  /**
    * Gets a summary of the number and severity of occurrences.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await containeranalysis.projects.occurrences.getVulnerabilitySummary({
    *       // The filter expression.
    *       filter: 'placeholder-value',
    *       // This contains the project Id for example: projects/{project_id\}
    *       parent: 'projects/my-project',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "counts": []
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
  def getVulnerabilitySummary(params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getVulnerabilitySummary(
    params: ParamsResourceProjectsOccurrencesGetvulnerabilitysummary,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOccurrencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(params: ParamsResourceProjectsOccurrencesList): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    callback: BodyResponseCallback[SchemaListOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    options: BodyResponseCallback[Readable | SchemaListOccurrencesResponse],
    callback: BodyResponseCallback[Readable | SchemaListOccurrencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsOccurrencesList, options: MethodOptions): GaxiosPromise[SchemaListOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOccurrencesResponse]
  ): Unit = js.native
  /**
    * Lists active `Occurrences` for a given project matching the filters.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.list({
    *     // The filter expression.
    *     filter: 'placeholder-value',
    *     // The kind of occurrences to filter on.
    *     kind: 'placeholder-value',
    *     // The name field contains the project Id. For example: "projects/{project_id\} @Deprecated
    *     name: 'placeholder-value',
    *     // Number of occurrences to return in the list.
    *     pageSize: 'placeholder-value',
    *     // Token to provide to skip to a particular spot in the list.
    *     pageToken: 'placeholder-value',
    *     // This contains the project Id for example: projects/{project_id\}.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "occurrences": []
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
  def list(params: ParamsResourceProjectsOccurrencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsOccurrencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(params: ParamsResourceProjectsOccurrencesPatch): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(params: ParamsResourceProjectsOccurrencesPatch, callback: BodyResponseCallback[SchemaOccurrence]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsOccurrencesPatch,
    options: BodyResponseCallback[Readable | SchemaOccurrence],
    callback: BodyResponseCallback[Readable | SchemaOccurrence]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsOccurrencesPatch, options: MethodOptions): GaxiosPromise[SchemaOccurrence] = js.native
  def patch(
    params: ParamsResourceProjectsOccurrencesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOccurrence]
  ): Unit = js.native
  /**
    * Updates an existing occurrence.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.patch({
    *     // The name of the occurrence. Should be of the form "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}".
    *     name: 'projects/my-project/occurrences/my-occurrence',
    *     // The fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attestation": {},
    *       //   "buildDetails": {},
    *       //   "compliance": {},
    *       //   "createTime": "my_createTime",
    *       //   "deployment": {},
    *       //   "derivedImage": {},
    *       //   "discovered": {},
    *       //   "dsseAttestation": {},
    *       //   "envelope": {},
    *       //   "installation": {},
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "noteName": "my_noteName",
    *       //   "remediation": "my_remediation",
    *       //   "resource": {},
    *       //   "resourceUrl": "my_resourceUrl",
    *       //   "sbom": {},
    *       //   "spdxFile": {},
    *       //   "spdxPackage": {},
    *       //   "spdxRelationship": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "upgrade": {},
    *       //   "vulnerabilityDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attestation": {},
    *   //   "buildDetails": {},
    *   //   "compliance": {},
    *   //   "createTime": "my_createTime",
    *   //   "deployment": {},
    *   //   "derivedImage": {},
    *   //   "discovered": {},
    *   //   "dsseAttestation": {},
    *   //   "envelope": {},
    *   //   "installation": {},
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "noteName": "my_noteName",
    *   //   "remediation": "my_remediation",
    *   //   "resource": {},
    *   //   "resourceUrl": "my_resourceUrl",
    *   //   "sbom": {},
    *   //   "spdxFile": {},
    *   //   "spdxPackage": {},
    *   //   "spdxRelationship": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "upgrade": {},
    *   //   "vulnerabilityDetails": {}
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
  def patch(params: ParamsResourceProjectsOccurrencesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsOccurrencesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsOccurrencesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsOccurrencesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified `Note` or `Occurrence`. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a `Note` or an `Occurrence`, respectively. Attempting to call this method without these permissions will result in a ` `PERMISSION_DENIED` error. Attempting to call this method on a non-existent resource will result in a `NOT_FOUND` error if the user has `containeranalysis.notes.list` permission on a `Note` or `containeranalysis.occurrences.list` on an `Occurrence`, or a `PERMISSION_DENIED` error otherwise. The resource takes the following formats: `projects/{projectid\}/occurrences/{occurrenceid\}` for occurrences and projects/{projectid\}/notes/{noteid\} for notes
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/occurrences/my-occurrence',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceProjectsOccurrencesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsOccurrencesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsOccurrencesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsOccurrencesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns the permissions that a caller has on the specified note or occurrence resource. Requires list permission on the project (for example, "storage.objects.list" on the containing bucket for testing permission of an object). Attempting to call this method on a non-existent resource will result in a `NOT_FOUND` error if the user has list permission on the project, or a `PERMISSION_DENIED` error otherwise. The resource takes the following formats: `projects/{PROJECT_ID\}/occurrences/{OCCURRENCE_ID\}` for `Occurrences` and `projects/{PROJECT_ID\}/notes/{NOTE_ID\}` for `Notes`
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/containeranalysis.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await containeranalysis.projects.occurrences.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/occurrences/my-occurrence',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceProjectsOccurrencesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsOccurrencesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
