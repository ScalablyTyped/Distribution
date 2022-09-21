package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.FieldsKeyMerchantIdOauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShoppingadsprogramResource extends StObject {
  
  /** Retrieves the status and review eligibility for the Shopping Ads program. */
  def get(): Request[ShoppingAdsProgramStatus] = js.native
  def get(request: AccesstokenAlt): Request[ShoppingAdsProgramStatus] = js.native
  
  def requestreview(request: AccesstokenAlt, body: RequestReviewShoppingAdsRequest): Request[Unit] = js.native
  /** Requests a review of Shopping ads in a specific region. This method is only available to selected merchants. */
  def requestreview(request: FieldsKeyMerchantIdOauthtokenPrettyPrint): Request[Unit] = js.native
}
