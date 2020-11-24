package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typings.maximMazurokGapiClientAnalytics.anon.KeyLinkId
import typings.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typings.maximMazurokGapiClientAnalytics.anon.LinkIdOauthtoken
import typings.maximMazurokGapiClientAnalytics.anon.PrettyPrintProfileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileFilterLinksResource extends js.Object {
  
  /** Delete a profile filter link. */
  def delete(): Request[Unit] = js.native
  def delete(request: KeyLinkId): Request[Unit] = js.native
  
  /** Returns a single profile filter link. */
  def get(): Request[ProfileFilterLink] = js.native
  def get(request: KeyLinkId): Request[ProfileFilterLink] = js.native
  
  def insert(request: FieldsKey, body: ProfileFilterLink): Request[ProfileFilterLink] = js.native
  /** Create a new profile filter link. */
  def insert(request: PrettyPrintProfileId): Request[ProfileFilterLink] = js.native
  
  /** Lists all profile filter links for a profile. */
  def list(): Request[ProfileFilterLinks] = js.native
  def list(request: KeyMaxresults): Request[ProfileFilterLinks] = js.native
  
  def patch(request: KeyLinkId, body: ProfileFilterLink): Request[ProfileFilterLink] = js.native
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: LinkIdOauthtoken): Request[ProfileFilterLink] = js.native
  
  def update(request: KeyLinkId, body: ProfileFilterLink): Request[ProfileFilterLink] = js.native
  /** Update an existing profile filter link. */
  def update(request: LinkIdOauthtoken): Request[ProfileFilterLink] = js.native
}
