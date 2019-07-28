package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStateFormat extends js.Object {
  var name: String
  var options: ServerStateCookieOptions
  var value: String
}

object ServerStateFormat {
  @scala.inline
  def apply(name: String, options: ServerStateCookieOptions, value: String): ServerStateFormat = {
    val __obj = js.Dynamic.literal(name = name, options = options, value = value)
  
    __obj.asInstanceOf[ServerStateFormat]
  }
}

