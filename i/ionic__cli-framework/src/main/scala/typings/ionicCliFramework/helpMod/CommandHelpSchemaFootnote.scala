package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.link
import typings.ionicCliFramework.ionicCliFrameworkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText
  - typings.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink
*/
trait CommandHelpSchemaFootnote extends js.Object

object CommandHelpSchemaFootnote {
  @scala.inline
  def CommandHelpSchemaFootnoteText(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnote]
  }
  @scala.inline
  def CommandHelpSchemaFootnoteLink(id: String | Double, `type`: link, url: String, shortUrl: String = null): CommandHelpSchemaFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shortUrl != null) __obj.updateDynamic("shortUrl")(shortUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnote]
  }
}

