package typings.iscroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fn extends StObject {
    
    def fn(k: js.Any): js.Any
    
    var style: String
  }
  object Fn {
    
    @scala.inline
    def apply(fn: js.Any => js.Any, style: String): Fn = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn]
    }
    
    @scala.inline
    implicit class FnMutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFn(value: js.Any => js.Any): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
