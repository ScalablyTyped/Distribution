package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.CountryDartIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CitiesResource extends js.Object {
  
  /** Retrieves a list of cities, possibly filtered. */
  def list(): Request[CitiesListResponse] = js.native
  def list(request: CountryDartIds): Request[CitiesListResponse] = js.native
}
