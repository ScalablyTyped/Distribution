package typings
package jschannelLib.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var error: js.UndefOr[js.Function2[/* error */ js.Any, /* message */ java.lang.String, scala.Unit]] = js.undefined
  var method: java.lang.String
  var params: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ js.Any, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    method: java.lang.String,
    error: js.Function2[/* error */ js.Any, /* message */ java.lang.String, scala.Unit] = null,
    params: js.Any = null,
    success: js.Function1[/* result */ js.Any, scala.Unit] = null,
    timeout: scala.Int | scala.Double = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    if (error != null) __obj.updateDynamic("error")(error)
    if (params != null) __obj.updateDynamic("params")(params)
    if (success != null) __obj.updateDynamic("success")(success)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

