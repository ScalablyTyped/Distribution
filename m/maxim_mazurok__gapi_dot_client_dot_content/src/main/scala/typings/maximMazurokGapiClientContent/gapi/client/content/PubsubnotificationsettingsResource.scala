package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrintQuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubnotificationsettingsResource extends StObject {
  
  /** Retrieves a Merchant Center account's pubsub notification settings. */
  def get(): Request[PubsubNotificationSettings] = js.native
  def get(request: AccesstokenAlt): Request[PubsubNotificationSettings] = js.native
  
  def update(request: AccesstokenAlt, body: PubsubNotificationSettings): Request[PubsubNotificationSettings] = js.native
  /** Register a Merchant Center account for pubsub notifications. Note that cloud topic name shouldn't be provided as part of the request. */
  def update(request: OauthtokenPrettyPrintQuotaUserResource): Request[PubsubNotificationSettings] = js.native
}
