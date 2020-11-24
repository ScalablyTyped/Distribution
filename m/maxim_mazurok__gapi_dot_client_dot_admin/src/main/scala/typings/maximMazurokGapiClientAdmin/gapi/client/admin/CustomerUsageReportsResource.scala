package typings.maximMazurokGapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmin.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerUsageReportsResource extends js.Object {
  
  /**
    * Retrieves a report which is a collection of properties and statistics for a specific customer's account. For more information, see the Customers Usage Report guide. For more
    * information about the customer report's parameters, see the Customers Usage parameters reference guides.
    */
  def get(): Request[UsageReports] = js.native
  def get(request: Date): Request[UsageReports] = js.native
}
