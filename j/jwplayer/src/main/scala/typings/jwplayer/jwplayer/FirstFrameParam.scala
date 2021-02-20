package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstFrameParam extends StObject {
  
  var loadTime: Double = js.native
  
  var viewable: `0` | `1` = js.native
}
object FirstFrameParam {
  
  @scala.inline
  def apply(loadTime: Double, viewable: `0` | `1`): FirstFrameParam = {
    val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstFrameParam]
  }
  
  @scala.inline
  implicit class FirstFrameParamMutableBuilder[Self <: FirstFrameParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadTime(value: Double): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
