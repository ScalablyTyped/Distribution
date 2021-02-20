package typings.losslessJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CircularRefs extends StObject {
    
    var circularRefs: js.UndefOr[Boolean] = js.native
  }
  object CircularRefs {
    
    @scala.inline
    def apply(): CircularRefs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularRefs]
    }
    
    @scala.inline
    implicit class CircularRefsMutableBuilder[Self <: CircularRefs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircularRefs(value: Boolean): Self = StObject.set(x, "circularRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularRefsUndefined: Self = StObject.set(x, "circularRefs", js.undefined)
    }
  }
  
  @js.native
  trait CircularRefsBoolean extends StObject {
    
    var circularRefs: Boolean = js.native
  }
  object CircularRefsBoolean {
    
    @scala.inline
    def apply(circularRefs: Boolean): CircularRefsBoolean = {
      val __obj = js.Dynamic.literal(circularRefs = circularRefs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularRefsBoolean]
    }
    
    @scala.inline
    implicit class CircularRefsBooleanMutableBuilder[Self <: CircularRefsBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircularRefs(value: Boolean): Self = StObject.set(x, "circularRefs", value.asInstanceOf[js.Any])
    }
  }
}
