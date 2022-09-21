package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.PrettyPrint
import typings.maximMazurokGapiClientCompute.anon.QuotaUser
import typings.maximMazurokGapiClientCompute.anon.RequestId
import typings.maximMazurokGapiClientCompute.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalersResource extends StObject {
  
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(): Request[AutoscalerAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[AutoscalerAggregatedList] = js.native
  
  /** Deletes the specified autoscaler. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Autoscaler): Request[Operation] = js.native
  
  /** Returns the specified autoscaler resource. Gets a list of available autoscalers by making a list() request. */
  def get(): Request[Autoscaler] = js.native
  def get(request: PrettyPrint): Request[Autoscaler] = js.native
  
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: typings.maximMazurokGapiClientCompute.anon.Project): Request[Operation] = js.native
  def insert(request: QuotaUser, body: Autoscaler): Request[Operation] = js.native
  
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(): Request[AutoscalerList] = js.native
  def list(request: Alt): Request[AutoscalerList] = js.native
  
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    */
  def patch(request: RequestId): Request[Operation] = js.native
  def patch(request: UploadType, body: Autoscaler): Request[Operation] = js.native
  
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: RequestId): Request[Operation] = js.native
  def update(request: UploadType, body: Autoscaler): Request[Operation] = js.native
}
