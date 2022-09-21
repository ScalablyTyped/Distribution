package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MachineTypesResource extends StObject {
  
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(): Request[MachineTypeAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[MachineTypeAggregatedList] = js.native
  
  /** Returns the specified machine type. Gets a list of available machine types by making a list() request. */
  def get(): Request[MachineType] = js.native
  def get(request: typings.maximMazurokGapiClientCompute.anon.MachineType): Request[MachineType] = js.native
  
  /** Retrieves a list of machine types available to the specified project. */
  def list(): Request[MachineTypeList] = js.native
  def list(request: Alt): Request[MachineTypeList] = js.native
}
