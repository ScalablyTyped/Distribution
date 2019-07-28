package typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectProperty
  extends /* state */ StringDictionary[js.Any] {
  var effectName: String
  var from: js.UndefOr[EffectState] = js.undefined
  var to: js.UndefOr[EffectState] = js.undefined
  var trans: Boolean
  var wc: js.UndefOr[String] = js.undefined
}

object EffectProperty {
  @scala.inline
  def apply(
    effectName: String,
    trans: Boolean,
    StringDictionary: /* state */ StringDictionary[js.Any] = null,
    from: EffectState = null,
    to: EffectState = null,
    wc: String = null
  ): EffectProperty = {
    val __obj = js.Dynamic.literal(effectName = effectName, trans = trans)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    if (wc != null) __obj.updateDynamic("wc")(wc)
    __obj.asInstanceOf[EffectProperty]
  }
}

