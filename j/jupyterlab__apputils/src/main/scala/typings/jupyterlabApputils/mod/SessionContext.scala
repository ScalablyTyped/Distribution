package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.sessioncontextMod.SessionContext.IKernelSearch
import typings.jupyterlabApputils.sessioncontextMod.SessionContext.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "SessionContext")
@js.native
class SessionContext protected ()
  extends typings.jupyterlabApputils.sessioncontextMod.SessionContext {
  /**
    * Construct a new session context.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/apputils", "SessionContext")
@js.native
object SessionContext extends js.Object {
  /**
    * Get the default kernel name given select options.
    */
  def getDefaultKernel(options: IKernelSearch): String | Null = js.native
}

