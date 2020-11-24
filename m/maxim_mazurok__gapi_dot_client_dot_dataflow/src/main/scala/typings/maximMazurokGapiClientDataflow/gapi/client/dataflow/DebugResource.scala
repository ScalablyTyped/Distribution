package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.JobId
import typings.maximMazurokGapiClientDataflow.anon.Location
import typings.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDataflow.anon.ProjectId
import typings.maximMazurokGapiClientDataflow.anon.QuotaUser
import typings.maximMazurokGapiClientDataflow.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugResource extends js.Object {
  
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: JobId): Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Location): Request[GetDebugConfigResponse] = js.native
  def getConfig(request: PrettyPrint, body: GetDebugConfigRequest): Request[GetDebugConfigResponse] = js.native
  def getConfig(request: QuotaUser, body: GetDebugConfigRequest): Request[GetDebugConfigResponse] = js.native
  
  def sendCapture(request: PrettyPrint, body: SendDebugCaptureRequest): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: ProjectId): Request[js.Object] = js.native
  def sendCapture(request: QuotaUser, body: SendDebugCaptureRequest): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Resource): Request[js.Object] = js.native
}
