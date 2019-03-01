package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: scala.Double
  var message: java.lang.String
  var name: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, name: java.lang.String): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Error]
  }
}

