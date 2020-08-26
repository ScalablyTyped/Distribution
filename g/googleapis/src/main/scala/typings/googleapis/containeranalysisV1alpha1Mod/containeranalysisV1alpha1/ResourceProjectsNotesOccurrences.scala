package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Notes$Occurrences")
@js.native
class ResourceProjectsNotesOccurrences protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.notes.occurrences.list
    * @desc Lists `Occurrences` referencing the specified `Note`. Use this
    * method to get all occurrences referencing your `Note` across all your
    * customer projects.
    * @alias containeranalysis.projects.notes.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string} params.name The name field will contain the note name for example:   "provider/{provider_id}/notes/{note_id}"
    * @param {integer=} params.pageSize Number of notes to return in the list.
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

