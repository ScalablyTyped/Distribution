package typings
package koaDashXmlDashBodyLib.koaDashXmlDashBodyMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.Any
}

object Request {
  @scala.inline
  def apply(body: js.Any): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Request]
  }
}

