package typings.luminoWidgets.boxpanelMod

import typings.luminoWidgets.boxpanelMod.BoxPanel.Alignment
import typings.luminoWidgets.boxpanelMod.BoxPanel.Direction
import typings.luminoWidgets.boxpanelMod.BoxPanel.IOptions
import typings.luminoWidgets.panelMod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/boxpanel", "BoxPanel")
@js.native
/**
  * Construct a new box panel.
  *
  * @param options - The options for initializing the box panel.
  */
class BoxPanel_ () extends Panel {
  def this(options: IOptions) = this()
  
  /**
    * Get the content alignment for the box panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  /**
    * Set the content alignment for the box panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  var alignment: Alignment = js.native
  
  /**
    * Get the layout direction for the box panel.
    */
  /**
    * Set the layout direction for the box panel.
    */
  var direction: Direction = js.native
  
  /**
    * Get the inter-element spacing for the box panel.
    */
  /**
    * Set the inter-element spacing for the box panel.
    */
  var spacing: Double = js.native
}
