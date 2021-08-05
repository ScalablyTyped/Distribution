package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  code :number} & jpush-react-native.jpush-react-native.Sequence */
trait codenumberSequence extends StObject {
  
  var code: Double
  
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
}
object codenumberSequence {
  
  inline def apply(code: Double, sequence: Double): codenumberSequence = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[codenumberSequence]
  }
  
  extension [Self <: codenumberSequence](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
