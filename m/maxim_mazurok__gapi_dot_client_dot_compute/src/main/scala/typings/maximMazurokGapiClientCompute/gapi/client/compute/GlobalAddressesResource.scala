package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AccesstokenAddress
import typings.maximMazurokGapiClientCompute.anon.AddressAlt
import typings.maximMazurokGapiClientCompute.anon.AltCallbackFields
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalAddressesResource extends StObject {
  
  /** Deletes the specified address resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AccesstokenAddress): Request[Operation] = js.native
  
  /** Returns the specified address resource. Gets a list of available addresses by making a list() request. */
  def get(): Request[Address] = js.native
  def get(request: AddressAlt): Request[Address] = js.native
  
  /** Creates an address resource in the specified project by using the data included in the request. */
  def insert(request: AltCallbackFields): Request[Operation] = js.native
  def insert(request: Xgafv, body: Address): Request[Operation] = js.native
  
  /** Retrieves a list of global addresses. */
  def list(): Request[AddressList] = js.native
  def list(request: MaxResults): Request[AddressList] = js.native
}
