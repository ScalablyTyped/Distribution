package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.AndroidId
import typings.maximMazurokGapiClientBooks.anon.Device
import typings.maximMazurokGapiClientBooks.anon.Manufacturer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromoofferResource extends StObject {
  
  /** Accepts the promo offer. */
  def accept(): Request[js.Object] = js.native
  def accept(request: AndroidId): Request[js.Object] = js.native
  
  /** Marks the promo offer as dismissed. */
  def dismiss(): Request[js.Object] = js.native
  def dismiss(request: Device): Request[js.Object] = js.native
  
  /** Returns a list of promo offers available to the user */
  def get(): Request[Offers] = js.native
  def get(request: Manufacturer): Request[Offers] = js.native
}
