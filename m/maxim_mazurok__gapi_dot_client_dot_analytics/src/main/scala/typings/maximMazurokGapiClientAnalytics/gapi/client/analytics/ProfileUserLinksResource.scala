package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typings.maximMazurokGapiClientAnalytics.anon.KeyLinkId
import typings.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typings.maximMazurokGapiClientAnalytics.anon.QuotaUserResource
import typings.maximMazurokGapiClientAnalytics.anon.ResourceUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileUserLinksResource extends StObject {
  
  /** Removes a user from the given view (profile). */
  def delete(): Request[Unit] = js.native
  def delete(request: KeyLinkId): Request[Unit] = js.native
  
  def insert(request: FieldsKey, body: EntityUserLink): Request[EntityUserLink] = js.native
  /** Adds a new user to the given view (profile). */
  def insert(request: QuotaUserResource): Request[EntityUserLink] = js.native
  
  /** Lists profile-user links for a given view (profile). */
  def list(): Request[EntityUserLinks] = js.native
  def list(request: KeyMaxresults): Request[EntityUserLinks] = js.native
  
  def update(request: KeyLinkId, body: EntityUserLink): Request[EntityUserLink] = js.native
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: ResourceUserIp): Request[EntityUserLink] = js.native
}
