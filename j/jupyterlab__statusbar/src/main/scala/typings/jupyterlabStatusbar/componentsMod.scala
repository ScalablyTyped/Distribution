package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typings.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  object GroupItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components", "GroupItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar/lib/components", "Popup")
  @js.native
  class Popup protected ()
    extends typings.jupyterlabStatusbar.hoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  object ProgressBar {
    
    @JSImport("@jupyterlab/statusbar/lib/components", "ProgressBar")
    @js.native
    def apply(props: typings.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): Element = js.native
  }
  
  object TextItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components", "TextItem")
    @js.native
    def apply(props: typings.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar/lib/components", "showPopup")
  @js.native
  def showPopup(options: IOptions): typings.jupyterlabStatusbar.hoverMod.Popup = js.native
}
