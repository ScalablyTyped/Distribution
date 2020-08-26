package typings.i18n.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralOptions extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var locale: js.UndefOr[String] = js.native
  var plural: String = js.native
  var singular: String = js.native
}

object PluralOptions {
  @scala.inline
  def apply(plural: String, singular: String): PluralOptions = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralOptions]
  }
  @scala.inline
  implicit class PluralOptionsOps[Self <: PluralOptions] (val x: Self) extends AnyVal {
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
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

