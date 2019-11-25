package typings.atHapiCatbox.atHapiCatboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKey extends js.Object {
  /** id - a unique item identifier string (per segment). Can be an empty string. */
  var id: String
  /** segment - a caching segment name string. Enables using a single cache server for storing different sets of items with overlapping ids. */
  var segment: String
}

object CacheKey {
  @scala.inline
  def apply(id: String, segment: String): CacheKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheKey]
  }
}

