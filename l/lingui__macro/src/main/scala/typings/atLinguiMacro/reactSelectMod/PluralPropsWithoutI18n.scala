package typings.atLinguiMacro.reactSelectMod

import org.scalablytyped.runtime.StringDictionary
import typings.atLinguiMacro.renderMod.RenderProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var few: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var many: js.UndefOr[ReactNode] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var one: js.UndefOr[ReactNode] = js.undefined
  var other: ReactNode
  var two: js.UndefOr[ReactNode] = js.undefined
  var value: Double | String
  var zero: js.UndefOr[ReactNode] = js.undefined
}

object PluralPropsWithoutI18n {
  @scala.inline
  def apply(
    other: ReactNode,
    value: Double | String,
    StringDictionary: /* exact */ StringDictionary[ReactNode] = null,
    className: String = null,
    description: String = null,
    few: ReactNode = null,
    id: String = null,
    many: ReactNode = null,
    offset: Double | String = null,
    one: ReactNode = null,
    render: ReactNode = null,
    two: ReactNode = null,
    zero: ReactNode = null
  ): PluralPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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

