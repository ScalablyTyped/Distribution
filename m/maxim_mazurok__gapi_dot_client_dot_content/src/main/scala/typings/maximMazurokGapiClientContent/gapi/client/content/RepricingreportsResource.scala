package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.EndDate
import typings.maximMazurokGapiClientContent.anon.RuleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingreportsResource extends StObject {
  
  /** Lists the metrics report for a given Repricing product. */
  /** Lists the metrics report for a given Repricing rule. */
  def list(): Request[ListRepricingProductReportsResponse] = js.native
  def list(request: EndDate): Request[ListRepricingProductReportsResponse] = js.native
  def list(request: RuleId): Request[ListRepricingRuleReportsResponse] = js.native
}
