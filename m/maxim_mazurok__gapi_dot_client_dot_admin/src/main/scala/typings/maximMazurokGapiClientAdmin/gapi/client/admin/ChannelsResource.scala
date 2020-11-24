package typings.maximMazurokGapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmin.anon.Alt
import typings.maximMazurokGapiClientAdmin.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends js.Object {
  
  /** Stop watching resources through this channel. */
  def stop(request: Alt): Request[Unit] = js.native
  def stop(request: Callback, body: Channel): Request[Unit] = js.native
}
