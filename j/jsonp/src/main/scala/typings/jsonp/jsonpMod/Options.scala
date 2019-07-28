package typings.jsonp.jsonpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var param: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(name: String = null, param: String = null, prefix: String = null, timeout: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (param != null) __obj.updateDynamic("param")(param)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

