package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.AccountIdAlt
import typings.maximMazurokGapiClientAdsense.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsResource extends js.Object {
  
  /** List the payments for the specified AdSense account. */
  def list(): Request[Payments] = js.native
  def list(request: AccountIdAlt): Request[Payments] = js.native
  def list(request: FieldsKey): Request[Payments] = js.native
}
