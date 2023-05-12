package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyLoadedData extends StObject {
  
  var frag: Fragment
  
  var keyInfo: KeyLoaderInfo
}
object KeyLoadedData {
  
  inline def apply(frag: Fragment, keyInfo: KeyLoaderInfo): KeyLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], keyInfo = keyInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyLoadedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyLoadedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setKeyInfo(value: KeyLoaderInfo): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
  }
}
