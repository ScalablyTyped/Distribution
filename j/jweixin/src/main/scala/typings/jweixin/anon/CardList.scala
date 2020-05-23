package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardList extends js.Object {
  var cardList: js.Array[String]
}

object CardList {
  @scala.inline
  def apply(cardList: js.Array[String]): CardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardList]
  }
}

