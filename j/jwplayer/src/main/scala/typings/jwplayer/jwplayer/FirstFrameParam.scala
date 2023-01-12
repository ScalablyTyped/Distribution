package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerInts.`0`
import typings.jwplayer.jwplayerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstFrameParam extends StObject {
  
  var loadTime: Double
  
  var viewable: `0` | `1`
}
object FirstFrameParam {
  
  inline def apply(loadTime: Double, viewable: `0` | `1`): FirstFrameParam = {
    val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstFrameParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstFrameParam] (val x: Self) extends AnyVal {
    
    inline def setLoadTime(value: Double): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
    
    inline def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
