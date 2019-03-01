package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaFootnoteLink extends CommandHelpSchemaFootnote {
  val id: java.lang.String | scala.Double
  val shortUrl: js.UndefOr[java.lang.String] = js.undefined
  val `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.link
  val url: java.lang.String
}

object CommandHelpSchemaFootnoteLink {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.link,
    url: java.lang.String,
    shortUrl: java.lang.String = null
  ): CommandHelpSchemaFootnoteLink = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    if (shortUrl != null) __obj.updateDynamic("shortUrl")(shortUrl)
    __obj.asInstanceOf[CommandHelpSchemaFootnoteLink]
  }
}

