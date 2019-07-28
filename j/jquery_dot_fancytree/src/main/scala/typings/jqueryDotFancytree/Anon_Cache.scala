package typings.jqueryDotFancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
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

object Anon_Cache {
  @scala.inline
  def apply(cache: Boolean, dataType: String, `type`: String): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache, dataType = dataType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Cache]
  }
}

