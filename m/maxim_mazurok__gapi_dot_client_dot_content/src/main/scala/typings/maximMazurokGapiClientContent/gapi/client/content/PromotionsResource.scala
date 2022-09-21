package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.Id
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenPrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromotionsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: Promotion): Request[Promotion] = js.native
  /** Inserts a promotion for your Merchant Center account. If the promotion already exists, then it updates the promotion instead. */
  def create(request: MerchantIdOauthtokenPrettyPrintQuotaUser): Request[Promotion] = js.native
  
  /** Retrieves a promotion from your Merchant Center account. */
  def get(): Request[Promotion] = js.native
  def get(request: Id): Request[Promotion] = js.native
}
