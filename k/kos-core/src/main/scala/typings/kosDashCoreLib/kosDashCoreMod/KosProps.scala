package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosProps[T] extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* action */ Action[T], scala.Unit]] = js.undefined
  var getNamespace: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getParam: js.UndefOr[js.Function0[_]] = js.undefined
}

object KosProps {
  @scala.inline
  def apply[T](
    dispatch: /* action */ Action[T] => scala.Unit = null,
    getNamespace: () => java.lang.String = null,
    getParam: () => _ = null
  ): KosProps[T] = {
    val __obj = js.Dynamic.literal()
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1(dispatch))
    if (getNamespace != null) __obj.updateDynamic("getNamespace")(js.Any.fromFunction0(getNamespace))
    if (getParam != null) __obj.updateDynamic("getParam")(js.Any.fromFunction0(getParam))
    __obj.asInstanceOf[KosProps[T]]
  }
}

