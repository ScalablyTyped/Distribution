package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of styles for a given table.
  */
@js.native
trait SchemaStyleSettingList extends StObject {
  
  /**
    * All requested style settings.
    */
  var items: js.UndefOr[js.Array[SchemaStyleSetting]] = js.native
  
  /**
    * Type name: in this case, a list of style settings.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Total number of styles for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object SchemaStyleSettingList {
  
  @scala.inline
  def apply(): SchemaStyleSettingList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleSettingList]
  }
  
  @scala.inline
  implicit class SchemaStyleSettingListMutableBuilder[Self <: SchemaStyleSettingList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaStyleSetting]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaStyleSetting*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
