package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[js.Function1[/* response */ hapiLib.hapiMod.ResponseObject, scala.Unit]] = js.undefined
  var marshal: js.UndefOr[
    js.Function1[
      /* response */ hapiLib.hapiMod.ResponseObject, 
      js.Promise[hapiLib.hapiMod.ResponseValue]
    ]
  ] = js.undefined
  var prepare: js.UndefOr[
    js.Function1[
      /* response */ hapiLib.hapiMod.ResponseObject, 
      js.Promise[hapiLib.hapiMod.ResponseObject]
    ]
  ] = js.undefined
  var variety: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(
    close: /* response */ hapiLib.hapiMod.ResponseObject => scala.Unit = null,
    marshal: /* response */ hapiLib.hapiMod.ResponseObject => js.Promise[hapiLib.hapiMod.ResponseValue] = null,
    prepare: /* response */ hapiLib.hapiMod.ResponseObject => js.Promise[hapiLib.hapiMod.ResponseObject] = null,
    variety: java.lang.String = null
  ): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (marshal != null) __obj.updateDynamic("marshal")(js.Any.fromFunction1(marshal))
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction1(prepare))
    if (variety != null) __obj.updateDynamic("variety")(variety)
    __obj.asInstanceOf[Anon_Close]
  }
}

