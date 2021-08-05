package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ok extends StObject {
  
  var err: Unit
  
  var ok: String
}
object Ok {
  
  inline def apply(err: Unit, ok: String): Ok = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
  
  extension [Self <: Ok](x: Self) {
    
    inline def setErr(value: Unit): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
