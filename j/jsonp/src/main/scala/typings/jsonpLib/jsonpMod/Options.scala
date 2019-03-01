package typings
package jsonpLib.jsonpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var param: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    param: java.lang.String = null,
    prefix: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (param != null) __obj.updateDynamic("param")(param)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

