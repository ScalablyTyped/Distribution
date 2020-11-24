package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.AccountIdAlt
import typings.maximMazurokGapiClientAdexchangebuyer.anon.AltConfigId
import typings.maximMazurokGapiClientAdexchangebuyer.anon.ConfigId
import typings.maximMazurokGapiClientAdexchangebuyer.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PretargetingConfigResource extends js.Object {
  
  /** Deletes an existing pretargeting config. */
  def delete(): Request[Unit] = js.native
  def delete(request: ConfigId): Request[Unit] = js.native
  
  /** Gets a specific pretargeting configuration */
  def get(): Request[PretargetingConfig] = js.native
  def get(request: ConfigId): Request[PretargetingConfig] = js.native
  
  /** Inserts a new pretargeting configuration. */
  def insert(request: AccountIdAlt): Request[PretargetingConfig] = js.native
  def insert(request: KeyOauthtoken, body: PretargetingConfig): Request[PretargetingConfig] = js.native
  
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(): Request[PretargetingConfigList] = js.native
  def list(request: KeyOauthtoken): Request[PretargetingConfigList] = js.native
  
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: AltConfigId): Request[PretargetingConfig] = js.native
  def patch(request: ConfigId, body: PretargetingConfig): Request[PretargetingConfig] = js.native
  
  /** Updates an existing pretargeting config. */
  def update(request: AltConfigId): Request[PretargetingConfig] = js.native
  def update(request: ConfigId, body: PretargetingConfig): Request[PretargetingConfig] = js.native
}
