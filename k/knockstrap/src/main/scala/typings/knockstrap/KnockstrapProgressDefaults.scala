package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapProgressDefaults extends js.Object {
  var animated: Boolean
  var css: String
  var striped: Boolean
  var text: String
  var textHidden: Boolean
  var `type`: String
}

object KnockstrapProgressDefaults {
  @scala.inline
  def apply(
    animated: Boolean,
    css: String,
    striped: Boolean,
    text: String,
    textHidden: Boolean,
    `type`: String
  ): KnockstrapProgressDefaults = {
    val __obj = js.Dynamic.literal(animated = animated, css = css, striped = striped, text = text, textHidden = textHidden)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KnockstrapProgressDefaults]
  }
}

