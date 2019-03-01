package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: java.lang.String
   //"400",
  var message: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Code]
  }
}

