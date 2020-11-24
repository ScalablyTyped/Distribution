package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Alt
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunsResource extends js.Object {
  
  /** Deletes the specified transfer run. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns information about the particular transfer run. */
  def get(): Request[TransferRun] = js.native
  def get(request: Alt): Request[TransferRun] = js.native
  
  /** Returns information about running and completed jobs. */
  def list(): Request[ListTransferRunsResponse] = js.native
  def list(request: Key): Request[ListTransferRunsResponse] = js.native
  
  var transferLogs: TransferLogsResource = js.native
}
