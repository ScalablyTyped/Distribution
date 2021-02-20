package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.Alt
import typings.maximMazurokGapiClientAndroidenterprise.anon.EntitlementId
import typings.maximMazurokGapiClientAndroidenterprise.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitlementsResource extends StObject {
  
  /** Removes an entitlement to an app for a user. */
  def delete(): Request[Unit] = js.native
  def delete(request: EntitlementId): Request[Unit] = js.native
  
  /** Retrieves details of an entitlement. */
  def get(): Request[Entitlement] = js.native
  def get(request: EntitlementId): Request[Entitlement] = js.native
  
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(): Request[EntitlementsListResponse] = js.native
  def list(request: Alt): Request[EntitlementsListResponse] = js.native
  
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: typings.maximMazurokGapiClientAndroidenterprise.anon.Install): Request[Entitlement] = js.native
  def update(request: Uploadprotocol, body: Entitlement): Request[Entitlement] = js.native
}
