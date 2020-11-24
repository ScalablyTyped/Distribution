package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionsResource extends js.Object {
  
  /** List the metadata for the dimensions available to this AdSense account. */
  def list(): Request[Metadata] = js.native
  def list(request: FieldsKey): Request[Metadata] = js.native
}
