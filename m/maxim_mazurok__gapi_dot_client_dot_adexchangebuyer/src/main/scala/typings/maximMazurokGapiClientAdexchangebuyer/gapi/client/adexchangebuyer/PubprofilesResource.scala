package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubprofilesResource extends js.Object {
  
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(): Request[GetPublisherProfilesByAccountIdResponse] = js.native
  def list(request: AccountId): Request[GetPublisherProfilesByAccountIdResponse] = js.native
}
