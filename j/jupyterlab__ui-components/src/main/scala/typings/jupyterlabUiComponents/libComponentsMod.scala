package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.libComponentsHtmlselectMod.IHTMLSelectProps
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMod {
  
  @JSImport("@jupyterlab/ui-components/lib/components", "DEFAULT_STYLE_CLASS")
  @js.native
  val DEFAULT_STYLE_CLASS: /* "jp-DefaultStyle" */ String = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/components", "HTMLSelect")
  @js.native
  open class HTMLSelect protected ()
    extends typings.jupyterlabUiComponents.libComponentsHtmlselectMod.HTMLSelect {
    def this(props: IHTMLSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IHTMLSelectProps, context: Any) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components", "HTML_SELECT_CLASS")
  @js.native
  val HTML_SELECT_CLASS: /* "jp-HTMLSelect" */ String = js.native
  
  object IRankedMenu {
    
    /**
      * Default menu item rank
      */
    @JSImport("@jupyterlab/ui-components/lib/components", "IRankedMenu.DEFAULT_RANK")
    @js.native
    val DEFAULT_RANK: /* 100 */ Double = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components", "RankedMenu")
  @js.native
  open class RankedMenu protected ()
    extends typings.jupyterlabUiComponents.libComponentsMenuMod.RankedMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the lumino menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components", "Switch")
  @js.native
  open class Switch ()
    extends typings.jupyterlabUiComponents.libComponentsSwitchMod.Switch
}
