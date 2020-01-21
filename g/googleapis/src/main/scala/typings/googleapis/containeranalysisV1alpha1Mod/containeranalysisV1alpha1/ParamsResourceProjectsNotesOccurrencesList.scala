package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsNotesOccurrencesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter expression.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The name field will contain the note name for example:
    * "provider/{provider_id}/notes/{note_id}"
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of notes to return in the list.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
}

