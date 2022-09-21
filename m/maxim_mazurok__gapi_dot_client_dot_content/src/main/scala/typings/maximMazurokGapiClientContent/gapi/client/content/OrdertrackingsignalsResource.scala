package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdertrackingsignalsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: OrderTrackingSignal): Request[OrderTrackingSignal] = js.native
  /** Creates new order tracking signal. */
  def create(request: OauthtokenPrettyPrintQuotaUser): Request[OrderTrackingSignal] = js.native
}
