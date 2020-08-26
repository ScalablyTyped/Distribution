package typings.lunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boost extends js.Object {
  var boost: js.UndefOr[Double] = js.native
  var extractor: js.UndefOr[js.Function1[/* doc */ js.Object, String | js.Object | js.Array[js.Object]]] = js.native
}

object Boost {
  @scala.inline
  def apply(): Boost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boost]
  }
  @scala.inline
  implicit class BoostOps[Self <: Boost] (val x: Self) extends AnyVal {
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
    def setBoost(value: Double): Self = this.set("boost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoost: Self = this.set("boost", js.undefined)
    @scala.inline
    def setExtractor(value: /* doc */ js.Object => String | js.Object | js.Array[js.Object]): Self = this.set("extractor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExtractor: Self = this.set("extractor", js.undefined)
  }
  
}

