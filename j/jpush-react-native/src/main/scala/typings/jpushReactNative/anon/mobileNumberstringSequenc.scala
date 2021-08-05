package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  mobileNumber :string} & jpush-react-native.jpush-react-native.Sequence */
trait mobileNumberstringSequenc extends StObject {
  
  var mobileNumber: String
  
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
}
object mobileNumberstringSequenc {
  
  inline def apply(mobileNumber: String, sequence: Double): mobileNumberstringSequenc = {
    val __obj = js.Dynamic.literal(mobileNumber = mobileNumber.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[mobileNumberstringSequenc]
  }
  
  extension [Self <: mobileNumberstringSequenc](x: Self) {
    
    inline def setMobileNumber(value: String): Self = StObject.set(x, "mobileNumber", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
