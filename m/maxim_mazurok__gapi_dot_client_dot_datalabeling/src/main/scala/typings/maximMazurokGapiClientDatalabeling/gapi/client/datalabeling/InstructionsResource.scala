package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatalabeling.anon.Alt
import typings.maximMazurokGapiClientDatalabeling.anon.Callback
import typings.maximMazurokGapiClientDatalabeling.anon.Fields
import typings.maximMazurokGapiClientDatalabeling.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstructionsResource extends StObject {
  
  def create(request: Alt, body: GoogleCloudDatalabelingV1beta1CreateInstructionRequest): Request[GoogleLongrunningOperation] = js.native
  /** Creates an instruction for how data should be labeled. */
  def create(request: FieldsKey): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes an instruction object by resource name. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an instruction by resource name. */
  def get(): Request[GoogleCloudDatalabelingV1beta1Instruction] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1Instruction] = js.native
  
  /** Lists instructions for a project. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListInstructionsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListInstructionsResponse] = js.native
}
