package typings.hapiAddress.mod.uri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/address", "uri.decode")
@js.native
object decode extends js.Object {
  /**
    * Faster version of decodeURIComponent() that does not throw.
    * 
    * @param string - the URL string to decode.
    * 
    * @returns the decoded string or null if invalid.
    */
  def apply(string: String): String | Null = js.native
}

