package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of tables.
  */
trait SchemaTableList extends StObject {
  
  /**
    * List of all requested tables.
    */
  var items: js.UndefOr[js.Array[SchemaTable]] = js.undefined
  
  /**
    * Type name: a list of all tables.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaTableList {
  
  inline def apply(): SchemaTableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableList]
  }
  
  extension [Self <: SchemaTableList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaTable]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaTable*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
