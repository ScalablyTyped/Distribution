package typings.jsxChai

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.ChaiStatic
import typings.chai.Chai.ChaiUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsx-chai", JSImport.Namespace)
  @js.native
  val ^ : JsxChaiStatic = js.native
  
  @js.native
  trait JsxChaiStatic extends StObject {
    
    def jsxChai(chai: ChaiStatic, utils: ChaiUtils): Unit = js.native
    @JSName("jsxChai")
    var jsxChai_Original: jsxChaiFunction = js.native
  }
  
  type _To = JsxChaiStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JsxChaiStatic = ^
  
  type jsxChaiFunction = ChaiPlugin
}
