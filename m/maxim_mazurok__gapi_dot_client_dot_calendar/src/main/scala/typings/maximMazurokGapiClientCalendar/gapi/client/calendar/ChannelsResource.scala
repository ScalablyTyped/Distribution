package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCalendar.anon.FieldsKey
import typings.maximMazurokGapiClientCalendar.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends js.Object {
  
  def stop(request: FieldsKey, body: Channel): Request[Unit] = js.native
  /** Stop watching resources through this channel */
  def stop(request: KeyOauthtoken): Request[Unit] = js.native
}
