package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldEffect extends StObject {
  
  var horizFirst: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Any] = js.undefined
}
object FoldEffect {
  
  inline def apply(): FoldEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldEffect] (val x: Self) extends AnyVal {
    
    inline def setHorizFirst(value: Boolean): Self = StObject.set(x, "horizFirst", value.asInstanceOf[js.Any])
    
    inline def setHorizFirstUndefined: Self = StObject.set(x, "horizFirst", js.undefined)
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
