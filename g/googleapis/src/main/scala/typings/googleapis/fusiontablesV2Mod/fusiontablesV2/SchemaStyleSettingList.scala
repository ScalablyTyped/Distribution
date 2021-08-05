package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of styles for a given table.
  */
trait SchemaStyleSettingList extends StObject {
  
  /**
    * All requested style settings.
    */
  var items: js.UndefOr[js.Array[SchemaStyleSetting]] = js.undefined
  
  /**
    * The kind of item this is. For a style list, this is always
    * fusiontables#styleSettingList .
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more styles left.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of styles for the table.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object SchemaStyleSettingList {
  
  inline def apply(): SchemaStyleSettingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleSettingList]
  }
  
  extension [Self <: SchemaStyleSettingList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaStyleSetting]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaStyleSetting*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
