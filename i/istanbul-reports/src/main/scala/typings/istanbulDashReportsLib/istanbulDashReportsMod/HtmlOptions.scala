package typings
package istanbulDashReportsLib.istanbulDashReportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  var linkMapper: LinkMapper
  var subdir: java.lang.String
  var verbose: scala.Boolean
}

object HtmlOptions {
  @scala.inline
  def apply(linkMapper: LinkMapper, subdir: java.lang.String, verbose: scala.Boolean): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("linkMapper")(linkMapper)
    __obj.updateDynamic("subdir")(subdir)
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[HtmlOptions]
  }
}

