package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchDirectoryPeopleResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of people in the domain directory that match the query.
    */
  var people: js.UndefOr[js.Array[SchemaPerson]] = js.undefined
  
  /**
    * The total number of items in the list without pagination.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSearchDirectoryPeopleResponse {
  
  inline def apply(): SchemaSearchDirectoryPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchDirectoryPeopleResponse]
  }
  
  extension [Self <: SchemaSearchDirectoryPeopleResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPeople(value: js.Array[SchemaPerson]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    inline def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    inline def setPeopleVarargs(value: SchemaPerson*): Self = StObject.set(x, "people", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
