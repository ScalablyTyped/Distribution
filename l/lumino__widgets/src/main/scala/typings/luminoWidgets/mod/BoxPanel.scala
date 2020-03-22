package typings.luminoWidgets.mod

import typings.luminoWidgets.boxpanelMod.BoxPanel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("@lumino/widgets", "BoxPanel")
@js.native
object BoxPanel extends js.Object {
  /**
    * Get the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel size basis for the widget.
    */
  def getSizeBasis(widget: typings.luminoWidgets.widgetMod.Widget): Double = js.native
  /**
    * Get the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel stretch factor for the widget.
    */
  def getStretch(widget: typings.luminoWidgets.widgetMod.Widget): Double = js.native
  /**
    * Set the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
  /**
    * Set the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
}

