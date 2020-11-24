package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import typings.maximMazurokGapiClientDialogflow.anon.Name
import typings.maximMazurokGapiClientDialogflow.anon.PageToken
import typings.maximMazurokGapiClientDialogflow.anon.Uploadprotocol
import typings.maximMazurokGapiClientDialogflow.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextsResource extends js.Object {
  
  def create(request: Alt, body: GoogleCloudDialogflowV2Context): Request[GoogleCloudDialogflowV2Context] = js.native
  /** Creates a context. If the specified context already exists, overrides the context. */
  def create(request: Xgafv): Request[GoogleCloudDialogflowV2Context] = js.native
  
  /** Deletes the specified context. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Retrieves the specified context. */
  def get(): Request[GoogleCloudDialogflowV2Context] = js.native
  def get(request: Name): Request[GoogleCloudDialogflowV2Context] = js.native
  
  /** Returns the list of all contexts in the specified session. */
  def list(): Request[GoogleCloudDialogflowV2ListContextsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDialogflowV2ListContextsResponse] = js.native
  
  /** Updates the specified context. */
  def patch(request: AccesstokenAlt): Request[GoogleCloudDialogflowV2Context] = js.native
  def patch(request: Uploadprotocol, body: GoogleCloudDialogflowV2Context): Request[GoogleCloudDialogflowV2Context] = js.native
}
