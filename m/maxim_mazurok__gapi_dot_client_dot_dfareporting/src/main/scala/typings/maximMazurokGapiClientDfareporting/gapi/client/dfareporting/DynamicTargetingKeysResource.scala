package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.FieldsKeyOauthtoken
import typings.maximMazurokGapiClientDfareporting.anon.Name
import typings.maximMazurokGapiClientDfareporting.anon.Names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicTargetingKeysResource extends js.Object {
  
  /** Deletes an existing dynamic targeting key. */
  def delete(): Request[Unit] = js.native
  def delete(request: Name): Request[Unit] = js.native
  
  def insert(request: Callback, body: DynamicTargetingKey): Request[DynamicTargetingKey] = js.native
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or placements. There is a maximum of 1000
    * keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: FieldsKeyOauthtoken): Request[DynamicTargetingKey] = js.native
  
  /** Retrieves a list of dynamic targeting keys. */
  def list(): Request[DynamicTargetingKeysListResponse] = js.native
  def list(request: Names): Request[DynamicTargetingKeysListResponse] = js.native
}
