package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDeleteTopicsOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var topics: js.Array[java.lang.String]
}

object AdminDeleteTopicsOptions {
  @scala.inline
  def apply(topics: js.Array[java.lang.String], timeout: scala.Int | scala.Double = null): AdminDeleteTopicsOptions = {
    val __obj = js.Dynamic.literal(topics = topics)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteTopicsOptions]
  }
}

