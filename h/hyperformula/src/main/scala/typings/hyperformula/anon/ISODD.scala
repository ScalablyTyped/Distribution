package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISODD extends StObject {
  
  var ISODD: Method
}
object ISODD {
  
  inline def apply(ISODD: Method): ISODD = {
    val __obj = js.Dynamic.literal(ISODD = ISODD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISODD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISODD] (val x: Self) extends AnyVal {
    
    inline def setISODD(value: Method): Self = StObject.set(x, "ISODD", value.asInstanceOf[js.Any])
  }
}
