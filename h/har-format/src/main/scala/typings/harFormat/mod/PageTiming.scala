package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageTiming extends StObject {
  
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
  implicit class PageTimingMutableBuilder[Self <: PageTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setOnContentLoad(value: Double): Self = StObject.set(x, "onContentLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContentLoadUndefined: Self = StObject.set(x, "onContentLoad", js.undefined)
    
    @scala.inline
    def setOnLoad(value: Double): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def set_startRender(value: Double): Self = StObject.set(x, "_startRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startRenderNull: Self = StObject.set(x, "_startRender", null)
    
    @scala.inline
    def set_startRenderUndefined: Self = StObject.set(x, "_startRender", js.undefined)
  }
}
