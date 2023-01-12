package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragChangedData extends StObject {
  
  var frag: Fragment
}
object FragChangedData {
  
  inline def apply(frag: Fragment): FragChangedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragChangedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragChangedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
