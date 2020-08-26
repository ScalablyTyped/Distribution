package typings.linguiReact.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.linguiReact.renderMod.RenderProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var few: js.UndefOr[ReactNode] = js.native
  var id: js.UndefOr[String] = js.native
  var many: js.UndefOr[ReactNode] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var one: js.UndefOr[ReactNode] = js.native
  var other: ReactNode = js.native
  var two: js.UndefOr[ReactNode] = js.native
  var value: Double | String = js.native
  var zero: js.UndefOr[ReactNode] = js.native
}

object PluralPropsWithoutI18n {
  @scala.inline
  def apply(value: Double | String): PluralPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralPropsWithoutI18n]
  }
  @scala.inline
  implicit class PluralPropsWithoutI18nOps[Self <: PluralPropsWithoutI18n] (val x: Self) extends AnyVal {
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
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setFew(value: ReactNode): Self = this.set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMany(value: ReactNode): Self = this.set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOne(value: ReactNode): Self = this.set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    @scala.inline
    def setOther(value: ReactNode): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    @scala.inline
    def setTwo(value: ReactNode): Self = this.set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    @scala.inline
    def setZero(value: ReactNode): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

