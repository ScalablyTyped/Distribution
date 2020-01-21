package typings.jupyterlabCoreutils.urlMod.URLExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/url", "URLExt.join")
@js.native
object join extends js.Object {
  /**
    * Join a sequence of url components and normalizes as in node `path.join`.
    *
    * @param parts - The url components.
    *
    * @returns the joined url.
    */
  def apply(parts: String*): String = js.native
}

