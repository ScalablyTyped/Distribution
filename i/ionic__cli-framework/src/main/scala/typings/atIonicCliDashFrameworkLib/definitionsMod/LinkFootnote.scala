package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkFootnote extends Footnote {
  var id: java.lang.String | scala.Double
  var shortUrl: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object LinkFootnote {
  @scala.inline
  def apply(id: java.lang.String | scala.Double, url: java.lang.String, shortUrl: java.lang.String = null): LinkFootnote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    if (shortUrl != null) __obj.updateDynamic("shortUrl")(shortUrl)
    __obj.asInstanceOf[LinkFootnote]
  }
}

