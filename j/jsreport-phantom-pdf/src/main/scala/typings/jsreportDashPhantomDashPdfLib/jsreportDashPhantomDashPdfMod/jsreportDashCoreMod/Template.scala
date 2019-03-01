package typings
package jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod.jsreportDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var phantom: js.UndefOr[
    stdLib.Partial[
      jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod.JsReportPhantomPdfNs.Phantom
    ]
  ] = js.undefined
  var recipe: jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.`phantom-pdf` | java.lang.String
}

object Template {
  @scala.inline
  def apply(
    recipe: jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.`phantom-pdf` | java.lang.String,
    phantom: stdLib.Partial[
      jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod.JsReportPhantomPdfNs.Phantom
    ] = null
  ): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recipe")(recipe.asInstanceOf[js.Any])
    if (phantom != null) __obj.updateDynamic("phantom")(phantom)
    __obj.asInstanceOf[Template]
  }
}

