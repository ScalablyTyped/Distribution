package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlOptions extends js.Object {
  var linkMapper: LinkMapper = js.native
  var skipEmpty: Boolean = js.native
  var subdir: String = js.native
  var verbose: Boolean = js.native
}

object HtmlOptions {
  @scala.inline
  def apply(linkMapper: LinkMapper, skipEmpty: Boolean, subdir: String, verbose: Boolean): HtmlOptions = {
    val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlOptions]
  }
  @scala.inline
  implicit class HtmlOptionsOps[Self <: HtmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLinkMapper(value: LinkMapper): Self = this.set("linkMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipEmpty(value: Boolean): Self = this.set("skipEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubdir(value: String): Self = this.set("subdir", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

