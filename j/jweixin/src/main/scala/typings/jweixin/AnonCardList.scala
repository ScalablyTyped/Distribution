package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardList extends js.Object {
  var cardList: js.Array[String]
}

object AnonCardList {
  @scala.inline
  def apply(cardList: js.Array[String]): AnonCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardList]
  }
}

