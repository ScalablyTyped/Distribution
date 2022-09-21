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

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Notes")
@js.native
open class ResourceProjectsNotes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaNote] = js.native
  def create(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def create(params: ParamsResourceProjectsNotesCreate): GaxiosPromise[SchemaNote] = js.native
  def create(params: ParamsResourceProjectsNotesCreate, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def create(
    params: ParamsResourceProjectsNotesCreate,
    options: BodyResponseCallback[Readable | SchemaNote],
    callback: BodyResponseCallback[Readable | SchemaNote]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsNotesCreate, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def create(
    params: ParamsResourceProjectsNotesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  /**
    * Creates a new `Note`.
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
    *   const res = await containeranalysis.projects.notes.create({
    *     // The name of the project. Should be of the form "providers/{provider_id\}". @Deprecated
    *     name: 'placeholder-value',
    *     // The ID to use for this note.
    *     noteId: 'placeholder-value',
    *     // This field contains the project Id for example: "projects/{project_id\}
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attestationAuthority": {},
    *       //   "baseImage": {},
    *       //   "buildType": {},
    *       //   "compliance": {},
    *       //   "createTime": "my_createTime",
    *       //   "deployable": {},
    *       //   "discovery": {},
    *       //   "dsseAttestation": {},
    *       //   "expirationTime": "my_expirationTime",
    *       //   "kind": "my_kind",
    *       //   "longDescription": "my_longDescription",
    *       //   "name": "my_name",
    *       //   "package": {},
    *       //   "relatedUrl": [],
    *       //   "sbom": {},
    *       //   "shortDescription": "my_shortDescription",
    *       //   "spdxFile": {},
    *       //   "spdxPackage": {},
    *       //   "spdxRelationship": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "upgrade": {},
    *       //   "vulnerabilityType": {}
    *       // }
    *     },
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
  def create(params: ParamsResourceProjectsNotesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsNotesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsNotesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsNotesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsNotesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsNotesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsNotesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the given `Note` from the system.
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
    *   const res = await containeranalysis.projects.notes.delete({
    *     // The name of the note in the form of "providers/{provider_id\}/notes/{NOTE_ID\}"
    *     name: 'projects/my-project/notes/my-note',
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
  def delete(params: ParamsResourceProjectsNotesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsNotesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNote] = js.native
  def get(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def get(params: ParamsResourceProjectsNotesGet): GaxiosPromise[SchemaNote] = js.native
  def get(params: ParamsResourceProjectsNotesGet, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def get(
    params: ParamsResourceProjectsNotesGet,
    options: BodyResponseCallback[Readable | SchemaNote],
    callback: BodyResponseCallback[Readable | SchemaNote]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsNotesGet, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def get(
    params: ParamsResourceProjectsNotesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  /**
    * Returns the requested `Note`.
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
    *   const res = await containeranalysis.projects.notes.get({
    *     // The name of the note in the form of "providers/{provider_id\}/notes/{NOTE_ID\}"
    *     name: 'projects/my-project/notes/my-note',
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
  def get(params: ParamsResourceProjectsNotesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsNotesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsNotesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsNotesGetiampolicy,
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
    *   const res = await containeranalysis.projects.notes.getIamPolicy({
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/notes/my-note',
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
  def getIamPolicy(params: ParamsResourceProjectsNotesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsNotesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(params: ParamsResourceProjectsNotesList): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(params: ParamsResourceProjectsNotesList, callback: BodyResponseCallback[SchemaListNotesResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotesList,
    options: BodyResponseCallback[Readable | SchemaListNotesResponse],
    callback: BodyResponseCallback[Readable | SchemaListNotesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotesList, options: MethodOptions): GaxiosPromise[SchemaListNotesResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotesResponse]
  ): Unit = js.native
  /**
    * Lists all `Notes` for a given project.
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
    *   const res = await containeranalysis.projects.notes.list({
    *     // The filter expression.
    *     filter: 'placeholder-value',
    *     // The name field will contain the project Id for example: "providers/{provider_id\} @Deprecated
    *     name: 'placeholder-value',
    *     // Number of notes to return in the list.
    *     pageSize: 'placeholder-value',
    *     // Token to provide to skip to a particular spot in the list.
    *     pageToken: 'placeholder-value',
    *     // This field contains the project Id for example: "projects/{PROJECT_ID\}".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "notes": []
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
  def list(params: ParamsResourceProjectsNotesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsNotesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var occurrences: ResourceProjectsNotesOccurrences = js.native
  
  def patch(): GaxiosPromise[SchemaNote] = js.native
  def patch(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def patch(params: ParamsResourceProjectsNotesPatch): GaxiosPromise[SchemaNote] = js.native
  def patch(params: ParamsResourceProjectsNotesPatch, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsNotesPatch,
    options: BodyResponseCallback[Readable | SchemaNote],
    callback: BodyResponseCallback[Readable | SchemaNote]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsNotesPatch, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def patch(
    params: ParamsResourceProjectsNotesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  /**
    * Updates an existing `Note`.
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
    *   const res = await containeranalysis.projects.notes.patch({
    *     // The name of the note. Should be of the form "projects/{provider_id\}/notes/{note_id\}".
    *     name: 'projects/my-project/notes/my-note',
    *     // The fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attestationAuthority": {},
    *       //   "baseImage": {},
    *       //   "buildType": {},
    *       //   "compliance": {},
    *       //   "createTime": "my_createTime",
    *       //   "deployable": {},
    *       //   "discovery": {},
    *       //   "dsseAttestation": {},
    *       //   "expirationTime": "my_expirationTime",
    *       //   "kind": "my_kind",
    *       //   "longDescription": "my_longDescription",
    *       //   "name": "my_name",
    *       //   "package": {},
    *       //   "relatedUrl": [],
    *       //   "sbom": {},
    *       //   "shortDescription": "my_shortDescription",
    *       //   "spdxFile": {},
    *       //   "spdxPackage": {},
    *       //   "spdxRelationship": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "upgrade": {},
    *       //   "vulnerabilityType": {}
    *       // }
    *     },
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
  def patch(params: ParamsResourceProjectsNotesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsNotesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsNotesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsNotesSetiampolicy,
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
    *   const res = await containeranalysis.projects.notes.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/notes/my-note',
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
  def setIamPolicy(params: ParamsResourceProjectsNotesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsNotesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsNotesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsNotesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
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
    *   const res = await containeranalysis.projects.notes.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/notes/my-note',
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
  def testIamPermissions(params: ParamsResourceProjectsNotesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsNotesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
