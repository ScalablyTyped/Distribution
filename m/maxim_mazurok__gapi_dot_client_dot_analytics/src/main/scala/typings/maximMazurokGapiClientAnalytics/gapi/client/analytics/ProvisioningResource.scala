package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.PrettyPrintQuotaUserResource
import typings.maximMazurokGapiClientAnalytics.anon.QuotaUserResourceUserIp
import typings.maximMazurokGapiClientAnalytics.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningResource extends StObject {
  
  /** Creates an account ticket. */
  def createAccountTicket(request: PrettyPrintQuotaUserResource): Request[AccountTicket] = js.native
  def createAccountTicket(request: UserIp, body: AccountTicket): Request[AccountTicket] = js.native
  
  /** Provision account. */
  def createAccountTree(request: QuotaUserResourceUserIp): Request[AccountTreeResponse] = js.native
  def createAccountTree(request: UserIp, body: AccountTreeRequest): Request[AccountTreeResponse] = js.native
}
