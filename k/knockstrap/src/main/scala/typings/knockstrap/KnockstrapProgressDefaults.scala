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
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], striped = striped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textHidden = textHidden.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapProgressDefaults]
  }
}

