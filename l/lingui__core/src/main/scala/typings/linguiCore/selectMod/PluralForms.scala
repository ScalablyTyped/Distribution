package typings.linguiCore.selectMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralForms extends /* exact */ NumberDictionary[String] {
  var few: js.UndefOr[String] = js.native
  var many: js.UndefOr[String] = js.native
  var one: js.UndefOr[String] = js.native
  var other: String = js.native
  var two: js.UndefOr[String] = js.native
  var zero: js.UndefOr[String] = js.native
}

object PluralForms {
  @scala.inline
  def apply(other: String): PluralForms = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralForms]
  }
  @scala.inline
  implicit class PluralFormsOps[Self <: PluralForms] (val x: Self) extends AnyVal {
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
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setFew(value: String): Self = this.set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    @scala.inline
    def setMany(value: String): Self = this.set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    @scala.inline
    def setOne(value: String): Self = this.set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    @scala.inline
    def setTwo(value: String): Self = this.set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    @scala.inline
    def setZero(value: String): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

