package typings.inlineCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var applyLinkTags: js.UndefOr[Boolean] = js.native
  
  var applyStyleTags: js.UndefOr[Boolean] = js.native
  
  var applyTableAttributes: js.UndefOr[Boolean] = js.native
  
  var applyWidthAttributes: js.UndefOr[Boolean] = js.native
  
  var extraCss: js.UndefOr[String] = js.native
  
  var preserveMediaQueries: js.UndefOr[Boolean] = js.native
  
  var removeHtmlSelectors: js.UndefOr[Boolean] = js.native
  
  var removeLinkTags: js.UndefOr[Boolean] = js.native
  
  var removeStyleTags: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object Options {
  
  @scala.inline
  def apply(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyLinkTags(value: Boolean): Self = this.set("applyLinkTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyLinkTags: Self = this.set("applyLinkTags", js.undefined)
    
    @scala.inline
    def setApplyStyleTags(value: Boolean): Self = this.set("applyStyleTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyStyleTags: Self = this.set("applyStyleTags", js.undefined)
    
    @scala.inline
    def setApplyTableAttributes(value: Boolean): Self = this.set("applyTableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyTableAttributes: Self = this.set("applyTableAttributes", js.undefined)
    
    @scala.inline
    def setApplyWidthAttributes(value: Boolean): Self = this.set("applyWidthAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyWidthAttributes: Self = this.set("applyWidthAttributes", js.undefined)
    
    @scala.inline
    def setExtraCss(value: String): Self = this.set("extraCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraCss: Self = this.set("extraCss", js.undefined)
    
    @scala.inline
    def setPreserveMediaQueries(value: Boolean): Self = this.set("preserveMediaQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveMediaQueries: Self = this.set("preserveMediaQueries", js.undefined)
    
    @scala.inline
    def setRemoveHtmlSelectors(value: Boolean): Self = this.set("removeHtmlSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveHtmlSelectors: Self = this.set("removeHtmlSelectors", js.undefined)
    
    @scala.inline
    def setRemoveLinkTags(value: Boolean): Self = this.set("removeLinkTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveLinkTags: Self = this.set("removeLinkTags", js.undefined)
    
    @scala.inline
    def setRemoveStyleTags(value: Boolean): Self = this.set("removeStyleTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveStyleTags: Self = this.set("removeStyleTags", js.undefined)
  }
}
