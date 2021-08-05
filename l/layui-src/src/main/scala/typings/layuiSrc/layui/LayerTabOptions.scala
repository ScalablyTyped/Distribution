package typings.layuiSrc.layui

import typings.layuiSrc.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerTabOptions
  extends StObject
     with LayerOptions {
  
  var tab: js.Array[Content]
}
object LayerTabOptions {
  
  inline def apply(tab: js.Array[Content]): LayerTabOptions = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerTabOptions]
  }
  
  extension [Self <: LayerTabOptions](x: Self) {
    
    inline def setTab(value: js.Array[Content]): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabVarargs(value: Content*): Self = StObject.set(x, "tab", js.Array(value :_*))
  }
}
