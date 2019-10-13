package typings.atJupyterlabStatusbar

import typings.atJupyterlabStatusbar.libComponentsGroupMod.GroupItem.IProps
import typings.atJupyterlabStatusbar.libComponentsHoverMod.Popup.IOptions
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
@js.native
object libComponentsMod extends js.Object {
  @js.native
  class Popup protected ()
    extends typings.atJupyterlabStatusbar.libComponentsHoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  def showPopup(options: IOptions): typings.atJupyterlabStatusbar.libComponentsHoverMod.Popup = js.native
  @js.native
  object GroupItem extends js.Object {
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  @js.native
  object ProgressBar extends js.Object {
    def apply(props: typings.atJupyterlabStatusbar.libComponentsProgressBarMod.ProgressBar.IProps): Element = js.native
  }
  
  @js.native
  object TextItem extends js.Object {
    def apply(
      props: typings.atJupyterlabStatusbar.libComponentsTextMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
    ): ReactElement = js.native
  }
  
}

