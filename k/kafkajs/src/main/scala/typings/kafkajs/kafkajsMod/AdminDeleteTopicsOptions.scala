package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDeleteTopicsOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var topics: js.Array[String]
}

object AdminDeleteTopicsOptions {
  @scala.inline
  def apply(topics: js.Array[String], timeout: Int | Double = null): AdminDeleteTopicsOptions = {
    val __obj = js.Dynamic.literal(topics = topics)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteTopicsOptions]
  }
}

