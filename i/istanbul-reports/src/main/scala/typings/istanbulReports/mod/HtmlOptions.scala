package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  var linkMapper: LinkMapper
  var subdir: String
  var verbose: Boolean
}

object HtmlOptions {
  @scala.inline
  def apply(linkMapper: LinkMapper, subdir: String, verbose: Boolean): HtmlOptions = {
    val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HtmlOptions]
  }
}

