package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardExt extends js.Object {
  var cardExt: String
  var cardId: String
}

object CardExt {
  @scala.inline
  def apply(cardExt: String, cardId: String): CardExt = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardExt]
  }
}

