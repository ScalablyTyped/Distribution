package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of columns in a table.
  */
@js.native
trait SchemaColumnList extends StObject {
  
  /**
    * List of all requested columns.
    */
  var items: js.UndefOr[js.Array[SchemaColumn]] = js.native
  
  /**
    * The kind of item this is. For a column list, this is always
    * fusiontables#columnList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Total number of columns for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object SchemaColumnList {
  
  @scala.inline
  def apply(): SchemaColumnList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnList]
  }
  
  @scala.inline
  implicit class SchemaColumnListMutableBuilder[Self <: SchemaColumnList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaColumn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaColumn*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
