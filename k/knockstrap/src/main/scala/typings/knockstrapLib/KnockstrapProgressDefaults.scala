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
    val __obj = js.Dynamic.literal(animated = animated, css = css, striped = striped, text = text, textHidden = textHidden)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KnockstrapProgressDefaults]
  }
}

