package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbilling.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /** Lists all public cloud services. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: PageSize): Request[ListServicesResponse] = js.native
  
  var skus: SkusResource = js.native
}
