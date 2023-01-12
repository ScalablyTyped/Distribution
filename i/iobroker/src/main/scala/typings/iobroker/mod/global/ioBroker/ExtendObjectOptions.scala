package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendObjectOptions
  extends StObject
     with // Allow non-documented properties
/* other */ StringDictionary[Any] {
  
  /** Which properties of the original object should be preserved */
  var preserve: js.UndefOr[ExtendObjectOptionsPreserve] = js.undefined
}
object ExtendObjectOptions {
  
  inline def apply(): ExtendObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setPreserve(value: ExtendObjectOptionsPreserve): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
  }
}
