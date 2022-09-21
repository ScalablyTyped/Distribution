package typings.gulpCoffeelint

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-coffeelint", JSImport.Namespace)
  @js.native
  val ^ : Coffeelint = js.native
  
  @js.native
  trait Coffeelint extends StObject {
    
    /**
      * @param optFile Absolute path of a json file containing options for coffeelint.
      * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
      * @param literate Are we dealing with Literate CoffeeScript?
      * @param rules Add custom rules to coffeelint.
      */
    def apply(): Any = js.native
    def apply(optFile: String): Any = js.native
    def apply(optFile: String, opt: Any): Any = js.native
    def apply(optFile: String, opt: Any, literate: Boolean): Any = js.native
    def apply(optFile: String, opt: Any, literate: Boolean, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: String, opt: Any, literate: Unit, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: String, opt: Unit, literate: Boolean): Any = js.native
    def apply(optFile: String, opt: Unit, literate: Boolean, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: String, opt: Unit, literate: Unit, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: Unit, opt: Any): Any = js.native
    def apply(optFile: Unit, opt: Any, literate: Boolean): Any = js.native
    def apply(optFile: Unit, opt: Any, literate: Boolean, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: Unit, opt: Any, literate: Unit, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: Unit, opt: Unit, literate: Boolean): Any = js.native
    def apply(optFile: Unit, opt: Unit, literate: Boolean, rules: js.Array[js.Function]): Any = js.native
    def apply(optFile: Unit, opt: Unit, literate: Unit, rules: js.Array[js.Function]): Any = js.native
    
    def reporter(): Any = js.native
    def reporter(reporter: String): Any = js.native
    def reporter(reporter: js.Function): Any = js.native
  }
  
  type _To = Coffeelint
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Coffeelint = ^
}
