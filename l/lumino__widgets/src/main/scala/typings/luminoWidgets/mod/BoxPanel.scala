package typings.luminoWidgets.mod

import typings.luminoWidgets.boxpanelMod.BoxPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "BoxPanel")
@js.native
/**
  * Construct a new box panel.
  *
  * @param options - The options for initializing the box panel.
  */
class BoxPanel ()
  extends typings.luminoWidgets.boxpanelMod.BoxPanel {
  def this(options: IOptions) = this()
}
object BoxPanel {
  
  /**
    * Get the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel size basis for the widget.
    */
  @JSImport("@lumino/widgets", "BoxPanel.getSizeBasis")
  @js.native
  def getSizeBasis(widget: typings.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Get the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel stretch factor for the widget.
    */
  @JSImport("@lumino/widgets", "BoxPanel.getStretch")
  @js.native
  def getStretch(widget: typings.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Set the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  @JSImport("@lumino/widgets", "BoxPanel.setSizeBasis")
  @js.native
  def setSizeBasis(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
  
  /**
    * Set the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  @JSImport("@lumino/widgets", "BoxPanel.setStretch")
  @js.native
  def setStretch(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
}
