package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAlertcenter.anon.AlertId
import typings.maximMazurokGapiClientAlertcenter.anon.Callback
import typings.maximMazurokGapiClientAlertcenter.anon.CustomerId
import typings.maximMazurokGapiClientAlertcenter.anon.Fields
import typings.maximMazurokGapiClientAlertcenter.anon.Key
import typings.maximMazurokGapiClientAlertcenter.anon.Oauthtoken
import typings.maximMazurokGapiClientAlertcenter.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertsResource extends js.Object {
  
  /** Performs batch delete operation on alerts. */
  def batchDelete(request: Callback): Request[BatchDeleteAlertsResponse] = js.native
  def batchDelete(request: Fields, body: BatchDeleteAlertsRequest): Request[BatchDeleteAlertsResponse] = js.native
  
  def batchUndelete(request: Fields, body: BatchUndeleteAlertsRequest): Request[BatchUndeleteAlertsResponse] = js.native
  /** Performs batch undelete operation on alerts. */
  def batchUndelete(request: Key): Request[BatchUndeleteAlertsResponse] = js.native
  
  /**
    * Marks the specified alert for deletion. An alert that has been marked for deletion is removed from Alert Center after 30 days. Marking an alert for deletion has no effect on an
    * alert which has already been marked for deletion. Attempting to mark a nonexistent alert for deletion results in a `NOT_FOUND` error.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: AlertId): Request[js.Object] = js.native
  
  var feedback: FeedbackResource = js.native
  
  /** Gets the specified alert. Attempting to get a nonexistent alert returns `NOT_FOUND` error. */
  def get(): Request[Alert] = js.native
  def get(request: AlertId): Request[Alert] = js.native
  
  /** Returns the metadata of an alert. Attempting to get metadata for a non-existent alert returns `NOT_FOUND` error. */
  def getMetadata(): Request[AlertMetadata] = js.native
  def getMetadata(request: AlertId): Request[AlertMetadata] = js.native
  
  /** Lists the alerts. */
  def list(): Request[ListAlertsResponse] = js.native
  def list(request: CustomerId): Request[ListAlertsResponse] = js.native
  
  /**
    * Restores, or "undeletes", an alert that was marked for deletion within the past 30 days. Attempting to undelete an alert which was marked for deletion over 30 days ago (which has
    * been removed from the Alert Center database) or a nonexistent alert returns a `NOT_FOUND` error. Attempting to undelete an alert which has not been marked for deletion has no
    * effect.
    */
  def undelete(request: Oauthtoken): Request[Alert] = js.native
  def undelete(request: PrettyPrint, body: UndeleteAlertRequest): Request[Alert] = js.native
}
