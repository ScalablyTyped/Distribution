package typings.jqueryGridster

import typings.jqueryGridster.jqueryGridsterStrings.auto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterOptions extends StObject {
  
  /**
    * A boolean to specify if the stylesheet should be generated or not
    **/
  var autogenerate_stylesheet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, all the CSS required to  osition      l widgets in their respective col umns and rows will be generated automatically and injectedt the<head> of thed cument.You can set this to false, and write your own CSS targeting rows and cols via data - attributes like so: [data - col = "1"] { left: 10px; }
    * Default = true
    **/
  var autogenerate_sytesheet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Avoid that widgets loaded from the DOM can be overlapped.  It is helpful if the positions were bad stored in the database or if there was any conflict.
    * Default = true
    **/
  var avoid_overlapped_widgets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object with all options for Collision class you want to overwrite.  @see GridsterCollision or docs for more info.
    **/
  var collision: js.UndefOr[GridsterCollision] = js.undefined
  
  /**
    * An object with all options for Draggable class you want to overwrite.  @see GridsterDraggable or docs for more info.
    **/
  var draggable: js.UndefOr[GridsterDraggable] = js.undefined
  
  /**
    * Add more columns in addition to those that have been calculated.
    * Default = 0
    **/
  var extra_cols: js.UndefOr[Double] = js.undefined
  
  /**
    * Add more rows in addition to those that have been calculated.
    * Default = 0
    **/
  var extra_rows: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum columns possible (set to null for no maximum).
    * Default = null
    **/
  var max_cols: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of columns that a widget can span.
    * Default = 6
    **/
  var max_size_x: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum required columns.
    * Default = 1
    **/
  var min_cols: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum required rows.
    * Default = 15
    **/
  var min_rows: js.UndefOr[Double] = js.undefined
  
  /**
    * A string to differentiate one gridster from another
    **/
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * An object with all options for Resizable class you want to overwrite.  @see GridsterResizable or docs for more info.
    **/
  var resize: js.UndefOr[GridsterResizable] = js.undefined
  
  /**
    * Return the data you want for each widget in the serialization.
    **/
  var serialize_params: js.UndefOr[js.Function2[/* $w */ JQuery, /* wgd */ GridsterCoords, Any]] = js.undefined
  
  /**
    * Base widget dimensions in pixels.  The first index for the width and the second for the height.
    * Default = [400, 225]
    **/
  var widget_base_dimensions: js.UndefOr[js.Array[auto | Double]] = js.undefined
  
  /**
    * Margin between widgets.  The first index for the horizontal margin (left, right) and the second for the vertical margin (top, bottom).
    * Default = [10, 10]
    **/
  var widget_margins: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define who will be the draggable widgets.  Can be a CSS Selector String or a collection of HTMLElements.
    * Type => string css selector
    * Type => HTMLElement[]
    * Default = 'li'
    **/
  var widget_selector: js.UndefOr[String | js.Array[HTMLElement]] = js.undefined
}
object GridsterOptions {
  
  inline def apply(): GridsterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridsterOptions] (val x: Self) extends AnyVal {
    
    inline def setAutogenerate_stylesheet(value: Boolean): Self = StObject.set(x, "autogenerate_stylesheet", value.asInstanceOf[js.Any])
    
    inline def setAutogenerate_stylesheetUndefined: Self = StObject.set(x, "autogenerate_stylesheet", js.undefined)
    
    inline def setAutogenerate_sytesheet(value: Boolean): Self = StObject.set(x, "autogenerate_sytesheet", value.asInstanceOf[js.Any])
    
    inline def setAutogenerate_sytesheetUndefined: Self = StObject.set(x, "autogenerate_sytesheet", js.undefined)
    
    inline def setAvoid_overlapped_widgets(value: Boolean): Self = StObject.set(x, "avoid_overlapped_widgets", value.asInstanceOf[js.Any])
    
    inline def setAvoid_overlapped_widgetsUndefined: Self = StObject.set(x, "avoid_overlapped_widgets", js.undefined)
    
    inline def setCollision(value: GridsterCollision): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setDraggable(value: GridsterDraggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setExtra_cols(value: Double): Self = StObject.set(x, "extra_cols", value.asInstanceOf[js.Any])
    
    inline def setExtra_colsUndefined: Self = StObject.set(x, "extra_cols", js.undefined)
    
    inline def setExtra_rows(value: Double): Self = StObject.set(x, "extra_rows", value.asInstanceOf[js.Any])
    
    inline def setExtra_rowsUndefined: Self = StObject.set(x, "extra_rows", js.undefined)
    
    inline def setMax_cols(value: Double): Self = StObject.set(x, "max_cols", value.asInstanceOf[js.Any])
    
    inline def setMax_colsUndefined: Self = StObject.set(x, "max_cols", js.undefined)
    
    inline def setMax_size_x(value: Double): Self = StObject.set(x, "max_size_x", value.asInstanceOf[js.Any])
    
    inline def setMax_size_xUndefined: Self = StObject.set(x, "max_size_x", js.undefined)
    
    inline def setMin_cols(value: Double): Self = StObject.set(x, "min_cols", value.asInstanceOf[js.Any])
    
    inline def setMin_colsUndefined: Self = StObject.set(x, "min_cols", js.undefined)
    
    inline def setMin_rows(value: Double): Self = StObject.set(x, "min_rows", value.asInstanceOf[js.Any])
    
    inline def setMin_rowsUndefined: Self = StObject.set(x, "min_rows", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setResize(value: GridsterResizable): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setSerialize_params(value: (/* $w */ JQuery, /* wgd */ GridsterCoords) => Any): Self = StObject.set(x, "serialize_params", js.Any.fromFunction2(value))
    
    inline def setSerialize_paramsUndefined: Self = StObject.set(x, "serialize_params", js.undefined)
    
    inline def setWidget_base_dimensions(value: js.Array[auto | Double]): Self = StObject.set(x, "widget_base_dimensions", value.asInstanceOf[js.Any])
    
    inline def setWidget_base_dimensionsUndefined: Self = StObject.set(x, "widget_base_dimensions", js.undefined)
    
    inline def setWidget_base_dimensionsVarargs(value: (auto | Double)*): Self = StObject.set(x, "widget_base_dimensions", js.Array(value*))
    
    inline def setWidget_margins(value: js.Array[Double]): Self = StObject.set(x, "widget_margins", value.asInstanceOf[js.Any])
    
    inline def setWidget_marginsUndefined: Self = StObject.set(x, "widget_margins", js.undefined)
    
    inline def setWidget_marginsVarargs(value: Double*): Self = StObject.set(x, "widget_margins", js.Array(value*))
    
    inline def setWidget_selector(value: String | js.Array[HTMLElement]): Self = StObject.set(x, "widget_selector", value.asInstanceOf[js.Any])
    
    inline def setWidget_selectorUndefined: Self = StObject.set(x, "widget_selector", js.undefined)
    
    inline def setWidget_selectorVarargs(value: HTMLElement*): Self = StObject.set(x, "widget_selector", js.Array(value*))
  }
}
