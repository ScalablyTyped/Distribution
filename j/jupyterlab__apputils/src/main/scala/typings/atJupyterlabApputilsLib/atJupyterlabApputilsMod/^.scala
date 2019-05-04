package typings
package atJupyterlabApputilsLib.atJupyterlabApputilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ICommandPalette: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabApputilsLib.libCommandpaletteMod.ICommandPalette] = js.native
  val ISplashScreen: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabApputilsLib.libSplashMod.ISplashScreen] = js.native
  val IThemeManager: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabApputilsLib.libThememanagerMod.IThemeManager] = js.native
  val IWindowResolver: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabApputilsLib.libWindowresolverMod.IWindowResolver] = js.native
  val defaultSanitizer: atJupyterlabApputilsLib.libSanitizerMod.ISanitizer = js.native
  def ToolbarButtonComponent(props: atJupyterlabApputilsLib.libToolbarMod.ToolbarButtonComponentNs.IProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def showDialog[T](): js.Promise[atJupyterlabApputilsLib.libDialogMod.DialogNs.IResult[T]] = js.native
  def showDialog[T](options: stdLib.Partial[atJupyterlabApputilsLib.libDialogMod.DialogNs.IOptions[T]]): js.Promise[atJupyterlabApputilsLib.libDialogMod.DialogNs.IResult[T]] = js.native
  def showErrorMessage(title: java.lang.String, error: js.Any): js.Promise[scala.Unit] = js.native
}

