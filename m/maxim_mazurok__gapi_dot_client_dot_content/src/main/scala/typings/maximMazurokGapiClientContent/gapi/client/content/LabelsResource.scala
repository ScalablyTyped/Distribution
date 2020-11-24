package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.Accesstoken
import typings.maximMazurokGapiClientContent.anon.AccountId
import typings.maximMazurokGapiClientContent.anon.Alt
import typings.maximMazurokGapiClientContent.anon.Callback
import typings.maximMazurokGapiClientContent.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsResource extends js.Object {
  
  /** Creates a new label, not assigned to any account. */
  def create(request: Accesstoken): Request[AccountLabel] = js.native
  def create(request: AccountId, body: AccountLabel): Request[AccountLabel] = js.native
  
  /** Deletes a label and removes it from all accounts to which it was assigned. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Lists the labels assigned to an account. */
  def list(): Request[ListAccountLabelsResponse] = js.native
  def list(request: Callback): Request[ListAccountLabelsResponse] = js.native
  
  def patch(request: Alt, body: AccountLabel): Request[AccountLabel] = js.native
  /** Updates a label. */
  def patch(request: Fields): Request[AccountLabel] = js.native
}
