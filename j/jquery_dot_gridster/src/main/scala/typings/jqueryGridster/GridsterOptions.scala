package typings.jqueryGridster

import typings.jqueryGridster.jqueryGridsterStrings.auto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsterOptions extends js.Object {
  
  /**
    * A boolean to specify if the stylesheet should be generated or not
    **/
  var autogenerate_stylesheet: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, all the CSS required to  osition      l widgets in their respective col umns and rows will be generated automatically and injectedt the<head> of thed cument.You can set this to false, and write your own CSS targeting rows and cols via data - attributes like so: [data - col = "1"] { left: 10px; }
    * Default = true
    **/
  var autogenerate_sytesheet: js.UndefOr[Boolean] = js.native
  
  /**
    * Avoid that widgets loaded from the DOM can be overlapped.  It is helpful if the positions were bad stored in the database or if there was any conflict.
    * Default = true
    **/
  var avoid_overlapped_widgets: js.UndefOr[Boolean] = js.native
  
  /**
    * An object with all options for Collision class you want to overwrite.  @see GridsterCollision or docs for more info.
    **/
  var collision: js.UndefOr[GridsterCollision] = js.native
  
  /**
    * An object with all options for Draggable class you want to overwrite.  @see GridsterDraggable or docs for more info.
    **/
  var draggable: js.UndefOr[GridsterDraggable] = js.native
  
  /**
    * Add more columns in addition to those that have been calculated.
    * Default = 0
    **/
  var extra_cols: js.UndefOr[Double] = js.native
  
  /**
    * Add more rows in addition to those that have been calculated.
    * Default = 0
    **/
  var extra_rows: js.UndefOr[Double] = js.native
  
  /**
    * The maximum columns possible (set to null for no maximum).
    * Default = null
    **/
  var max_cols: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of columns that a widget can span.
    * Default = 6
    **/
  var max_size_x: js.UndefOr[Double] = js.native
  
  /**
    * The minimum required columns.
    * Default = 1
    **/
  var min_cols: js.UndefOr[Double] = js.native
  
  /**
    * The minimum required rows.
    * Default = 15
    **/
  var min_rows: js.UndefOr[Double] = js.native
  
  /**
    * A string to differentiate one gridster from another
    **/
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * An object with all options for Resizable class you want to overwrite.  @see GridsterResizable or docs for more info.
    **/
  var resize: js.UndefOr[GridsterResizable] = js.native
  
  /**
    * Return the data you want for each widget in the serialization.
    **/
  var serialize_params: js.UndefOr[js.Function2[/* $w */ JQuery, /* wgd */ GridsterCoords, _]] = js.native
  
  /**
    * Base widget dimensions in pixels.  The first index for the width and the second for the height.
    * Default = [400, 225]
    **/
  var widget_base_dimensions: js.UndefOr[js.Array[auto | Double]] = js.native
  
  /**
    * Margin between widgets.  The first index for the horizontal margin (left, right) and the second for the vertical margin (top, bottom).
    * Default = [10, 10]
    **/
  var widget_margins: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Define who will be the draggable widgets.  Can be a CSS Selector String or a collection of HTMLElements.
    * Type => string css selector
    * Type => HTMLElement[]
    * Default = 'li'
    **/
  var widget_selector: js.UndefOr[String | js.Array[HTMLElement]] = js.native
}
object GridsterOptions {
  
  @scala.inline
  def apply(): GridsterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterOptions]
  }
  
  @scala.inline
  implicit class GridsterOptionsOps[Self <: GridsterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutogenerate_stylesheet(value: Boolean): Self = this.set("autogenerate_stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutogenerate_stylesheet: Self = this.set("autogenerate_stylesheet", js.undefined)
    
    @scala.inline
    def setAutogenerate_sytesheet(value: Boolean): Self = this.set("autogenerate_sytesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutogenerate_sytesheet: Self = this.set("autogenerate_sytesheet", js.undefined)
    
    @scala.inline
    def setAvoid_overlapped_widgets(value: Boolean): Self = this.set("avoid_overlapped_widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoid_overlapped_widgets: Self = this.set("avoid_overlapped_widgets", js.undefined)
    
    @scala.inline
    def setCollision(value: GridsterCollision): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    
    @scala.inline
    def setDraggable(value: GridsterDraggable): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setExtra_cols(value: Double): Self = this.set("extra_cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra_cols: Self = this.set("extra_cols", js.undefined)
    
    @scala.inline
    def setExtra_rows(value: Double): Self = this.set("extra_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra_rows: Self = this.set("extra_rows", js.undefined)
    
    @scala.inline
    def setMax_cols(value: Double): Self = this.set("max_cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_cols: Self = this.set("max_cols", js.undefined)
    
    @scala.inline
    def setMax_size_x(value: Double): Self = this.set("max_size_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_size_x: Self = this.set("max_size_x", js.undefined)
    
    @scala.inline
    def setMin_cols(value: Double): Self = this.set("min_cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_cols: Self = this.set("min_cols", js.undefined)
    
    @scala.inline
    def setMin_rows(value: Double): Self = this.set("min_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_rows: Self = this.set("min_rows", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setResize(value: GridsterResizable): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSerialize_params(value: (/* $w */ JQuery, /* wgd */ GridsterCoords) => _): Self = this.set("serialize_params", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSerialize_params: Self = this.set("serialize_params", js.undefined)
    
    @scala.inline
    def setWidget_base_dimensionsVarargs(value: (auto | Double)*): Self = this.set("widget_base_dimensions", js.Array(value :_*))
    
    @scala.inline
    def setWidget_base_dimensions(value: js.Array[auto | Double]): Self = this.set("widget_base_dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget_base_dimensions: Self = this.set("widget_base_dimensions", js.undefined)
    
    @scala.inline
    def setWidget_marginsVarargs(value: Double*): Self = this.set("widget_margins", js.Array(value :_*))
    
    @scala.inline
    def setWidget_margins(value: js.Array[Double]): Self = this.set("widget_margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget_margins: Self = this.set("widget_margins", js.undefined)
    
    @scala.inline
    def setWidget_selectorVarargs(value: HTMLElement*): Self = this.set("widget_selector", js.Array(value :_*))
    
    @scala.inline
    def setWidget_selector(value: String | js.Array[HTMLElement]): Self = this.set("widget_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget_selector: Self = this.set("widget_selector", js.undefined)
  }
}
