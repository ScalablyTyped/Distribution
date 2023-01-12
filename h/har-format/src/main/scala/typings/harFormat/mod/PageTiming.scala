package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageTiming extends StObject {
  
  var _startRender: js.UndefOr[Double | Null] = js.undefined
  
  /** A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Content of the page loaded. Number of milliseconds since page load
    * started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onContentLoad: js.UndefOr[Double] = js.undefined
  
  /**
    * Page is loaded (`onLoad` event fired). Number of milliseconds since
    * page load started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onLoad: js.UndefOr[Double] = js.undefined
}
object PageTiming {
  
  inline def apply(): PageTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageTiming] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setOnContentLoad(value: Double): Self = StObject.set(x, "onContentLoad", value.asInstanceOf[js.Any])
    
    inline def setOnContentLoadUndefined: Self = StObject.set(x, "onContentLoad", js.undefined)
    
    inline def setOnLoad(value: Double): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def set_startRender(value: Double): Self = StObject.set(x, "_startRender", value.asInstanceOf[js.Any])
    
    inline def set_startRenderNull: Self = StObject.set(x, "_startRender", null)
    
    inline def set_startRenderUndefined: Self = StObject.set(x, "_startRender", js.undefined)
  }
}
