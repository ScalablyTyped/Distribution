package typings.jsmediatags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringUtilsMod {
  
  @JSImport("jsmediatags/build2/StringUtils", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with InternalDecodedString {
    def this(value: String, bytesReadCount: Double) = this()
    
    /* CompleteClass */
    var _value: String = js.native
    
    /* CompleteClass */
    var bytesReadCount: Double = js.native
    
    /* CompleteClass */
    var length: Double = js.native
  }
  
  type DecodedString = InternalDecodedString
  
  trait InternalDecodedString extends StObject {
    
    var _value: String
    
    var bytesReadCount: Double
    
    var length: Double
  }
  object InternalDecodedString {
    
    inline def apply(_value: String, bytesReadCount: Double, length: Double): InternalDecodedString = {
      val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any], bytesReadCount = bytesReadCount.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDecodedString]
    }
    
    extension [Self <: InternalDecodedString](x: Self) {
      
      inline def setBytesReadCount(value: Double): Self = StObject.set(x, "bytesReadCount", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def set_value(value: String): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
