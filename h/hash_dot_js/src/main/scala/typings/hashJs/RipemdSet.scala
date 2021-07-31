package typings.hashJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RipemdSet extends StObject {
  
  def ripemd160(): Ripemd160
  @JSName("ripemd160")
  var ripemd160_Original: Ripemd160Constructor
}
object RipemdSet {
  
  @scala.inline
  def apply(ripemd160: () => Ripemd160): RipemdSet = {
    val __obj = js.Dynamic.literal(ripemd160 = js.Any.fromFunction0(ripemd160))
    __obj.asInstanceOf[RipemdSet]
  }
  
  @scala.inline
  implicit class RipemdSetMutableBuilder[Self <: RipemdSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRipemd160(value: () => Ripemd160): Self = StObject.set(x, "ripemd160", js.Any.fromFunction0(value))
  }
}
