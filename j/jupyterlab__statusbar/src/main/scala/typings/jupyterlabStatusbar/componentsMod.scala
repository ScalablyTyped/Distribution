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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GroupItem(props: IProps & HTMLAttributes[HTMLDivElement]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GroupItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@jupyterlab/statusbar/lib/components", "Popup")
  @js.native
  class Popup protected ()
    extends typings.jupyterlabStatusbar.hoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  inline def ProgressBar(props: typings.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TextItem(props: typings.jupyterlabStatusbar.textMod.TextItem.IProps & HTMLAttributes[HTMLSpanElement]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TextItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def showPopup(options: IOptions): typings.jupyterlabStatusbar.hoverMod.Popup = ^.asInstanceOf[js.Dynamic].applyDynamic("showPopup")(options.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabStatusbar.hoverMod.Popup]
}
