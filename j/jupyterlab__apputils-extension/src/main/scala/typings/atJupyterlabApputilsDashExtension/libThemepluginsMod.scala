package typings.atJupyterlabApputilsDashExtension

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabApputils.libTokensMod.IThemeManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils-extension/lib/themeplugins", JSImport.Namespace)
@js.native
object libThemepluginsMod extends js.Object {
  val themesPaletteMenuPlugin: JupyterFrontEndPlugin[Unit] = js.native
  val themesPlugin: JupyterFrontEndPlugin[IThemeManager] = js.native
}

