package typings.luminoWidgets.mod

import typings.luminoWidgets.splitlayoutMod.SplitLayout.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "SplitLayout")
@js.native
class SplitLayout protected ()
  extends typings.luminoWidgets.splitlayoutMod.SplitLayout {
  /**
    * Construct a new split layout.
    *
    * @param options - The options for initializing the layout.
    */
  def this(options: IOptions) = this()
}
object SplitLayout {
  
  /**
    * Get the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split layout stretch factor for the widget.
    */
  @JSImport("@lumino/widgets", "SplitLayout.getStretch")
  @js.native
  def getStretch(widget: typings.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Set the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  @JSImport("@lumino/widgets", "SplitLayout.setStretch")
  @js.native
  def setStretch(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
}
