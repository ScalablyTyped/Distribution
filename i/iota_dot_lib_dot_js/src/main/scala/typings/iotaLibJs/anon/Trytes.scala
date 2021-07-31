package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trytes extends StObject {
  
  var trytes: js.Array[String]
}
object Trytes {
  
  @scala.inline
  def apply(trytes: js.Array[String]): Trytes = {
    val __obj = js.Dynamic.literal(trytes = trytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trytes]
  }
  
  @scala.inline
  implicit class TrytesMutableBuilder[Self <: Trytes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrytes(value: js.Array[String]): Self = StObject.set(x, "trytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrytesVarargs(value: String*): Self = StObject.set(x, "trytes", js.Array(value :_*))
  }
}
