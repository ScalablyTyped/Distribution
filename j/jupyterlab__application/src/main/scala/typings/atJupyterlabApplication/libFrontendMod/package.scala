package typings.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFrontendMod {
  import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
  import typings.atPhosphorApplication.atPhosphorApplicationMod.IPlugin

  type JupyterFrontEnd[T /* <: IShell */] = JupyterFrontEnd_[T]
  type JupyterFrontEndPlugin[T] = IPlugin[JupyterFrontEnd[IShell], T]
}
