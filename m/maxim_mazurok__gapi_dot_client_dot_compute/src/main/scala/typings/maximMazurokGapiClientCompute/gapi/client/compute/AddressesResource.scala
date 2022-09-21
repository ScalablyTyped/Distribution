package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Callback
import typings.maximMazurokGapiClientCompute.anon.Fields
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressesResource extends StObject {
  
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(): Request[AddressAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[AddressAggregatedList] = js.native
  
  /** Deletes the specified address resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Address): Request[Operation] = js.native
  
  /** Returns the specified address resource. */
  def get(): Request[Address] = js.native
  def get(request: Callback): Request[Address] = js.native
  
  /** Creates an address resource in the specified project by using the data included in the request. */
  def insert(request: Fields): Request[Operation] = js.native
  def insert(request: Oauthtoken, body: Address): Request[Operation] = js.native
  
  /** Retrieves a list of addresses contained within the specified region. */
  def list(): Request[AddressList] = js.native
  def list(request: Filter): Request[AddressList] = js.native
}
