package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.PageToken
import typings.maximMazurokGapiClientCompute.anon.ParentId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalOrganizationOperationsResource extends StObject {
  
  /** Deletes the specified Operations resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: ParentId): Request[Unit] = js.native
  
  /** Retrieves the specified Operations resource. Gets a list of operations by making a `list()` request. */
  def get(): Request[Operation] = js.native
  def get(request: ParentId): Request[Operation] = js.native
  
  /** Retrieves a list of Operation resources contained within the specified organization. */
  def list(): Request[OperationList] = js.native
  def list(request: PageToken): Request[OperationList] = js.native
}
