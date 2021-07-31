package typings.jsxChai

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.ChaiStatic
import typings.chai.Chai.ChaiUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsx-chai", JSImport.Namespace)
  @js.native
  val ^ : JsxChaiStatic = js.native
  
  trait JsxChaiStatic extends StObject {
    
    def jsxChai(chai: ChaiStatic, utils: ChaiUtils): Unit
    @JSName("jsxChai")
    var jsxChai_Original: jsxChaiFunction
  }
  object JsxChaiStatic {
    
    @scala.inline
    def apply(jsxChai: (/* chai */ ChaiStatic, /* utils */ ChaiUtils) => Unit): JsxChaiStatic = {
      val __obj = js.Dynamic.literal(jsxChai = js.Any.fromFunction2(jsxChai))
      __obj.asInstanceOf[JsxChaiStatic]
    }
    
    @scala.inline
    implicit class JsxChaiStaticMutableBuilder[Self <: JsxChaiStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsxChai(value: (/* chai */ ChaiStatic, /* utils */ ChaiUtils) => Unit): Self = StObject.set(x, "jsxChai", js.Any.fromFunction2(value))
    }
  }
  
  type _To = JsxChaiStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JsxChaiStatic = ^
  
  type jsxChaiFunction = ChaiPlugin
}
