package typings
package atIonicCoreLib.distTypesUtilsAnimationAnimationDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectProperty
  extends /* state */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var effectName: java.lang.String
  var from: js.UndefOr[EffectState] = js.undefined
  var to: js.UndefOr[EffectState] = js.undefined
  var trans: scala.Boolean
  var wc: js.UndefOr[java.lang.String] = js.undefined
}

object EffectProperty {
  @scala.inline
  def apply(
    effectName: java.lang.String,
    trans: scala.Boolean,
    StringDictionary: /* state */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    from: EffectState = null,
    to: EffectState = null,
    wc: java.lang.String = null
  ): EffectProperty = {
    val __obj = js.Dynamic.literal(effectName = effectName, trans = trans)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    if (wc != null) __obj.updateDynamic("wc")(wc)
    __obj.asInstanceOf[EffectProperty]
  }
}

