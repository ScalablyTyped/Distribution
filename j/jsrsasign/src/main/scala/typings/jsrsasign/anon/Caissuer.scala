package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caissuer extends StObject {
  
  var caissuer: String
}
object Caissuer {
  
  inline def apply(caissuer: String): Caissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caissuer]
  }
  
  extension [Self <: Caissuer](x: Self) {
    
    inline def setCaissuer(value: String): Self = StObject.set(x, "caissuer", value.asInstanceOf[js.Any])
  }
}
