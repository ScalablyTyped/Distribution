package typings.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFrontendMod {
  import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
  import typings.atPhosphorApplication.atPhosphorApplicationMod.IPlugin

  type JupyterFrontEndPlugin[T] = IPlugin[JupyterFrontEnd[IShell], T]
}
