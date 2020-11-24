package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageTiming extends js.Object {
  
  var _startRender: js.UndefOr[Double | Null] = js.native
  
  /** A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Content of the page loaded. Number of milliseconds since page load
    * started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onContentLoad: js.UndefOr[Double] = js.native
  
  /**
    * Page is loaded (`onLoad` event fired). Number of milliseconds since
    * page load started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onLoad: js.UndefOr[Double] = js.native
}
object PageTiming {
  
  @scala.inline
  def apply(): PageTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTiming]
  }
  
  @scala.inline
  implicit class PageTimingOps[Self <: PageTiming] (val x: Self) extends AnyVal {
    
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
    def set_startRender(value: Double): Self = this.set("_startRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_startRender: Self = this.set("_startRender", js.undefined)
    
    @scala.inline
    def set_startRenderNull: Self = this.set("_startRender", null)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setOnContentLoad(value: Double): Self = this.set("onContentLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContentLoad: Self = this.set("onContentLoad", js.undefined)
    
    @scala.inline
    def setOnLoad(value: Double): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
  }
}
