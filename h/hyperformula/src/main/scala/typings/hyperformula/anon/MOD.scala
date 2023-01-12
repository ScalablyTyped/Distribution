package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MOD extends StObject {
  
  var MOD: Method
}
object MOD {
  
  inline def apply(MOD: Method): MOD = {
    val __obj = js.Dynamic.literal(MOD = MOD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MOD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MOD] (val x: Self) extends AnyVal {
    
    inline def setMOD(value: Method): Self = StObject.set(x, "MOD", value.asInstanceOf[js.Any])
  }
}
