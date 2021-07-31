package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Fields
import typings.maximMazurokGapiClientCompute.anon.OperationPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneOperationsResource extends StObject {
  
  /** Deletes the specified zone-specific Operations resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: OperationPrettyPrint): Request[Unit] = js.native
  
  /** Retrieves the specified zone-specific Operations resource. */
  def get(): Request[Operation] = js.native
  def get(request: OperationPrettyPrint): Request[Operation] = js.native
  
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(): Request[OperationList] = js.native
  def list(request: Fields): Request[OperationList] = js.native
  
  def wait(request: OperationPrettyPrint): Request[Operation] = js.native
}
