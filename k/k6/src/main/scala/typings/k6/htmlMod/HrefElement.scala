package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "HrefElement")
@js.native
abstract class HrefElement () extends Element {
  
  /** `#` prefixed URL fragment identifier. */
  def hash(): String = js.native
  
  /** URL hostname plus `:` delimited port if nonempty. `hostname[:port]` */
  def host(): String = js.native
  
  /** URL hostname. */
  def hostname(): String = js.native
  
  /** Unicode serialization of URL origin. */
  def origin(): String = js.native
  
  /** URL password. */
  def password(): String = js.native
  
  /** `/` prefixed URL path. */
  def pathname(): String = js.native
  
  /** URL port number. Empty string if unspecified. */
  def port(): String = js.native
  
  /** `:` suffixed URL protocol scheme. */
  def protocol(): String = js.native
  
  /** Link types. */
  def relList(): js.Array[String] = js.native
  
  /** `?` prefixed URL query string. */
  def search(): String = js.native
  
  /** Text content. */
  def text(): String = js.native
  
  /** URL username. */
  def username(): String = js.native
}
