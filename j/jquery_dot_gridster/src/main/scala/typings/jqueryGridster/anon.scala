package typings.jqueryGridster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Helper extends StObject {
    
    var helper: JQuery
  }
  object Helper {
    
    @scala.inline
    def apply(helper: JQuery): Helper = {
      val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Helper]
    }
    
    @scala.inline
    implicit class HelperMutableBuilder[Self <: Helper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
