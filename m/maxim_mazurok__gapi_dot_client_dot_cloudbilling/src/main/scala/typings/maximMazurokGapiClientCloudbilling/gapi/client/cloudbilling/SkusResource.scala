package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbilling.anon.CurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkusResource extends StObject {
  
  /** Lists all publicly available SKUs for a given cloud service. */
  def list(): Request[ListSkusResponse] = js.native
  def list(request: CurrencyCode): Request[ListSkusResponse] = js.native
}
