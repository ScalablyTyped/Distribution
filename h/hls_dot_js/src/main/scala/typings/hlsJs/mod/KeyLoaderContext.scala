package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyLoaderContext
  extends StObject
     with LoaderContext {
  
  var frag: Fragment
  
  var keyInfo: KeyLoaderInfo
}
object KeyLoaderContext {
  
  inline def apply(frag: Fragment, keyInfo: KeyLoaderInfo, responseType: String, url: String): KeyLoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], keyInfo = keyInfo.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyLoaderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyLoaderContext] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setKeyInfo(value: KeyLoaderInfo): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
  }
}
