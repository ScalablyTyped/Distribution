package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransientDisplayidString extends StObject {
  
  var transient: DisplayidString
}
object TransientDisplayidString {
  
  inline def apply(transient: DisplayidString): TransientDisplayidString = {
    val __obj = js.Dynamic.literal(transient = transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransientDisplayidString]
  }
  
  extension [Self <: TransientDisplayidString](x: Self) {
    
    inline def setTransient(value: DisplayidString): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
  }
}
