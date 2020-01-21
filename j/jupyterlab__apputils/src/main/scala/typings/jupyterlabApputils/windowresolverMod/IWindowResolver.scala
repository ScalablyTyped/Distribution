package typings.jupyterlabApputils.windowresolverMod

import org.scalablytyped.runtime.TopLevel
import typings.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowResolver extends js.Object {
  /**
    * A window name to use as a handle among shared resources.
    */
  val name: String
}

@JSImport("@jupyterlab/apputils/lib/windowresolver", "IWindowResolver")
@js.native
object IWindowResolver extends TopLevel[Token[IWindowResolver]]

