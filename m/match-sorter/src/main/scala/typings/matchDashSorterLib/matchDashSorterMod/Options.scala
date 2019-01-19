package typings
package matchDashSorterLib.matchDashSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var keepDiacritics: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.UndefOr[
    js.Array[
      java.lang.String | (js.Function1[/* item */ T, java.lang.String]) | matchDashSorterLib.ExtendedKeyOptions[T]
    ]
  ] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

