package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.KeyMaxResults
import typings.maximMazurokGapiClientDfareporting.anon.MaxResultsOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionValuesResource extends StObject {
  
  /** Retrieves list of report dimension values for a list of filters. */
  def query(request: KeyMaxResults): Request[DimensionValueList] = js.native
  def query(request: MaxResultsOauthtoken, body: DimensionValueRequest): Request[DimensionValueList] = js.native
}
