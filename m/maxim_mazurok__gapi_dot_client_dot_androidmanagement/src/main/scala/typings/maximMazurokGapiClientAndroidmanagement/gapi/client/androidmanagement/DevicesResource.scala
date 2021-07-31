package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.Fields
import typings.maximMazurokGapiClientAndroidmanagement.anon.Key
import typings.maximMazurokGapiClientAndroidmanagement.anon.Name
import typings.maximMazurokGapiClientAndroidmanagement.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  /** Deletes a device. This operation wipes the device. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Gets a device. */
  def get(): Request[Device] = js.native
  def get(request: Alt): Request[Device] = js.native
  
  def issueCommand(request: Alt, body: Command): Request[Operation] = js.native
  /** Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status of the command. */
  def issueCommand(request: Key): Request[Operation] = js.native
  
  /** Lists devices for a given enterprise. */
  def list(): Request[ListDevicesResponse] = js.native
  def list(request: Oauthtoken): Request[ListDevicesResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  /** Updates a device. */
  def patch(request: Name): Request[Device] = js.native
  def patch(request: PrettyPrint, body: Device): Request[Device] = js.native
}
