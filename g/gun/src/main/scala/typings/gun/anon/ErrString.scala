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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrString] (val x: Self) extends AnyVal {
    
    inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
  }
}
