package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZDepthShadows extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var zDepthShadows: js.UndefOr[js.Array[String]] = js.undefined
}
object ZDepthShadows {
  
  @scala.inline
  def apply(): ZDepthShadows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZDepthShadows]
  }
  
  @scala.inline
  implicit class ZDepthShadowsMutableBuilder[Self <: ZDepthShadows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setZDepthShadows(value: js.Array[String]): Self = StObject.set(x, "zDepthShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZDepthShadowsUndefined: Self = StObject.set(x, "zDepthShadows", js.undefined)
    
    @scala.inline
    def setZDepthShadowsVarargs(value: String*): Self = StObject.set(x, "zDepthShadows", js.Array(value :_*))
  }
}
