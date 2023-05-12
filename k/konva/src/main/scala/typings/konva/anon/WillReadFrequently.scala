package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WillReadFrequently extends StObject {
  
  var willReadFrequently: js.UndefOr[Boolean] = js.undefined
}
object WillReadFrequently {
  
  inline def apply(): WillReadFrequently = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WillReadFrequently]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WillReadFrequently] (val x: Self) extends AnyVal {
    
    inline def setWillReadFrequently(value: Boolean): Self = StObject.set(x, "willReadFrequently", value.asInstanceOf[js.Any])
    
    inline def setWillReadFrequentlyUndefined: Self = StObject.set(x, "willReadFrequently", js.undefined)
  }
}
