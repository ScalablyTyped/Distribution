package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLayoutManagerItem
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Column index of the item in the grid
    *
    */
  var colIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * ColSpan of the item
    *
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets individual item height, either in px or percentage
    *                         string The default height can be set in pixels (px), %, em and other units.
    *
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * Row index of the item in the grid
    *
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * RowSpan of the item
    *
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets individual item width, either in px or percentage
    *                         string The default width can be set in pixels (px), %, em and other units.
    *
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IgLayoutManagerItem {
  
  @scala.inline
  def apply(): IgLayoutManagerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerItem]
  }
  
  @scala.inline
  implicit class IgLayoutManagerItemMutableBuilder[Self <: IgLayoutManagerItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
