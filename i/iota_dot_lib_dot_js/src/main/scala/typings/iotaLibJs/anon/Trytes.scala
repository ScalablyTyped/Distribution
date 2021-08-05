package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trytes extends StObject {
  
  var trytes: js.Array[String]
}
object Trytes {
  
  inline def apply(trytes: js.Array[String]): Trytes = {
    val __obj = js.Dynamic.literal(trytes = trytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trytes]
  }
  
  extension [Self <: Trytes](x: Self) {
    
    inline def setTrytes(value: js.Array[String]): Self = StObject.set(x, "trytes", value.asInstanceOf[js.Any])
    
    inline def setTrytesVarargs(value: String*): Self = StObject.set(x, "trytes", js.Array(value :_*))
  }
}
