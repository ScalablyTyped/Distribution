package typings.json5

import org.scalablytyped.runtime.Shortcut
import typings.json5.anon.Quote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("json5", JSImport.Namespace)
  @js.native
  val ^ : JSON5 = js.native
  
  @js.native
  trait JSON5 extends StObject {
    
    // Old JSON methods
    def parse(text: String): js.Any = js.native
    def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]): js.Any = js.native
    
    def stringify(value: js.Any): String = js.native
    def stringify(value: js.Any, options: Quote): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): String = js.native
    def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: String): String = js.native
    def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: Double): String = js.native
    def stringify(value: js.Any, replacer: Null, space: String): String = js.native
    def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
    def stringify(value: js.Any, replacer: Unit, space: String): String = js.native
    def stringify(value: js.Any, replacer: Unit, space: Double): String = js.native
  }
  
  type JSONReplacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null]
  
  type _To = JSON5
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JSON5 = ^
}
