package typings.markdownIt.htmlReMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlRE extends js.Object {
  
  var HTML_OPEN_CLOSE_TAG_RE: RegExp = js.native
  
  var HTML_TAG_RE: RegExp = js.native
}
object HtmlRE {
  
  @scala.inline
  def apply(HTML_OPEN_CLOSE_TAG_RE: RegExp, HTML_TAG_RE: RegExp): HtmlRE = {
    val __obj = js.Dynamic.literal(HTML_OPEN_CLOSE_TAG_RE = HTML_OPEN_CLOSE_TAG_RE.asInstanceOf[js.Any], HTML_TAG_RE = HTML_TAG_RE.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlRE]
  }
  
  @scala.inline
  implicit class HtmlREOps[Self <: HtmlRE] (val x: Self) extends AnyVal {
    
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
    def setHTML_OPEN_CLOSE_TAG_RE(value: RegExp): Self = this.set("HTML_OPEN_CLOSE_TAG_RE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTML_TAG_RE(value: RegExp): Self = this.set("HTML_TAG_RE", value.asInstanceOf[js.Any])
  }
}
