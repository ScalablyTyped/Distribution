package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexPage extends js.Object {
  
  var current: js.UndefOr[Double] = js.native
  
  var current_url: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[Double] = js.native
  
  var next_link: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var per_page: js.UndefOr[Double] = js.native
  
  var posts: js.UndefOr[js.Object] = js.native
  
  var prev: js.UndefOr[Double] = js.native
  
  var prev_link: js.UndefOr[String] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object IndexPage {
  
  @scala.inline
  def apply(): IndexPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexPage]
  }
  
  @scala.inline
  implicit class IndexPageOps[Self <: IndexPage] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setCurrent_url(value: String): Self = this.set("current_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent_url: Self = this.set("current_url", js.undefined)
    
    @scala.inline
    def setNext(value: Double): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setNext_link(value: String): Self = this.set("next_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_link: Self = this.set("next_link", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    
    @scala.inline
    def setPosts(value: js.Object): Self = this.set("posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosts: Self = this.set("posts", js.undefined)
    
    @scala.inline
    def setPrev(value: Double): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setPrev_link(value: String): Self = this.set("prev_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev_link: Self = this.set("prev_link", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
