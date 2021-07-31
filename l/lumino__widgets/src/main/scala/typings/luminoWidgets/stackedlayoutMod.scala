package typings.luminoWidgets

import typings.luminoWidgets.layoutMod.Layout.IOptions
import typings.luminoWidgets.panellayoutMod.PanelLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedlayoutMod {
  
  @JSImport("@lumino/widgets/types/stackedlayout", "StackedLayout")
  @js.native
  /**
    * Construct a new layout.
    *
    * @param options - The options for initializing the layout.
    */
  class StackedLayout () extends PanelLayout {
    def this(options: IOptions) = this()
    
    var _box: js.Any = js.native
    
    var _dirty: js.Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    var _fit: js.Any = js.native
    
    var _items: js.Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    var _update: js.Any = js.native
  }
}
