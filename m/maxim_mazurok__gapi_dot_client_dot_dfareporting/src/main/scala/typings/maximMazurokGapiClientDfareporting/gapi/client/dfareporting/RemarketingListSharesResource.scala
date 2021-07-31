package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.FieldsKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientDfareporting.anon.IdKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientDfareporting.anon.RemarketingListId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingListSharesResource extends StObject {
  
  /** Gets one remarketing list share by remarketing list ID. */
  def get(): Request[RemarketingListShare] = js.native
  def get(request: RemarketingListId): Request[RemarketingListShare] = js.native
  
  def patch(request: Alt, body: RemarketingListShare): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: IdKeyOauthtokenPrettyPrint): Request[RemarketingListShare] = js.native
  
  def update(request: Callback, body: RemarketingListShare): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. */
  def update(request: FieldsKeyOauthtokenPrettyPrint): Request[RemarketingListShare] = js.native
}
