package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer.anon.AccountId
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInfoResource extends StObject {
  
  /** Returns the billing information for one account specified by account ID. */
  def get(): Request[BillingInfo] = js.native
  def get(request: AccountId): Request[BillingInfo] = js.native
  
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(): Request[BillingInfoList] = js.native
  def list(request: Fields): Request[BillingInfoList] = js.native
}
