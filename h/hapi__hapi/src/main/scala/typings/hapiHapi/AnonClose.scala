package typings.hapiHapi

import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var close: js.UndefOr[js.Function1[/* response */ ResponseObject, Unit]] = js.undefined
  var marshal: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseValue]]] = js.undefined
  var prepare: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseObject]]] = js.undefined
  var variety: js.UndefOr[String] = js.undefined
}

object AnonClose {
  @scala.inline
  def apply(
    close: /* response */ ResponseObject => Unit = null,
    marshal: /* response */ ResponseObject => js.Promise[ResponseValue] = null,
    prepare: /* response */ ResponseObject => js.Promise[ResponseObject] = null,
    variety: String = null
  ): AnonClose = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (marshal != null) __obj.updateDynamic("marshal")(js.Any.fromFunction1(marshal))
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction1(prepare))
    if (variety != null) __obj.updateDynamic("variety")(variety.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

