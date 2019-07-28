package typings.atJupyterlabApputils.atJupyterlabApputilsMod

import typings.atJupyterlabApputils.libDialogMod.DialogNs.IButton
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IOptions
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IResult
import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer
import typings.atJupyterlabApputils.libToolbarMod.CommandToolbarButtonComponentNs.IProps
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.react.reactMod.Global.JSXNs.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ICommandPalette: Token[typings.atJupyterlabApputils.libCommandpaletteMod.ICommandPalette] = js.native
  val ISplashScreen: Token[typings.atJupyterlabApputils.libSplashMod.ISplashScreen] = js.native
  val IThemeManager: Token[typings.atJupyterlabApputils.libTokensMod.IThemeManager] = js.native
  val IWindowResolver: Token[typings.atJupyterlabApputils.libWindowresolverMod.IWindowResolver] = js.native
  val defaultSanitizer: ISanitizer = js.native
  def CommandToolbarButtonComponent(props: IProps): Element = js.native
  def ToolbarButtonComponent(props: typings.atJupyterlabApputils.libToolbarMod.ToolbarButtonComponentNs.IProps): Element = js.native
  def addCommandToolbarButtonClass(w: Widget): Widget = js.native
  def addToolbarButtonClass(w: Widget): Widget = js.native
  def showDialog[T](): js.Promise[IResult[T]] = js.native
  def showDialog[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = js.native
  def showErrorMessage(title: String, error: js.Any): js.Promise[Unit] = js.native
  def showErrorMessage(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = js.native
}

