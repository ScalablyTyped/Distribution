package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for ListDatabases.
  */
@js.native
trait SchemaListDatabasesResponse extends StObject {
  
  /**
    * Databases that matched the request.
    */
  var databases: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  
  /**
    * `next_page_token` can be sent in a subsequent ListDatabases call to fetch
    * more of the matching databases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListDatabasesResponse {
  
  @scala.inline
  def apply(): SchemaListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatabasesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDatabasesResponseMutableBuilder[Self <: SchemaListDatabasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabases(value: js.Array[SchemaDatabase]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    @scala.inline
    def setDatabasesVarargs(value: SchemaDatabase*): Self = StObject.set(x, "databases", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
