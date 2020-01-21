package typings.jqueryFancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  /**
    * false: Append random '_' argument to the request url to prevent caching.
    */
  var cache: Boolean
  /**
    * Default 'json' -> Expect json format and pass json object to callbacks.
    */
  var dataType: String
  /**
    * HTTP Method (default: 'GET')
    */
  var `type`: String
}

object AnonCache {
  @scala.inline
  def apply(cache: Boolean, dataType: String, `type`: String): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

