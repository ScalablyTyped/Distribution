package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaFootnoteLink extends CommandHelpSchemaFootnote {
  val id: String | Double
  val shortUrl: js.UndefOr[String] = js.undefined
  val `type`: link
  val url: String
}

object CommandHelpSchemaFootnoteLink {
  @scala.inline
  def apply(id: String | Double, `type`: link, url: String, shortUrl: String = null): CommandHelpSchemaFootnoteLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url)
    __obj.updateDynamic("type")(`type`)
    if (shortUrl != null) __obj.updateDynamic("shortUrl")(shortUrl)
    __obj.asInstanceOf[CommandHelpSchemaFootnoteLink]
  }
}

