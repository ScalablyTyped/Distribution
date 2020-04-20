package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardExt extends js.Object {
  var cardExt: String
  var cardId: String
}

object AnonCardExt {
  @scala.inline
  def apply(cardExt: String, cardId: String): AnonCardExt = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardExt]
  }
}

