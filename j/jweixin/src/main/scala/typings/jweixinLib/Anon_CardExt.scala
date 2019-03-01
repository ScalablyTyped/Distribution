package typings
package jweixinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardExt extends js.Object {
  var cardExt: java.lang.String
  var cardId: java.lang.String
}

object Anon_CardExt {
  @scala.inline
  def apply(cardExt: java.lang.String, cardId: java.lang.String): Anon_CardExt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardExt")(cardExt)
    __obj.updateDynamic("cardId")(cardId)
    __obj.asInstanceOf[Anon_CardExt]
  }
}

