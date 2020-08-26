package typings.inkSpinner.mod

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chalk.chalk.Chalk, 'keyword' | 'hex' | 'bgKeyword' | 'bgHex'> */
@js.native
trait ChalkKeywordsAndHexes extends js.Object {
  var bgHex: js.Function1[/* color */ String, Chalk] = js.native
  var bgKeyword: js.Function1[/* color */ String, Chalk] = js.native
  var hex: js.Function1[/* color */ String, Chalk] = js.native
  var keyword: js.Function1[/* color */ String, Chalk] = js.native
}

object ChalkKeywordsAndHexes {
  @scala.inline
  def apply(
    bgHex: /* color */ String => Chalk,
    bgKeyword: /* color */ String => Chalk,
    hex: /* color */ String => Chalk,
    keyword: /* color */ String => Chalk
  ): ChalkKeywordsAndHexes = {
    val __obj = js.Dynamic.literal(bgHex = js.Any.fromFunction1(bgHex), bgKeyword = js.Any.fromFunction1(bgKeyword), hex = js.Any.fromFunction1(hex), keyword = js.Any.fromFunction1(keyword))
    __obj.asInstanceOf[ChalkKeywordsAndHexes]
  }
  @scala.inline
  implicit class ChalkKeywordsAndHexesOps[Self <: ChalkKeywordsAndHexes] (val x: Self) extends AnyVal {
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
    def setBgHex(value: /* color */ String => Chalk): Self = this.set("bgHex", js.Any.fromFunction1(value))
    @scala.inline
    def setBgKeyword(value: /* color */ String => Chalk): Self = this.set("bgKeyword", js.Any.fromFunction1(value))
    @scala.inline
    def setHex(value: /* color */ String => Chalk): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyword(value: /* color */ String => Chalk): Self = this.set("keyword", js.Any.fromFunction1(value))
  }
  
}

