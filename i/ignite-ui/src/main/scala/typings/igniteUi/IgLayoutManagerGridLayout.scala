package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLayoutManagerGridLayout
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies the duration of the animations in the layout manager"s grid layout
    *
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of columns in the grid
    *
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * Accepts number, string with height in px, percents,                        or asterisk (*) which will distribute all the height between all the columns equally.
    *                         It can also accept an array, specifying height for each column. If more than one column
    *                         has an asterisk value, the remaining height will be equally distributed between these columns.
    *                     array The column height can be set as an array of heights.
    *
    */
  var columnHeight: js.UndefOr[String | Double | js.Array[Any]] = js.undefined
  
  /**
    * Accepts number or string with width in px, percents                        or asterisk (*) which will distribute all the width between all the columns equally.
    *                         It can also accept an array, specifying width for each column. If more than one column
    *                         has an asterisk value, the remaining width will be equally distributed between these columns.
    *                     array The column width can be set as an array of widths.
    *
    */
  var columnWidth: js.UndefOr[String | Double | js.Array[Any]] = js.undefined
  
  /**
    * Specifies the margin left css property for items
    *
    */
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the margin top css property for items
    *
    */
  var marginTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the previous set options should be overriden when setting options
    *
    */
  var overrideConfigOnSetOption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specified whether the items should rearrange to fit in the container when it is resized.
    *                         Have effect only when fixed columnWidth option is set.
    *
    */
  var rearrangeItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of rows in the grid
    *
    */
  var rows: js.UndefOr[Double] = js.undefined
}
object IgLayoutManagerGridLayout {
  
  inline def apply(): IgLayoutManagerGridLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerGridLayout]
  }
  
  extension [Self <: IgLayoutManagerGridLayout](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setColumnHeight(value: String | Double | js.Array[Any]): Self = StObject.set(x, "columnHeight", value.asInstanceOf[js.Any])
    
    inline def setColumnHeightUndefined: Self = StObject.set(x, "columnHeight", js.undefined)
    
    inline def setColumnHeightVarargs(value: Any*): Self = StObject.set(x, "columnHeight", js.Array(value*))
    
    inline def setColumnWidth(value: String | Double | js.Array[Any]): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setColumnWidthVarargs(value: Any*): Self = StObject.set(x, "columnWidth", js.Array(value*))
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setOverrideConfigOnSetOption(value: Boolean): Self = StObject.set(x, "overrideConfigOnSetOption", value.asInstanceOf[js.Any])
    
    inline def setOverrideConfigOnSetOptionUndefined: Self = StObject.set(x, "overrideConfigOnSetOption", js.undefined)
    
    inline def setRearrangeItems(value: Boolean): Self = StObject.set(x, "rearrangeItems", value.asInstanceOf[js.Any])
    
    inline def setRearrangeItemsUndefined: Self = StObject.set(x, "rearrangeItems", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
