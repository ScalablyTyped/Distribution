package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.Resource
import typings.maximMazurokGapiClientAnalytics.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientIdResource extends js.Object {
  
  /** Hashes the given Client ID. */
  def hashClientId(request: Resource): Request[HashClientIdResponse] = js.native
  def hashClientId(request: UserIp, body: HashClientIdRequest): Request[HashClientIdResponse] = js.native
}
