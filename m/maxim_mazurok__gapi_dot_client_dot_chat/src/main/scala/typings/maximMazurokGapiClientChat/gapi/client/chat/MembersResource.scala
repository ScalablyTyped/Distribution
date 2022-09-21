package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Fields
import typings.maximMazurokGapiClientChat.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends StObject {
  
  /** Returns a membership. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def get(): Request[Membership] = js.native
  def get(request: Fields): Request[Membership] = js.native
  
  /** Lists human memberships in a space. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def list(): Request[ListMembershipsResponse] = js.native
  def list(request: Key): Request[ListMembershipsResponse] = js.native
}
