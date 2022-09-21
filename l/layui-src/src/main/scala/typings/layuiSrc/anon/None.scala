package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait None extends StObject {
  
  var none: String
}
object None {
  
  inline def apply(none: String): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  
  extension [Self <: None](x: Self) {
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
