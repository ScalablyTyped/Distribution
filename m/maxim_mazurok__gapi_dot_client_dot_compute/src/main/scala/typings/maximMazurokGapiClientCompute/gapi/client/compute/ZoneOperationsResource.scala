package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneOperationsResource extends StObject {
  
  /** Deletes the specified zone-specific Operations resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: KeyOauthtokenOperation): Request[Unit] = js.native
  
  /** Retrieves the specified zone-specific Operations resource. */
  def get(): Request[Operation] = js.native
  def get(request: KeyOauthtokenOperation): Request[Operation] = js.native
  
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(): Request[OperationList] = js.native
  def list(request: Alt): Request[OperationList] = js.native
  
  def wait(request: KeyOauthtokenOperation): Request[Operation] = js.native
}
