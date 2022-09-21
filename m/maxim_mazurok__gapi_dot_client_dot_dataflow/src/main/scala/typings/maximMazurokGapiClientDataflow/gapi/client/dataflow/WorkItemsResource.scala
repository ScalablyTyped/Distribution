package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.Alt
import typings.maximMazurokGapiClientDataflow.anon.JobId
import typings.maximMazurokGapiClientDataflow.anon.Oauthtoken
import typings.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDataflow.anon.ProjectId
import typings.maximMazurokGapiClientDataflow.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemsResource extends StObject {
  
  def lease(request: Alt, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  def lease(request: JobId, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Oauthtoken): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: ProjectId): Request[LeaseWorkItemResponse] = js.native
  
  def reportStatus(request: Alt, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  def reportStatus(request: JobId, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: PrettyPrint): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: QuotaUser): Request[ReportWorkItemStatusResponse] = js.native
}
