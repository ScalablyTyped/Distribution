package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyLoadedData extends StObject {
  
  var frag: Fragment
}
object KeyLoadedData {
  
  inline def apply(frag: Fragment): KeyLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyLoadedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyLoadedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
