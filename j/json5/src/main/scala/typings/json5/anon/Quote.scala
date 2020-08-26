package typings.json5.anon

import typings.json5.mod.JSONReplacer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quote extends js.Object {
  var quote: js.UndefOr[String] = js.native
  var replacer: js.UndefOr[JSONReplacer] = js.native
  var space: js.UndefOr[Double | String] = js.native
}

object Quote {
  @scala.inline
  def apply(): Quote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quote]
  }
  @scala.inline
  implicit class QuoteOps[Self <: Quote] (val x: Self) extends AnyVal {
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
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any | (js.Array[Double | String]) | Null): Self = this.set("replacer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    @scala.inline
    def setSpace(value: Double | String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
  
}

