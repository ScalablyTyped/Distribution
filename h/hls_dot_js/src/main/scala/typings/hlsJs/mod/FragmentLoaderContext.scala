package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentLoaderContext
  extends StObject
     with LoaderContext {
  
  var frag: Fragment
  
  var part: Part | Null
}
object FragmentLoaderContext {
  
  inline def apply(frag: Fragment, responseType: String, url: String): FragmentLoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[FragmentLoaderContext]
  }
  
  extension [Self <: FragmentLoaderContext](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
  }
}
