package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of tasks for a table.
  */
trait SchemaTaskList extends StObject {
  
  /**
    * List of all requested tasks.
    */
  var items: js.UndefOr[js.Array[SchemaTask]] = js.undefined
  
  /**
    * Type of the resource. This is always &quot;fusiontables#taskList&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of tasks for the table.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object SchemaTaskList {
  
  @scala.inline
  def apply(): SchemaTaskList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskList]
  }
  
  @scala.inline
  implicit class SchemaTaskListMutableBuilder[Self <: SchemaTaskList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaTask]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaTask*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
