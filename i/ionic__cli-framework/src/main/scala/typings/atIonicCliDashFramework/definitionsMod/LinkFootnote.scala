package typings.atIonicCliDashFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkFootnote extends Footnote {
  var id: String | Double
  var shortUrl: js.UndefOr[String] = js.undefined
  var url: String
}

object LinkFootnote {
  @scala.inline
  def apply(id: String | Double, url: String, shortUrl: String = null): LinkFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url)
    if (shortUrl != null) __obj.updateDynamic("shortUrl")(shortUrl)
    __obj.asInstanceOf[LinkFootnote]
  }
}

