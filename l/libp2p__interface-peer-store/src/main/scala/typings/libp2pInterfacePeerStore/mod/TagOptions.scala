package typings.libp2pInterfacePeerStore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagOptions extends StObject {
  
  var ttl: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object TagOptions {
  
  inline def apply(): TagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagOptions] (val x: Self) extends AnyVal {
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
