package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I extends StObject {
  
  var i: Double = js.native
  
  var r: BigInteger = js.native
  
  var s: BigInteger = js.native
}
object I {
  
  @scala.inline
  def apply(i: Double, r: BigInteger, s: BigInteger): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  @scala.inline
  implicit class IMutableBuilder[Self <: I] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: BigInteger): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: BigInteger): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
