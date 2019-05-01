package typings
package immutabilityDashHelperLib.immutabilityDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySpec[T, C /* <: CustomCommands[js.Object] */]
  extends /* index */ org.scalablytyped.runtime.StringDictionary[Spec[T, C]] {
  @JSName("$push")
  var $push: js.UndefOr[js.Array[T]] = js.undefined
  @JSName("$splice")
  var $splice: js.UndefOr[
    js.Array[
      (js.Tuple2[scala.Double, js.UndefOr[scala.Double]]) | (js.Array[scala.Double | T])
    ]
  ] = js.undefined
  @JSName("$unshift")
  var $unshift: js.UndefOr[js.Array[T]] = js.undefined
}

object ArraySpec {
  @scala.inline
  def apply[T, C /* <: CustomCommands[js.Object] */](
    $push: js.Array[T] = null,
    $splice: js.Array[
      (js.Tuple2[scala.Double, js.UndefOr[scala.Double]]) | (js.Array[scala.Double | T])
    ] = null,
    $unshift: js.Array[T] = null,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[Spec[T, C]] = null
  ): ArraySpec[T, C] = {
    val __obj = js.Dynamic.literal()
    if ($push != null) __obj.updateDynamic("$push")($push)
    if ($splice != null) __obj.updateDynamic("$splice")($splice)
    if ($unshift != null) __obj.updateDynamic("$unshift")($unshift)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ArraySpec[T, C]]
  }
}

