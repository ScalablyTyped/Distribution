package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kid extends StObject {
  
  var kid: String
}
object Kid {
  
  @scala.inline
  def apply(kid: String): Kid = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kid]
  }
  
  @scala.inline
  implicit class KidMutableBuilder[Self <: Kid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
  }
}
