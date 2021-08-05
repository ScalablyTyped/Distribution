package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of columns in a table.
  */
trait SchemaColumnList extends StObject {
  
  /**
    * List of all requested columns.
    */
  var items: js.UndefOr[js.Array[SchemaColumn]] = js.undefined
  
  /**
    * Type name: a list of all columns.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of columns for the table.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object SchemaColumnList {
  
  inline def apply(): SchemaColumnList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnList]
  }
  
  extension [Self <: SchemaColumnList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaColumn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaColumn*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
