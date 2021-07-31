package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.AccesstokenAlt
import typings.maximMazurokGapiClientAndroidenterprise.anon.Alt
import typings.maximMazurokGapiClientAndroidenterprise.anon.ManagedConfigurationForUserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedconfigurationsforuserResource extends StObject {
  
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(): Request[Unit] = js.native
  def delete(request: ManagedConfigurationForUserId): Request[Unit] = js.native
  
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(): Request[ManagedConfiguration] = js.native
  def get(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
  
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(): Request[ManagedConfigurationsForUserListResponse] = js.native
  def list(request: Alt): Request[ManagedConfigurationsForUserListResponse] = js.native
  
  /**
    * Adds or updates the managed configuration settings for an app for the specified user. If you support the Managed configurations iframe, you can apply managed configurations to a
    * user by specifying an mcmId and its associated configuration variables (if any) in the request. Alternatively, all EMMs can apply managed configurations by passing a list of managed
    * properties.
    */
  def update(request: AccesstokenAlt): Request[ManagedConfiguration] = js.native
  def update(request: ManagedConfigurationForUserId, body: ManagedConfiguration): Request[ManagedConfiguration] = js.native
}
