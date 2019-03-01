package typings
package koaDashBodyparserLib.koaDashBodyparserMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.Any
  var rawBody: java.lang.String
}

object Request {
  @scala.inline
  def apply(body: js.Any, rawBody: java.lang.String): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("rawBody")(rawBody)
    __obj.asInstanceOf[Request]
  }
}

