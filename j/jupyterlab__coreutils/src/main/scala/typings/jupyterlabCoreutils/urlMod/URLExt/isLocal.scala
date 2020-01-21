package typings.jupyterlabCoreutils.urlMod.URLExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/url", "URLExt.isLocal")
@js.native
object isLocal extends js.Object {
  /**
    * Test whether the url is a local url.
    *
    * #### Notes
    * This function returns `false` for any fully qualified url, including
    * `data:`, `file:`, and `//` protocol URLs.
    */
  def apply(url: String): Boolean = js.native
}

