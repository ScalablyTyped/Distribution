package typings.googleapis.reportsV1Mod.adminReportsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a collection of activites.
  */
trait SchemaActivities extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Each record in read response.
    */
  var items: js.UndefOr[js.Array[SchemaActivity]] = js.undefined
  
  /**
    * Kind of list response this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token for retrieving the next page
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaActivities {
  
  inline def apply(): SchemaActivities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivities]
  }
  
  extension [Self <: SchemaActivities](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaActivity]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaActivity*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
