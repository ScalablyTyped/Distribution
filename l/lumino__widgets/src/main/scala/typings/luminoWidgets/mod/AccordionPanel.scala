package typings.luminoWidgets.mod

import typings.luminoWidgets.typesAccordionpanelMod.AccordionPanel.IOptions
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
  extends typings.luminoWidgets.typesAccordionpanelMod.AccordionPanel {
  def this(options: IOptions) = this()
}
object AccordionPanel {
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "AccordionPanel.Renderer")
  @js.native
  open class Renderer ()
    extends typings.luminoWidgets.typesAccordionpanelMod.AccordionPanel.Renderer
  object Renderer {
    
    @JSImport("@lumino/widgets", "AccordionPanel.Renderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@lumino/widgets", "AccordionPanel.Renderer._nInstance")
    @js.native
    def nInstance: Any = js.native
    
    inline def nInstance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_nInstance")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "AccordionPanel.defaultRenderer")
  @js.native
  val defaultRenderer: typings.luminoWidgets.typesAccordionpanelMod.AccordionPanel.Renderer = js.native
}
