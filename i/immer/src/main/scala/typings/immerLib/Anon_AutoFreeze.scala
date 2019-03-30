package typings
package immerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFreeze extends js.Object {
  var autoFreeze: js.UndefOr[scala.Boolean] = js.undefined
  var onAssign: js.UndefOr[
    js.Function3[
      /* state */ immerLib.immerMod.ImmerState[_], 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* state */ immerLib.immerMod.ImmerState[_], scala.Unit]] = js.undefined
  var onDelete: js.UndefOr[
    js.Function2[
      /* state */ immerLib.immerMod.ImmerState[_], 
      /* prop */ java.lang.String | scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var useProxies: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoFreeze {
  @scala.inline
  def apply(
    autoFreeze: js.UndefOr[scala.Boolean] = js.undefined,
    onAssign: (/* state */ immerLib.immerMod.ImmerState[_], /* prop */ java.lang.String | scala.Double, /* value */ js.Any) => scala.Unit = null,
    onCopy: /* state */ immerLib.immerMod.ImmerState[_] => scala.Unit = null,
    onDelete: (/* state */ immerLib.immerMod.ImmerState[_], /* prop */ java.lang.String | scala.Double) => scala.Unit = null,
    useProxies: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoFreeze = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFreeze)) __obj.updateDynamic("autoFreeze")(autoFreeze)
    if (onAssign != null) __obj.updateDynamic("onAssign")(js.Any.fromFunction3(onAssign))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onDelete != null) __obj.updateDynamic("onDelete")(js.Any.fromFunction2(onDelete))
    if (!js.isUndefined(useProxies)) __obj.updateDynamic("useProxies")(useProxies)
    __obj.asInstanceOf[Anon_AutoFreeze]
  }
}

