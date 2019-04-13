package typings
package atLinguiReactLib.createFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatPropsWithoutI18n[V, FormatOptions]
  extends atLinguiReactLib.renderMod.RenderProps {
  var format: js.UndefOr[FormatOptions] = js.undefined
  var value: V
}

object FormatPropsWithoutI18n {
  @scala.inline
  def apply[V, FormatOptions](
    value: V,
    className: java.lang.String = null,
    format: FormatOptions = null,
    render: reactLib.reactMod.ReactNode = null
  ): FormatPropsWithoutI18n[V, FormatOptions] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
  }
}

