package typings.httpLinkHeader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-header", JSImport.Namespace)
@js.native
/**
  * Link
  * @param value Link header to parse
  */
class ^ () extends Link {
  def this(value: String) = this()
}

@JSImport("http-link-header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Link by parsing a link header beginning at the provided
    * offset
    * @param value The header to parse
    * @param offset The offset to start at. Defaults to 0.
    * @return A new Link
    */
  def parse(value: String): Link = js.native
  def parse(value: String, offset: Double): Link = js.native
}

