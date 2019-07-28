package typings.loadjs.loadjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyOptions extends js.Object {
  var error: js.UndefOr[js.Function1[/* depsNotFound */ String, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ReadyOptions {
  @scala.inline
  def apply(error: /* depsNotFound */ String => Unit = null, success: () => Unit = null): ReadyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[ReadyOptions]
  }
}

