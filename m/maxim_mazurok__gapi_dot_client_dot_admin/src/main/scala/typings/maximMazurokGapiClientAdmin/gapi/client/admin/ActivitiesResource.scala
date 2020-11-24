package typings.maximMazurokGapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmin.anon.Accesstoken
import typings.maximMazurokGapiClientAdmin.anon.ActorIpAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitiesResource extends js.Object {
  
  /**
    * Retrieves a list of activities for a specific customer's account and application such as the Admin console application or the Google Drive application. For more information, see the
    * guides for administrator and Google Drive activity reports. For more information about the activity report's parameters, see the activity parameters reference guides.
    */
  def list(): Request[Activities] = js.native
  def list(request: Accesstoken): Request[Activities] = js.native
  
  def watch(request: Accesstoken, body: Channel): Request[Channel] = js.native
  /** Start receiving notifications for account activities. For more information, see Receiving Push Notifications. */
  def watch(request: ActorIpAddress): Request[Channel] = js.native
}
