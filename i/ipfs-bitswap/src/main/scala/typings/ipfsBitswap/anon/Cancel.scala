package typings.ipfsBitswap.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  def cancel(): Unit
  
  def flush(): Unit
}
object Cancel {
  
  inline def apply(cancel: () => Unit, flush: () => Unit): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
  }
}
