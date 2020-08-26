package typings.gulpCheerio.mod

import typings.cheerio.CheerioOptionsInterface
import typings.cheerio.CheerioStatic
import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var cheerio: js.UndefOr[CheerioStatic] = js.native
  var parserOptions: js.UndefOr[CheerioOptionsInterface] = js.native
  var run: js.UndefOr[Callback] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
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
    def setCheerio(value: CheerioStatic): Self = this.set("cheerio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheerio: Self = this.set("cheerio", js.undefined)
    @scala.inline
    def setParserOptions(value: CheerioOptionsInterface): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserOptions: Self = this.set("parserOptions", js.undefined)
    @scala.inline
    def setRun(value: (/* $ */ CheerioStatic, /* file */ File, /* done */ js.UndefOr[js.Function]) => js.Any): Self = this.set("run", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
  
}

