package typings.hexo.mod.Locals

import org.scalablytyped.runtime.StringDictionary
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page
  extends /* key */ StringDictionary[js.Any] {
  
  var comments: Boolean = js.native
  
  var content: String = js.native
  
  var date: Moment = js.native
  
  var excerpt: js.UndefOr[String] = js.native
  
  var full_source: String = js.native
  
  var layout: String = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var more: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[Null | Page] = js.native
  
  var path: String = js.native
  
  var permalink: String = js.native
  
  var photos: js.UndefOr[js.Array[String]] = js.native
  
  var prev: js.UndefOr[Null | Page] = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var source: String = js.native
  
  var title: String = js.native
  
  var updated: js.UndefOr[Moment] = js.native
}
object Page {
  
  @scala.inline
  def apply(
    comments: Boolean,
    content: String,
    date: Moment,
    full_source: String,
    layout: String,
    path: String,
    permalink: String,
    source: String,
    title: String
  ): Page = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Moment): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_source(value: String): Self = this.set("full_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink(value: String): Self = this.set("permalink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcerpt(value: String): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcerpt: Self = this.set("excerpt", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setMore(value: String): Self = this.set("more", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMore: Self = this.set("more", js.undefined)
    
    @scala.inline
    def setNext(value: Page): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    
    @scala.inline
    def setPhotosVarargs(value: String*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[String]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    
    @scala.inline
    def setPrev(value: Page): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setUpdated(value: Moment): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
