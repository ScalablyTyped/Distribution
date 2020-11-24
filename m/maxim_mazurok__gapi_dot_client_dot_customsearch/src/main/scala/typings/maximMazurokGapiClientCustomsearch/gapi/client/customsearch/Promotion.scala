package typings.maximMazurokGapiClientCustomsearch.gapi.client.customsearch

import typings.maximMazurokGapiClientCustomsearch.anon.Height
import typings.maximMazurokGapiClientCustomsearch.anon.HtmlTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promotion extends js.Object {
  
  /** An array of block objects for this promotion. See [Google WebSearch Protocol reference](https://developers.google.com/custom-search/docs/xml_results) for more information. */
  var bodyLines: js.UndefOr[js.Array[HtmlTitle]] = js.native
  
  /** An abridged version of this search's result URL, e.g. www.example.com. */
  var displayLink: js.UndefOr[String] = js.native
  
  /** The title of the promotion, in HTML. */
  var htmlTitle: js.UndefOr[String] = js.native
  
  /** Image belonging to a promotion. */
  var image: js.UndefOr[Height] = js.native
  
  /** The URL of the promotion. */
  var link: js.UndefOr[String] = js.native
  
  /** The title of the promotion. */
  var title: js.UndefOr[String] = js.native
}
object Promotion {
  
  @scala.inline
  def apply(): Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotion]
  }
  
  @scala.inline
  implicit class PromotionOps[Self <: Promotion] (val x: Self) extends AnyVal {
    
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
    def setBodyLinesVarargs(value: HtmlTitle*): Self = this.set("bodyLines", js.Array(value :_*))
    
    @scala.inline
    def setBodyLines(value: js.Array[HtmlTitle]): Self = this.set("bodyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLines: Self = this.set("bodyLines", js.undefined)
    
    @scala.inline
    def setDisplayLink(value: String): Self = this.set("displayLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLink: Self = this.set("displayLink", js.undefined)
    
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    
    @scala.inline
    def setImage(value: Height): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
