package typings
package atHapiCatboxLib.atHapiCatboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKey extends js.Object {
  /** id - a unique item identifier string (per segment). Can be an empty string. */
  var id: java.lang.String
  /** segment - a caching segment name string. Enables using a single cache server for storing different sets of items with overlapping ids. */
  var segment: java.lang.String
}

object CacheKey {
  @scala.inline
  def apply(id: java.lang.String, segment: java.lang.String): CacheKey = {
    val __obj = js.Dynamic.literal(id = id, segment = segment)
  
    __obj.asInstanceOf[CacheKey]
  }
}

