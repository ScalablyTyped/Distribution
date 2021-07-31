package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AltCallbackFieldsKey
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubnotificationsettingsResource extends StObject {
  
  /** Retrieves a Merchant Center account's pubsub notification settings. */
  def get(): Request[PubsubNotificationSettings] = js.native
  def get(request: UploadType): Request[PubsubNotificationSettings] = js.native
  
  /** Register a Merchant Center account for pubsub notifications. Note that cloud topic name should not be provided as part of the request. */
  def update(request: AltCallbackFieldsKey): Request[PubsubNotificationSettings] = js.native
  def update(request: UploadType, body: PubsubNotificationSettings): Request[PubsubNotificationSettings] = js.native
}
