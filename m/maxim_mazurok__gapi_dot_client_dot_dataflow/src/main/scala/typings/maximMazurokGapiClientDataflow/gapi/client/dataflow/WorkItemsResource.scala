package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDataflow.anon.QuotaUser
import typings.maximMazurokGapiClientDataflow.anon.UploadType
import typings.maximMazurokGapiClientDataflow.anon.Uploadprotocol
import typings.maximMazurokGapiClientDataflow.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemsResource extends js.Object {
  
  def lease(request: PrettyPrint, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  def lease(request: QuotaUser, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: UploadType): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Xgafv): Request[LeaseWorkItemResponse] = js.native
  
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: AccesstokenAlt): Request[ReportWorkItemStatusResponse] = js.native
  def reportStatus(request: PrettyPrint, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  def reportStatus(request: QuotaUser, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: Uploadprotocol): Request[ReportWorkItemStatusResponse] = js.native
}
