package typings.atJupyterlabStatusbar.atJupyterlabStatusbarMod

import typings.atJupyterlabStatusbar.libComponentsGroupMod.GroupItemNs.IProps
import typings.atJupyterlabStatusbar.libComponentsHoverMod.PopupNs.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactElement
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IStatusBar: Token[typings.atJupyterlabStatusbar.libTokensMod.IStatusBar] = js.native
  val clickedItem: String = js.native
  val interactiveItem: String = js.native
  val item: String = js.native
  val leftSide: String = js.native
  val rightSide: String = js.native
  val side: String = js.native
  val statusBar: String = js.native
  def GroupItem(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  def IconItem(
    props: typings.atJupyterlabStatusbar.libDeprecatedMod.IconItemNs.IProps with HTMLAttributes[HTMLDivElement]
  ): ReactElement = js.native
  def ProgressBar(props: typings.atJupyterlabStatusbar.libComponentsProgressBarMod.ProgressBarNs.IProps): Element = js.native
  def TextItem(
    props: typings.atJupyterlabStatusbar.libComponentsTextMod.TextItemNs.IProps with HTMLAttributes[HTMLSpanElement]
  ): ReactElement = js.native
  def showPopup(options: IOptions): typings.atJupyterlabStatusbar.libComponentsHoverMod.Popup = js.native
}

