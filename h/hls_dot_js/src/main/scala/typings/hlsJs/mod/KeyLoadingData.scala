package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyLoadingData extends StObject {
  
  var frag: Fragment
}
object KeyLoadingData {
  
  inline def apply(frag: Fragment): KeyLoadingData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyLoadingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyLoadingData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
