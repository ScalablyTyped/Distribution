package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.Alt
import typings.maximMazurokGapiClientAdsense.anon.Fields
import typings.maximMazurokGapiClientAdsense.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAdsense.anon.SavedAdStyleId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedadstylesResource extends js.Object {
  
  /** List a specific saved ad style for the specified account. */
  def get(): Request[SavedAdStyle] = js.native
  def get(request: KeyOauthtoken): Request[SavedAdStyle] = js.native
  def get(request: SavedAdStyleId): Request[SavedAdStyle] = js.native
  
  /** List all saved ad styles in the specified account. */
  def list(): Request[SavedAdStyles] = js.native
  def list(request: Alt): Request[SavedAdStyles] = js.native
  def list(request: Fields): Request[SavedAdStyles] = js.native
}
