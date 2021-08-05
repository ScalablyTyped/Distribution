package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of hidden players.
  */
trait SchemaHiddenPlayerList extends StObject {
  
  /**
    * The players.
    */
  var items: js.UndefOr[js.Array[SchemaHiddenPlayer]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#hiddenPlayerList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaHiddenPlayerList {
  
  inline def apply(): SchemaHiddenPlayerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiddenPlayerList]
  }
  
  extension [Self <: SchemaHiddenPlayerList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaHiddenPlayer]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaHiddenPlayer*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
