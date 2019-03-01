package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapProgressDefaults extends js.Object {
  var animated: scala.Boolean
  var css: java.lang.String
  var striped: scala.Boolean
  var text: java.lang.String
  var textHidden: scala.Boolean
  var `type`: java.lang.String
}

object KnockstrapProgressDefaults {
  @scala.inline
  def apply(
    animated: scala.Boolean,
    css: java.lang.String,
    striped: scala.Boolean,
    text: java.lang.String,
    textHidden: scala.Boolean,
    `type`: java.lang.String
  ): KnockstrapProgressDefaults = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("animated")(animated)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("striped")(striped)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("textHidden")(textHidden)
    __obj.asInstanceOf[KnockstrapProgressDefaults]
  }
}

