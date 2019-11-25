package typings.atLinguiMacro.createFormatMod

import typings.atLinguiMacro.renderMod.RenderProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatPropsWithoutI18n[V, FormatOptions] extends RenderProps {
  var format: js.UndefOr[FormatOptions] = js.undefined
  var value: V
}

object FormatPropsWithoutI18n {
  @scala.inline
  def apply[V, FormatOptions](
    value: V,
    className: String = null,
    description: String = null,
    format: FormatOptions = null,
    render: ReactNode = null
  ): FormatPropsWithoutI18n[V, FormatOptions] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
  }
}

