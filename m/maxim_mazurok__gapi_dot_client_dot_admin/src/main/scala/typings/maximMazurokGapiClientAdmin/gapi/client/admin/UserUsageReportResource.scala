package typings.maximMazurokGapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserUsageReportResource extends js.Object {
  
  /**
    * Retrieves a report which is a collection of properties and statistics for a set of users with the account. For more information, see the User Usage Report guide. For more
    * information about the user report's parameters, see the Users Usage parameters reference guides.
    */
  def get(): Request[UsageReports] = js.native
  def get(request: Fields): Request[UsageReports] = js.native
}
