package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMigrationJobsResponse extends StObject {
  
  /**
    * The list of migration jobs objects.
    */
  var migrationJobs: js.UndefOr[js.Array[SchemaMigrationJob]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListMigrationJobsResponse {
  
  inline def apply(): SchemaListMigrationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMigrationJobsResponse]
  }
  
  extension [Self <: SchemaListMigrationJobsResponse](x: Self) {
    
    inline def setMigrationJobs(value: js.Array[SchemaMigrationJob]): Self = StObject.set(x, "migrationJobs", value.asInstanceOf[js.Any])
    
    inline def setMigrationJobsUndefined: Self = StObject.set(x, "migrationJobs", js.undefined)
    
    inline def setMigrationJobsVarargs(value: SchemaMigrationJob*): Self = StObject.set(x, "migrationJobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
