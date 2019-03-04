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
    val __obj = js.Dynamic.literal(linkMapper = linkMapper, subdir = subdir, verbose = verbose)
  
    __obj.asInstanceOf[HtmlOptions]
  }
}

