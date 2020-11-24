package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.EnterpriseIdFields
import typings.maximMazurokGapiClientAndroidenterprise.anon.KeyId
import typings.maximMazurokGapiClientAndroidenterprise.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceaccountkeysResource extends js.Object {
  
  /**
    * Removes and invalidates the specified credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: KeyId): Request[Unit] = js.native
  
  /**
    * Generates new credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling Enterprises.GetServiceAccount and
    * must have been set as the enterprise service account by calling Enterprises.SetAccount. Only the type of the key should be populated in the resource to be inserted.
    */
  def insert(request: EnterpriseIdFields): Request[ServiceAccountKey] = js.native
  def insert(request: Oauthtoken, body: ServiceAccountKey): Request[ServiceAccountKey] = js.native
  
  /**
    * Lists all active credentials for the service account associated with this enterprise. Only the ID and key type are returned. The calling service account must have been retrieved by
    * calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def list(): Request[ServiceAccountKeysListResponse] = js.native
  def list(request: Oauthtoken): Request[ServiceAccountKeysListResponse] = js.native
}
