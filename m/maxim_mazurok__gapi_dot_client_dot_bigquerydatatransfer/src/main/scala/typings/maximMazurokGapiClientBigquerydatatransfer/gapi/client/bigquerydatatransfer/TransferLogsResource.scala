package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferLogsResource extends js.Object {
  
  /** Returns user facing log messages for the data transfer run. */
  def list(): Request[ListTransferLogsResponse] = js.native
  def list(request: Fields): Request[ListTransferLogsResponse] = js.native
}
