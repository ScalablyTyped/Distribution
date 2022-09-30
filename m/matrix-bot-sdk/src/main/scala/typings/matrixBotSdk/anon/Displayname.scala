package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayname extends StObject {
  
  var display_name: String
  
  var signed: Any
}
object Displayname {
  
  inline def apply(display_name: String, signed: Any): Displayname = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
  
  extension [Self <: Displayname](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setSigned(value: Any): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
  }
}
