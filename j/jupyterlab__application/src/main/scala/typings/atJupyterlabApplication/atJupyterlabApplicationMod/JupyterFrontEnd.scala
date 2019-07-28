package typings.atJupyterlabApplication.atJupyterlabApplicationMod

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IOptions
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", "JupyterFrontEnd")
@js.native
abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
  extends typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd[T] {
  /**
    * Construct a new JupyterFrontEnd object.
    */
  def this(options: IOptions[T, _]) = this()
}

