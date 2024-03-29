package typings.losslessJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CircularRefs extends StObject {
    
    var circularRefs: js.UndefOr[Boolean] = js.undefined
  }
  object CircularRefs {
    
    inline def apply(): CircularRefs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularRefs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularRefs] (val x: Self) extends AnyVal {
      
      inline def setCircularRefs(value: Boolean): Self = StObject.set(x, "circularRefs", value.asInstanceOf[js.Any])
      
      inline def setCircularRefsUndefined: Self = StObject.set(x, "circularRefs", js.undefined)
    }
  }
  
  trait CircularRefsBoolean extends StObject {
    
    var circularRefs: Boolean
  }
  object CircularRefsBoolean {
    
    inline def apply(circularRefs: Boolean): CircularRefsBoolean = {
      val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularRefsBoolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularRefsBoolean] (val x: Self) extends AnyVal {
      
      inline def setCircularRefs(value: Boolean): Self = StObject.set(x, "circularRefs", value.asInstanceOf[js.Any])
    }
  }
}
