package typings.lapoAsn1js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait C extends StObject {
    
    var c: String
    
    var d: String
    
    var w: js.UndefOr[Boolean] = js.undefined
  }
  object C {
    
    inline def apply(c: String, d: String): C = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[C]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: C] (val x: Self) extends AnyVal {
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setW(value: Boolean): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
}
