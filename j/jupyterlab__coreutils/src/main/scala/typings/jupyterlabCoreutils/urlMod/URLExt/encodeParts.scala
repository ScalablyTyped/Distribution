package typings.jupyterlabCoreutils.urlMod.URLExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/url", "URLExt.encodeParts")
@js.native
object encodeParts extends js.Object {
  /**
    * Encode the components of a multi-segment url.
    *
    * @param url - The url to encode.
    *
    * @returns the encoded url.
    *
    * #### Notes
    * Preserves the `'/'` separators.
    * Should not include the base url, since all parts are escaped.
    */
  def apply(url: String): String = js.native
}

