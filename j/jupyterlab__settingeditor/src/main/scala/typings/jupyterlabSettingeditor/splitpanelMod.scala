package typings.jupyterlabSettingeditor

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.splitpanelMod.SplitPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitpanelMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/splitpanel", "SplitPanel")
  @js.native
  /**
    * Construct a new split panel.
    *
    * @param options - The options for initializing the split panel.
    */
  class SplitPanel ()
    extends typings.luminoWidgets.mod.SplitPanel {
    def this(options: IOptions) = this()
    
    /**
      * Emits when the split handle has moved.
      */
    val handleMoved: ISignal[js.Any, Unit] = js.native
  }
}
