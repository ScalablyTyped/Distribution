package typings.kafkajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicsArray extends js.Object {
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_TopicsArray {
  @scala.inline
  def apply(topics: js.Array[String] = null): Anon_TopicsArray = {
    val __obj = js.Dynamic.literal()
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_TopicsArray]
  }
}

