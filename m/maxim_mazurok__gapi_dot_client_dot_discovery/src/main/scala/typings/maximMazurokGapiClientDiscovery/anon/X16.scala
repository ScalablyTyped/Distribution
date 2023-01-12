package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X16 extends StObject {
  
  /** The URL of the 16x16 icon. */
  var x16: js.UndefOr[String] = js.undefined
  
  /** The URL of the 32x32 icon. */
  var x32: js.UndefOr[String] = js.undefined
}
object X16 {
  
  inline def apply(): X16 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X16] (val x: Self) extends AnyVal {
    
    inline def setX16(value: String): Self = StObject.set(x, "x16", value.asInstanceOf[js.Any])
    
    inline def setX16Undefined: Self = StObject.set(x, "x16", js.undefined)
    
    inline def setX32(value: String): Self = StObject.set(x, "x32", value.asInstanceOf[js.Any])
    
    inline def setX32Undefined: Self = StObject.set(x, "x32", js.undefined)
  }
}
