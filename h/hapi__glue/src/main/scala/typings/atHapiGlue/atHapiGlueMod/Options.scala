package typings.atHapiGlue.atHapiGlueMod

import typings.atHapiHapi.atHapiHapiMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var preConnections: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.undefined
  var preRegister: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.undefined
  var relativeTo: String
}

object Options {
  @scala.inline
  def apply(
    relativeTo: String,
    preConnections: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit = null,
    preRegister: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo)
    if (preConnections != null) __obj.updateDynamic("preConnections")(js.Any.fromFunction2(preConnections))
    if (preRegister != null) __obj.updateDynamic("preRegister")(js.Any.fromFunction2(preRegister))
    __obj.asInstanceOf[Options]
  }
}

