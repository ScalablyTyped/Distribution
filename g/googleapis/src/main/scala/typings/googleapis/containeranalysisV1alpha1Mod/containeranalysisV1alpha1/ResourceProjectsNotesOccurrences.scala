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

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Notes$Occurrences")
@js.native
open class ResourceProjectsNotesOccurrences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(params: ParamsResourceProjectsNotesOccurrencesList): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    options: BodyResponseCallback[Readable | SchemaListNoteOccurrencesResponse],
    callback: BodyResponseCallback[Readable | SchemaListNoteOccurrencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotesOccurrencesList, options: MethodOptions): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]
  ): Unit = js.native
  /**
    * Lists `Occurrences` referencing the specified `Note`. Use this method to get all occurrences referencing your `Note` across all your customer projects.
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
    *   const res = await containeranalysis.projects.notes.occurrences.list({
    *     // The filter expression.
    *     filter: 'placeholder-value',
    *     // The name field will contain the note name for example: "provider/{provider_id\}/notes/{note_id\}"
    *     name: 'projects/my-project/notes/my-note',
    *     // Number of notes to return in the list.
    *     pageSize: 'placeholder-value',
    *     // Token to provide to skip to a particular spot in the list.
    *     pageToken: 'placeholder-value',
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
  def list(params: ParamsResourceProjectsNotesOccurrencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
