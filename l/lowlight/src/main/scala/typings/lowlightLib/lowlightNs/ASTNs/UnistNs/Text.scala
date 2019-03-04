package typings
package lowlightLib.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends Node {
  var value: java.lang.String
}

object Text {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String, data: Data = null, position: Location = null): Text = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Text]
  }
}

