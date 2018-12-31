package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosProps[T] extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* action */ Action[T], scala.Unit]] = js.undefined
  var getNamespace: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

