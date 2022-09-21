package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.CombinedAudienceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedAudiencesResource extends StObject {
  
  /** Gets a combined audience. */
  def get(): Request[CombinedAudience] = js.native
  def get(request: CombinedAudienceId): Request[CombinedAudience] = js.native
  
  /** Lists combined audiences. The order is defined by the order_by parameter. */
  def list(): Request[ListCombinedAudiencesResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListCombinedAudiencesResponse] = js.native
}
