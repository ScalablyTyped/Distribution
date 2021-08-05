package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrString extends StObject {
  
  var err: String
}
object ErrString {
  
  inline def apply(err: String): ErrString = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrString]
  }
  
  extension [Self <: ErrString](x: Self) {
    
    inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
  }
}
