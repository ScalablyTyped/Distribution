package typings.linguiReact.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.linguiReact.renderMod.RenderProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var id: js.UndefOr[String] = js.native
  var other: ReactNode = js.native
  var value: String = js.native
}

object SelectPropsWithoutI18n {
  @scala.inline
  def apply(value: String): SelectPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPropsWithoutI18n]
  }
  @scala.inline
  implicit class SelectPropsWithoutI18nOps[Self <: SelectPropsWithoutI18n] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOther(value: ReactNode): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
  
}

