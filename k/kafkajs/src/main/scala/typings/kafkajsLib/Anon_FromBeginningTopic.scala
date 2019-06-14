package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromBeginningTopic extends js.Object {
  var fromBeginning: js.UndefOr[scala.Boolean] = js.undefined
  var topic: java.lang.String
}

object Anon_FromBeginningTopic {
  @scala.inline
  def apply(topic: java.lang.String, fromBeginning: js.UndefOr[scala.Boolean] = js.undefined): Anon_FromBeginningTopic = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (!js.isUndefined(fromBeginning)) __obj.updateDynamic("fromBeginning")(fromBeginning)
    __obj.asInstanceOf[Anon_FromBeginningTopic]
  }
}

