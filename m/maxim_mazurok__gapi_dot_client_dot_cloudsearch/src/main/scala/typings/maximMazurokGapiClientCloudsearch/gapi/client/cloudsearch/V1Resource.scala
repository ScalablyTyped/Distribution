package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.AltCallback
import typings.maximMazurokGapiClientCloudsearch.anon.QuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends StObject {
  
  def initializeCustomer(request: AltCallback, body: InitializeCustomerRequest): Request[Operation] = js.native
  /** Enables `third party` support in Google Cloud Search. **Note:** This API requires an admin account to execute. */
  def initializeCustomer(request: QuotaUserResource): Request[Operation] = js.native
}
