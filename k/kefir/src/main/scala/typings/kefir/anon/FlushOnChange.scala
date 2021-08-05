package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushOnChange extends StObject {
  
  var flushOnChange: js.UndefOr[Boolean] = js.undefined
  
  var flushOnEnd: js.UndefOr[Boolean] = js.undefined
}
object FlushOnChange {
  
  inline def apply(): FlushOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlushOnChange]
  }
  
  extension [Self <: FlushOnChange](x: Self) {
    
    inline def setFlushOnChange(value: Boolean): Self = StObject.set(x, "flushOnChange", value.asInstanceOf[js.Any])
    
    inline def setFlushOnChangeUndefined: Self = StObject.set(x, "flushOnChange", js.undefined)
    
    inline def setFlushOnEnd(value: Boolean): Self = StObject.set(x, "flushOnEnd", value.asInstanceOf[js.Any])
    
    inline def setFlushOnEndUndefined: Self = StObject.set(x, "flushOnEnd", js.undefined)
  }
}
