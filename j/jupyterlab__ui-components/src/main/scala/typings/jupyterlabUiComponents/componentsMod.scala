package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.htmlselectMod.IHTMLSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@jupyterlab/ui-components/lib/components", "DEFAULT_STYLE_CLASS")
  @js.native
  val DEFAULT_STYLE_CLASS: /* "jp-DefaultStyle" */ String = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/components", "HTMLSelect")
  @js.native
  class HTMLSelect protected ()
    extends typings.jupyterlabUiComponents.htmlselectMod.HTMLSelect {
    def this(props: IHTMLSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IHTMLSelectProps, context: js.Any) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components", "HTML_SELECT_CLASS")
  @js.native
  val HTML_SELECT_CLASS: /* "jp-HTMLSelect" */ String = js.native
}
