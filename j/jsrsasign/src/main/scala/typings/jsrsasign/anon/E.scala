package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait E extends StObject {
  
  var e: String
  
  var n: String
}
object E {
  
  @scala.inline
  def apply(e: String, n: String): E = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  
  @scala.inline
  implicit class EMutableBuilder[Self <: E] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
