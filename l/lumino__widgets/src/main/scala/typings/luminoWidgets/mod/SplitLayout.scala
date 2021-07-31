package typings.luminoWidgets.mod

import typings.luminoWidgets.splitlayoutMod.SplitLayout.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("@lumino/widgets", "SplitLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split layout stretch factor for the widget.
    */
  @scala.inline
  def getStretch(widget: typings.luminoWidgets.widgetMod.Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Set the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  @scala.inline
  def setStretch(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
