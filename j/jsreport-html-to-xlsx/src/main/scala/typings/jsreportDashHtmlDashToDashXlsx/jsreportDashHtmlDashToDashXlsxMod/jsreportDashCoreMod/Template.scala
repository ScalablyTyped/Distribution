package typings.jsreportDashHtmlDashToDashXlsx.jsreportDashHtmlDashToDashXlsxMod.jsreportDashCoreMod

import typings.jsreportDashHtmlDashToDashXlsx.Anon_HtmlEngine
import typings.jsreportDashHtmlDashToDashXlsx.jsreportDashHtmlDashToDashXlsxStrings.`html-to-xlsx`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var htmlToXlsx: Anon_HtmlEngine
  var recipe: `html-to-xlsx` | String
}

object Template {
  @scala.inline
  def apply(htmlToXlsx: Anon_HtmlEngine, recipe: `html-to-xlsx` | String): Template = {
    val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx, recipe = recipe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Template]
  }
}

