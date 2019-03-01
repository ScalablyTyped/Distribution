package typings
package jqueryDotFancytreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  /**
    * false: Append random '_' argument to the request url to prevent caching.
    */
  var cache: scala.Boolean
  /**
    * Default 'json' -> Expect json format and pass json object to callbacks.
    */
  var dataType: java.lang.String
  /**
    * HTTP Method (default: 'GET')
    */
  var `type`: java.lang.String
}

object Anon_Cache {
  @scala.inline
  def apply(cache: scala.Boolean, dataType: java.lang.String, `type`: java.lang.String): Anon_Cache = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("dataType")(dataType)
    __obj.asInstanceOf[Anon_Cache]
  }
}

