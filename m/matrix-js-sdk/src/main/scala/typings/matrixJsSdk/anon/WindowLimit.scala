package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowLimit extends StObject {
  
  var windowLimit: js.UndefOr[Double] = js.undefined
}
object WindowLimit {
  
  inline def apply(): WindowLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowLimit] (val x: Self) extends AnyVal {
    
    inline def setWindowLimit(value: Double): Self = StObject.set(x, "windowLimit", value.asInstanceOf[js.Any])
    
    inline def setWindowLimitUndefined: Self = StObject.set(x, "windowLimit", js.undefined)
  }
}
