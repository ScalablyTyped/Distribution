package typings.atJupyterlabStatusbar.libComponentsMod

import typings.atJupyterlabStatusbar.libComponentsGroupMod.GroupItemNs.IProps
import typings.atJupyterlabStatusbar.libComponentsHoverMod.PopupNs.IOptions
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactElement
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def GroupItem(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  def IconItem(
    props: typings.atJupyterlabStatusbar.libComponentsIconMod.IconItemNs.IProps with HTMLAttributes[HTMLDivElement]
  ): ReactElement = js.native
  def ProgressBar(props: typings.atJupyterlabStatusbar.libComponentsProgressBarMod.ProgressBarNs.IProps): Element = js.native
  def TextItem(
    props: typings.atJupyterlabStatusbar.libComponentsTextMod.TextItemNs.IProps with HTMLAttributes[HTMLSpanElement]
  ): ReactElement = js.native
  def showPopup(options: IOptions): typings.atJupyterlabStatusbar.libComponentsHoverMod.Popup = js.native
}

