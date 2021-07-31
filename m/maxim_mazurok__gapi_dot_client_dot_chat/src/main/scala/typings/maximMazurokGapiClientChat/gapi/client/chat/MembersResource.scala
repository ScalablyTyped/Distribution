package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Alt
import typings.maximMazurokGapiClientChat.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends StObject {
  
  /** Returns a membership. */
  def get(): Request[Membership] = js.native
  def get(request: Alt): Request[Membership] = js.native
  
  /** Lists human memberships in a space. */
  def list(): Request[ListMembershipsResponse] = js.native
  def list(request: Callback): Request[ListMembershipsResponse] = js.native
}
