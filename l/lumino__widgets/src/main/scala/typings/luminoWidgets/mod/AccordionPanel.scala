package typings.luminoWidgets.mod

import typings.luminoWidgets.accordionpanelMod.AccordionPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "AccordionPanel")
@js.native
/**
  * Construct a new accordion panel.
  *
  * @param options - The options for initializing the accordion panel.
  */
open class AccordionPanel ()
  extends typings.luminoWidgets.accordionpanelMod.AccordionPanel {
  def this(options: IOptions) = this()
}
object AccordionPanel {
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "AccordionPanel.Renderer")
  @js.native
  open class Renderer ()
    extends typings.luminoWidgets.accordionpanelMod.AccordionPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "AccordionPanel.defaultRenderer")
  @js.native
  val defaultRenderer: typings.luminoWidgets.accordionpanelMod.AccordionPanel.Renderer = js.native
}
