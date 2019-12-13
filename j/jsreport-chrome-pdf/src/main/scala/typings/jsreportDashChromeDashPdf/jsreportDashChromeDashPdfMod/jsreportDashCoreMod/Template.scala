package typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfMod.jsreportDashCoreMod

import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfMod.Chrome
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfMod.ChromeImage
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfStrings.`chrome-image`
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfStrings.`chrome-pdf`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var chrome: js.UndefOr[Partial[Chrome]] = js.undefined
  var chromeImage: js.UndefOr[Partial[ChromeImage]] = js.undefined
  var recipe: `chrome-pdf` | `chrome-image` | String
}

object Template {
  @scala.inline
  def apply(
    recipe: `chrome-pdf` | `chrome-image` | String,
    chrome: Partial[Chrome] = null,
    chromeImage: Partial[ChromeImage] = null
  ): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    if (chrome != null) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (chromeImage != null) __obj.updateDynamic("chromeImage")(chromeImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

