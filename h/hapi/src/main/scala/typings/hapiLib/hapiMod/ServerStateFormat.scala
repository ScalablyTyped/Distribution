package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStateFormat extends js.Object {
  var name: java.lang.String
  var options: ServerStateCookieOptions
  var value: java.lang.String
}

object ServerStateFormat {
  @scala.inline
  def apply(name: java.lang.String, options: ServerStateCookieOptions, value: java.lang.String): ServerStateFormat = {
    val __obj = js.Dynamic.literal(name = name, options = options, value = value)
  
    __obj.asInstanceOf[ServerStateFormat]
  }
}

