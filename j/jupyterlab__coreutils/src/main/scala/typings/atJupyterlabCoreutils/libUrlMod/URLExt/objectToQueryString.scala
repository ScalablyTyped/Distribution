package typings.atJupyterlabCoreutils.libUrlMod.URLExt

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/url", "URLExt.objectToQueryString")
@js.native
object objectToQueryString extends js.Object {
  /**
    * Return a serialized object string suitable for a query.
    *
    * @param object - The source object.
    *
    * @returns an encoded url query.
    *
    * #### Notes
    * Modified version of [stackoverflow](http://stackoverflow.com/a/30707423).
    */
  def apply(value: JSONObject): String = js.native
}

