package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackCssDomainId
import typings.maximMazurokGapiClientContent.anon.CssDomainId
import typings.maximMazurokGapiClientContent.anon.CssGroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssesResource extends js.Object {
  
  /** Retrieves a single CSS domain by ID. */
  def get(): Request[Css] = js.native
  def get(request: CssDomainId): Request[Css] = js.native
  
  /** Lists CSS domains affiliated with a CSS group. */
  def list(): Request[ListCssesResponse] = js.native
  def list(request: CssGroupId): Request[ListCssesResponse] = js.native
  
  /** Updates labels that are assigned to a CSS domain by its CSS group. */
  def updatelabels(request: CallbackCssDomainId): Request[Css] = js.native
  def updatelabels(request: CssDomainId, body: LabelIds): Request[Css] = js.native
}
