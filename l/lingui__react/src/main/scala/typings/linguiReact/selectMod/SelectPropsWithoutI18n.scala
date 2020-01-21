package typings.linguiReact.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.linguiReact.renderMod.RenderProps
import typings.react.mod.ReactNode
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
    id: String = null,
    other: ReactNode = null,
    render: ReactNode = null
  ): SelectPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPropsWithoutI18n]
  }
}

