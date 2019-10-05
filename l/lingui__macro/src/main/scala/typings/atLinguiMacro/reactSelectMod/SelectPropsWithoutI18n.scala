package typings.atLinguiMacro.reactSelectMod

import org.scalablytyped.runtime.StringDictionary
import typings.atLinguiMacro.renderMod.RenderProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var id: js.UndefOr[String] = js.undefined
  var other: ReactNode
  var value: String
}

object SelectPropsWithoutI18n {
  @scala.inline
  def apply(
    value: String,
    StringDictionary: /* exact */ StringDictionary[ReactNode] = null,
    className: String = null,
    description: String = null,
    id: String = null,
    other: ReactNode = null,
    render: ReactNode = null
  ): SelectPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPropsWithoutI18n]
  }
}

