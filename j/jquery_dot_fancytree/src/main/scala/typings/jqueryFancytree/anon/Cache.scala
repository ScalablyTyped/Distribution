package typings.jqueryFancytree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
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

object Cache {
  @scala.inline
  def apply(cache: Boolean, dataType: String, `type`: String): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

