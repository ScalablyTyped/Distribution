package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typings.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  class Popup protected ()
    extends typings.jupyterlabStatusbar.hoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  def showPopup(options: IOptions): typings.jupyterlabStatusbar.hoverMod.Popup = js.native
  @js.native
  object GroupItem extends js.Object {
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  @js.native
  object ProgressBar extends js.Object {
    def apply(props: typings.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): Element = js.native
  }
  
  @js.native
  object TextItem extends js.Object {
    def apply(props: typings.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]): ReactElement = js.native
  }
  
}

