package typings
package jsreportDashHtmlDashToDashXlsxLib.jsreportDashHtmlDashToDashXlsxMod.jsreportDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var htmlToXlsx: jsreportDashHtmlDashToDashXlsxLib.Anon_HtmlEngine
  var recipe: jsreportDashHtmlDashToDashXlsxLib.jsreportDashHtmlDashToDashXlsxLibStrings.`html-to-xlsx` | java.lang.String
}

object Template {
  @scala.inline
  def apply(
    htmlToXlsx: jsreportDashHtmlDashToDashXlsxLib.Anon_HtmlEngine,
    recipe: jsreportDashHtmlDashToDashXlsxLib.jsreportDashHtmlDashToDashXlsxLibStrings.`html-to-xlsx` | java.lang.String
  ): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("htmlToXlsx")(htmlToXlsx)
    __obj.updateDynamic("recipe")(recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

