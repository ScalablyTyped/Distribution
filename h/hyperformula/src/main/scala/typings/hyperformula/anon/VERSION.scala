package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VERSION extends StObject {
  
  var VERSION: ParametersArray
}
object VERSION {
  
  inline def apply(VERSION: ParametersArray): VERSION = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[VERSION]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VERSION] (val x: Self) extends AnyVal {
    
    inline def setVERSION(value: ParametersArray): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
  }
}
