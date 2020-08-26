package typings.linguiMacro.createFormatMod

import typings.linguiMacro.renderMod.RenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatPropsWithoutI18n[V, FormatOptions] extends RenderProps {
  var format: js.UndefOr[FormatOptions] = js.native
  var value: V = js.native
}

object FormatPropsWithoutI18n {
  @scala.inline
  def apply[V, FormatOptions](value: V): FormatPropsWithoutI18n[V, FormatOptions] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
  }
  @scala.inline
  implicit class FormatPropsWithoutI18nOps[Self <: FormatPropsWithoutI18n[_, _], V, FormatOptions] (val x: Self with (FormatPropsWithoutI18n[V, FormatOptions])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: FormatOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

