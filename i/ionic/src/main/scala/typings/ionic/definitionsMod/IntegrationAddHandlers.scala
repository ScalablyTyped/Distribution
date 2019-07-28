package typings.ionic.definitionsMod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationAddHandlers extends js.Object {
  var conflictHandler: js.UndefOr[js.Function2[/* f */ String, /* stats */ Stats, js.Promise[Boolean]]] = js.undefined
  var onFileCreate: js.UndefOr[js.Function1[/* f */ String, Unit]] = js.undefined
}

object IntegrationAddHandlers {
  @scala.inline
  def apply(
    conflictHandler: (/* f */ String, /* stats */ Stats) => js.Promise[Boolean] = null,
    onFileCreate: /* f */ String => Unit = null
  ): IntegrationAddHandlers = {
    val __obj = js.Dynamic.literal()
    if (conflictHandler != null) __obj.updateDynamic("conflictHandler")(js.Any.fromFunction2(conflictHandler))
    if (onFileCreate != null) __obj.updateDynamic("onFileCreate")(js.Any.fromFunction1(onFileCreate))
    __obj.asInstanceOf[IntegrationAddHandlers]
  }
}

