package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMigrationJobsResponse extends StObject {
  
  /** The list of migration jobs objects. */
  var migrationJobs: js.UndefOr[js.Array[MigrationJob]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListMigrationJobsResponse {
  
  @scala.inline
  def apply(): ListMigrationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationJobsResponse]
  }
  
  @scala.inline
  implicit class ListMigrationJobsResponseMutableBuilder[Self <: ListMigrationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigrationJobs(value: js.Array[MigrationJob]): Self = StObject.set(x, "migrationJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationJobsUndefined: Self = StObject.set(x, "migrationJobs", js.undefined)
    
    @scala.inline
    def setMigrationJobsVarargs(value: MigrationJob*): Self = StObject.set(x, "migrationJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
