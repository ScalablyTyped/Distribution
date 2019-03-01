package typings
package atLinguiMacroLib.reactselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralPropsWithoutI18n
  extends atLinguiMacroLib.renderMod.RenderProps
     with /* exact */ org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode] {
  var few: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var many: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var one: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var other: reactLib.reactMod.ReactNs.ReactNode
  var two: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var value: scala.Double | java.lang.String
  var zero: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object PluralPropsWithoutI18n {
  @scala.inline
  def apply(
    other: reactLib.reactMod.ReactNs.ReactNode,
    value: scala.Double | java.lang.String,
    StringDictionary: /* exact */ org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode] = null,
    className: java.lang.String = null,
    description: java.lang.String = null,
    few: reactLib.reactMod.ReactNs.ReactNode = null,
    id: java.lang.String = null,
    many: reactLib.reactMod.ReactNs.ReactNode = null,
    offset: scala.Double | java.lang.String = null,
    one: reactLib.reactMod.ReactNs.ReactNode = null,
    render: reactLib.reactMod.ReactNs.ReactNode = null,
    two: reactLib.reactMod.ReactNs.ReactNode = null,
    zero: reactLib.reactMod.ReactNs.ReactNode = null
  ): PluralPropsWithoutI18n = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralPropsWithoutI18n]
  }
}

