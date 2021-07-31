package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHierarchicalGridColumnLayout
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the foreignKey of the columnLayout. This is also the column key of the parent grid.
    */
  var foreignKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the columnLayout key. This is the property that holds the data records for the current column layout.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the primaryKey of the columnLayout. This also serves as the column key for the current column layout.
    */
  var primaryKey: js.UndefOr[String] = js.undefined
}
object IgHierarchicalGridColumnLayout {
  
  @scala.inline
  def apply(): IgHierarchicalGridColumnLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridColumnLayout]
  }
  
  @scala.inline
  implicit class IgHierarchicalGridColumnLayoutMutableBuilder[Self <: IgHierarchicalGridColumnLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
  }
}
