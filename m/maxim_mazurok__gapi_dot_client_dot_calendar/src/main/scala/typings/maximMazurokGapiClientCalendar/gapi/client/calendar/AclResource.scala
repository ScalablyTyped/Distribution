package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCalendar.anon.Alt
import typings.maximMazurokGapiClientCalendar.anon.CalendarId
import typings.maximMazurokGapiClientCalendar.anon.Fields
import typings.maximMazurokGapiClientCalendar.anon.Key
import typings.maximMazurokGapiClientCalendar.anon.MaxResults
import typings.maximMazurokGapiClientCalendar.anon.Oauthtoken
import typings.maximMazurokGapiClientCalendar.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclResource extends StObject {
  
  /** Deletes an access control rule. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Returns an access control rule. */
  def get(): Request[AclRule] = js.native
  def get(request: Alt): Request[AclRule] = js.native
  
  /** Creates an access control rule. */
  def insert(request: CalendarId): Request[AclRule] = js.native
  def insert(request: Fields, body: AclRule): Request[AclRule] = js.native
  
  /** Returns the rules in the access control list for the calendar. */
  def list(): Request[Acl] = js.native
  def list(request: Key): Request[Acl] = js.native
  
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[AclRule] = js.native
  def patch(request: PrettyPrint, body: AclRule): Request[AclRule] = js.native
  
  /** Updates an access control rule. */
  def update(request: Oauthtoken): Request[AclRule] = js.native
  def update(request: PrettyPrint, body: AclRule): Request[AclRule] = js.native
  
  def watch(request: Key, body: Channel): Request[Channel] = js.native
  /** Watch for changes to ACL resources. */
  def watch(request: MaxResults): Request[Channel] = js.native
}
