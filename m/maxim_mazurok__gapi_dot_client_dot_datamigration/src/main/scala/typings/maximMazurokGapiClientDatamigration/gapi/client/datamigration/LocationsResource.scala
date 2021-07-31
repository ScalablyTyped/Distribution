package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatamigration.anon.Fields
import typings.maximMazurokGapiClientDatamigration.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var connectionProfiles: ConnectionProfilesResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Fields): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
  
  var migrationJobs: MigrationJobsResource = js.native
  
  var operations: OperationsResource = js.native
}
