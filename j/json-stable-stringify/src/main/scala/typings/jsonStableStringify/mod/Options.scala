package typings.jsonStableStringify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cmp: js.UndefOr[Comparator] = js.native
  var replacer: js.UndefOr[Replacer] = js.native
  var space: js.UndefOr[Double | String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCmp(value: (/* a */ Element, /* b */ Element) => Double): Self = this.set("cmp", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCmp: Self = this.set("cmp", js.undefined)
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = this.set("replacer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    @scala.inline
    def setSpace(value: Double | String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
  
}

