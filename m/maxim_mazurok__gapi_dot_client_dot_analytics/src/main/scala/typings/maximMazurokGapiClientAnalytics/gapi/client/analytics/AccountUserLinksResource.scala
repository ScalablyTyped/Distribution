package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.LinkId
import typings.maximMazurokGapiClientAnalytics.anon.Maxresults
import typings.maximMazurokGapiClientAnalytics.anon.Oauthtoken
import typings.maximMazurokGapiClientAnalytics.anon.PrettyPrint
import typings.maximMazurokGapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUserLinksResource extends js.Object {
  
  /** Removes a user from the given account. */
  def delete(): Request[Unit] = js.native
  def delete(request: LinkId): Request[Unit] = js.native
  
  /** Adds a new user to the given account. */
  def insert(request: Oauthtoken): Request[EntityUserLink] = js.native
  def insert(request: PrettyPrint, body: EntityUserLink): Request[EntityUserLink] = js.native
  
  /** Lists account-user links for a given account. */
  def list(): Request[EntityUserLinks] = js.native
  def list(request: Maxresults): Request[EntityUserLinks] = js.native
  
  def update(request: LinkId, body: EntityUserLink): Request[EntityUserLink] = js.native
  /** Updates permissions for an existing user on the given account. */
  def update(request: QuotaUser): Request[EntityUserLink] = js.native
}
