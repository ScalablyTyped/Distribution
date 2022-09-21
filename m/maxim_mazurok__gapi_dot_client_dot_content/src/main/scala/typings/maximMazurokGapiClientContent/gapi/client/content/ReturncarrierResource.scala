package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccountId
import typings.maximMazurokGapiClientContent.anon.CarrierAccountId
import typings.maximMazurokGapiClientContent.anon.PrettyPrint
import typings.maximMazurokGapiClientContent.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturncarrierResource extends StObject {
  
  def create(request: AccountId, body: AccountReturnCarrier): Request[AccountReturnCarrier] = js.native
  /** Links return carrier to a merchant account. */
  def create(request: PrettyPrint): Request[AccountReturnCarrier] = js.native
  
  /** Delete a return carrier in the merchant account. */
  def delete(): Request[Unit] = js.native
  def delete(request: CarrierAccountId): Request[Unit] = js.native
  
  /** Lists available return carriers in the merchant account. */
  def list(): Request[ListAccountReturnCarrierResponse] = js.native
  def list(request: AccountId): Request[ListAccountReturnCarrierResponse] = js.native
  
  def patch(request: CarrierAccountId, body: AccountReturnCarrier): Request[AccountReturnCarrier] = js.native
  /** Updates a return carrier in the merchant account. */
  def patch(request: QuotaUser): Request[AccountReturnCarrier] = js.native
}
