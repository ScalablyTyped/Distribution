package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typ extends StObject {
  
  var alg: String
  
  var typ: String
}
object Typ {
  
  @scala.inline
  def apply(alg: String, typ: String): Typ = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typ]
  }
  
  @scala.inline
  implicit class TypMutableBuilder[Self <: Typ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
  }
}
