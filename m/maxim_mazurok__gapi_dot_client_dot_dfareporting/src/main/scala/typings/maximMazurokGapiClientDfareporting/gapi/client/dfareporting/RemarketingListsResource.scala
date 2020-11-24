package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AccesstokenActive
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.CallbackFieldsKeyOauthtoken
import typings.maximMazurokGapiClientDfareporting.anon.FieldsIdKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingListsResource extends js.Object {
  
  /** Gets one remarketing list by ID. */
  def get(): Request[RemarketingList] = js.native
  def get(request: Alt): Request[RemarketingList] = js.native
  
  /** Inserts a new remarketing list. */
  def insert(request: CallbackFieldsKeyOauthtoken): Request[RemarketingList] = js.native
  def insert(request: Callback, body: RemarketingList): Request[RemarketingList] = js.native
  
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(): Request[RemarketingListsListResponse] = js.native
  def list(request: AccesstokenActive): Request[RemarketingListsListResponse] = js.native
  
  def patch(request: Alt, body: RemarketingList): Request[RemarketingList] = js.native
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: FieldsIdKeyOauthtoken): Request[RemarketingList] = js.native
  
  /** Updates an existing remarketing list. */
  def update(request: CallbackFieldsKeyOauthtoken): Request[RemarketingList] = js.native
  def update(request: Callback, body: RemarketingList): Request[RemarketingList] = js.native
}
