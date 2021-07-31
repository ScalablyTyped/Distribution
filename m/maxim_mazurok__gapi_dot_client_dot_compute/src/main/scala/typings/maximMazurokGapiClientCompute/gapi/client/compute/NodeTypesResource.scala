package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTypesResource extends StObject {
  
  /** Retrieves an aggregated list of node types. */
  def aggregatedList(): Request[NodeTypeAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[NodeTypeAggregatedList] = js.native
  
  /** Returns the specified node type. Gets a list of available node types by making a list() request. */
  def get(): Request[NodeType] = js.native
  def get(request: typings.maximMazurokGapiClientCompute.anon.NodeType): Request[NodeType] = js.native
  
  /** Retrieves a list of node types available to the specified project. */
  def list(): Request[NodeTypeList] = js.native
  def list(request: Fields): Request[NodeTypeList] = js.native
}
