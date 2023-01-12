package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sub extends StObject {
  
  var sub: js.UndefOr[String] = js.undefined
}
object Sub {
  
  inline def apply(): Sub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sub]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sub] (val x: Self) extends AnyVal {
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
