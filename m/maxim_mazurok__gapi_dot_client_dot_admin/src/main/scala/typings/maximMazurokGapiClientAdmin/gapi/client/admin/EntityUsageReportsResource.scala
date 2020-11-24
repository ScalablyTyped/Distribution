package typings.maximMazurokGapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmin.anon.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityUsageReportsResource extends js.Object {
  
  /**
    * Retrieves a report which is a collection of properties and statistics for entities used by users within the account. For more information, see the Entities Usage Report guide. For
    * more information about the entities report's parameters, see the Entities Usage parameters reference guides.
    */
  def get(): Request[UsageReports] = js.native
  def get(request: EntityKey): Request[UsageReports] = js.native
}
