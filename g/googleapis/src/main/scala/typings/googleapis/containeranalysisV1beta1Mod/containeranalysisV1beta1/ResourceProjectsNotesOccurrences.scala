package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Notes$Occurrences")
@js.native
class ResourceProjectsNotesOccurrences protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * containeranalysis.projects.notes.occurrences.list
    * @desc Lists occurrences referencing the specified note. Provider projects
    * can use this method to get all occurrences across consumer projects
    * referencing the specified note.
    * @alias containeranalysis.projects.notes.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string} params.name The name of the note to list occurrences for in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {integer=} params.pageSize Number of occurrences to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(params: ParamsResourceProjectsNotesOccurrencesList): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    options: BodyResponseCallback[SchemaListNoteOccurrencesResponse],
    callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotesOccurrencesList, options: MethodOptions): GaxiosPromise[SchemaListNoteOccurrencesResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotesOccurrencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNoteOccurrencesResponse]
  ): Unit = js.native
}
