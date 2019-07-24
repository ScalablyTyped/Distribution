package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "HrefElement")
@js.native
abstract class HrefElement () extends Element {
  /** `#` prefixed URL fragment identifier. */
  def hash(): java.lang.String = js.native
  /** URL hostname plus `:` delimited port if nonempty. `hostname[:port]` */
  def host(): java.lang.String = js.native
  /** URL hostname. */
  def hostname(): java.lang.String = js.native
  /** Unicode serialization of URL origin. */
  def origin(): java.lang.String = js.native
  /** URL password. */
  def password(): java.lang.String = js.native
  /** `/` prefixed URL path. */
  def pathname(): java.lang.String = js.native
  /** URL port number. Empty string if unspecified. */
  def port(): java.lang.String = js.native
  /** `:` suffixed URL protocol scheme. */
  def protocol(): java.lang.String = js.native
  /** Link types. */
  def relList(): js.Array[java.lang.String] = js.native
  /** `?` prefixed URL query string. */
  def search(): java.lang.String = js.native
  /** Text content. */
  def text(): java.lang.String = js.native
  /** URL username. */
  def username(): java.lang.String = js.native
}

