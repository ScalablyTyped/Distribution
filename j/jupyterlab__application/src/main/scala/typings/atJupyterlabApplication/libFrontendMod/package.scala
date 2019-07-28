package typings.atJupyterlabApplication

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import typings.atPhosphorApplication.atPhosphorApplicationMod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFrontendMod {
  type JupyterFrontEndPlugin[T] = IPlugin[JupyterFrontEnd[IShell], T]
}
