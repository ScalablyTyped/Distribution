package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkFootnote extends Footnote {
  var id: String | Double = js.native
  var shortUrl: js.UndefOr[String] = js.native
  var url: String = js.native
}

object LinkFootnote {
  @scala.inline
  def apply(id: String | Double, url: String): LinkFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFootnote]
  }
  @scala.inline
  implicit class LinkFootnoteOps[Self <: LinkFootnote] (val x: Self) extends AnyVal {
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
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortUrl(value: String): Self = this.set("shortUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortUrl: Self = this.set("shortUrl", js.undefined)
  }
  
}

