package typings.hashIt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hash-it", JSImport.Default)
  @js.native
  val default: HashIt = js.native
  
  type Compare = js.Function2[/* basis */ Any, /* repeated */ Any, Boolean]
  
  @js.native
  trait HashIt extends StObject {
    
    def apply[Value /* <: Any */](value: Value): Double = js.native
    
    var is: Is = js.native
  }
  
  @js.native
  trait Is extends SingleCompare {
    
    def all(basis: Any, values: Any*): Boolean = js.native
    @JSName("all")
    var all_Original: Compare = js.native
    
    def any(basis: Any, values: Any*): Boolean = js.native
    @JSName("any")
    var any_Original: Compare = js.native
    
    def not(basis: Any, value: Any): Boolean = js.native
    @JSName("not")
    var not_Original: SingleCompare = js.native
  }
  
  type SingleCompare = js.Function2[/* basis */ Any, /* value */ Any, Boolean]
  
  type _To = HashIt
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: HashIt = default
}
