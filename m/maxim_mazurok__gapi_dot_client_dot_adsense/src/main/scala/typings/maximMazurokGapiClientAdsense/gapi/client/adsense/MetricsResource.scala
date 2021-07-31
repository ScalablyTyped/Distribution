package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsense.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsResource extends StObject {
  
  /** List the metadata for the metrics available to this AdSense account. */
  def list(): Request[Metadata] = js.native
  def list(request: FieldsKey): Request[Metadata] = js.native
}
