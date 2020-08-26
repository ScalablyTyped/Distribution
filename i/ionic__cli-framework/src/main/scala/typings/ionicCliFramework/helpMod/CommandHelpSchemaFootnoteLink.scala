package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchemaFootnoteLink extends CommandHelpSchemaFootnote {
  val id: String | Double = js.native
  val shortUrl: js.UndefOr[String] = js.native
  val `type`: link = js.native
  val url: String = js.native
}

object CommandHelpSchemaFootnoteLink {
  @scala.inline
  def apply(id: String | Double, `type`: link, url: String): CommandHelpSchemaFootnoteLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnoteLink]
  }
  @scala.inline
  implicit class CommandHelpSchemaFootnoteLinkOps[Self <: CommandHelpSchemaFootnoteLink] (val x: Self) extends AnyVal {
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
    def setType(value: link): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortUrl(value: String): Self = this.set("shortUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortUrl: Self = this.set("shortUrl", js.undefined)
  }
  
}

