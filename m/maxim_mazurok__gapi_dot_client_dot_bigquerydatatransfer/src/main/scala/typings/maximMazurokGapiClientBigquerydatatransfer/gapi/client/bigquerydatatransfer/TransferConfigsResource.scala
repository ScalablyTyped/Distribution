package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Alt
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.AuthorizationCode
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.DataSourceIds
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Name
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Oauthtoken
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Parent
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.PrettyPrint
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.QuotaUser
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferConfigsResource extends js.Object {
  
  /** Creates a new data transfer configuration. */
  def create(request: AuthorizationCode): Request[TransferConfig] = js.native
  def create(request: Oauthtoken, body: TransferConfig): Request[TransferConfig] = js.native
  
  /** Deletes a data transfer configuration, including any associated transfer runs and logs. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns information about a data transfer config. */
  def get(): Request[TransferConfig] = js.native
  def get(request: Alt): Request[TransferConfig] = js.native
  
  /** Returns information about all data transfers in the project. */
  def list(): Request[ListTransferConfigsResponse] = js.native
  def list(request: DataSourceIds): Request[ListTransferConfigsResponse] = js.native
  
  /** Updates a data transfer configuration. All fields must be set, even if they are not updated. */
  def patch(request: Name): Request[TransferConfig] = js.native
  def patch(request: PrettyPrint, body: TransferConfig): Request[TransferConfig] = js.native
  
  var runs: RunsResource = js.native
  
  /**
    * Creates transfer runs for a time range [start_time, end_time]. For each date - or whatever granularity the data source supports - in the range, one transfer run is created. Note
    * that runs are created per UTC time in the time range. DEPRECATED: use StartManualTransferRuns instead.
    */
  def scheduleRuns(request: Parent): Request[ScheduleTransferRunsResponse] = js.native
  def scheduleRuns(request: QuotaUser, body: ScheduleTransferRunsRequest): Request[ScheduleTransferRunsResponse] = js.native
  
  def startManualRuns(request: QuotaUser, body: StartManualTransferRunsRequest): Request[StartManualTransferRunsResponse] = js.native
  /**
    * Start manual transfer runs to be executed now with schedule_time equal to current time. The transfer runs can be created for a time range where the run_time is between start_time
    * (inclusive) and end_time (exclusive), or for a specific run_time.
    */
  def startManualRuns(request: Resource): Request[StartManualTransferRunsResponse] = js.native
}
