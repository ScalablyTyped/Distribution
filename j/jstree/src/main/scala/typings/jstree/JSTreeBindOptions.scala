package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSTreeBindOptions extends StObject {
  
  var args: js.UndefOr[Any] = js.undefined
  
  var inst: js.UndefOr[Any] = js.undefined
  
  var rlbk: js.UndefOr[Any] = js.undefined
  
  var rslt: js.UndefOr[Any] = js.undefined
}
object JSTreeBindOptions {
  
  inline def apply(): JSTreeBindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeBindOptions]
  }
  
  extension [Self <: JSTreeBindOptions](x: Self) {
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setInst(value: Any): Self = StObject.set(x, "inst", value.asInstanceOf[js.Any])
    
    inline def setInstUndefined: Self = StObject.set(x, "inst", js.undefined)
    
    inline def setRlbk(value: Any): Self = StObject.set(x, "rlbk", value.asInstanceOf[js.Any])
    
    inline def setRlbkUndefined: Self = StObject.set(x, "rlbk", js.undefined)
    
    inline def setRslt(value: Any): Self = StObject.set(x, "rslt", value.asInstanceOf[js.Any])
    
    inline def setRsltUndefined: Self = StObject.set(x, "rslt", js.undefined)
  }
}
