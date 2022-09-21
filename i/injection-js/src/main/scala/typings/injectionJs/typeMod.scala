package typings.injectionJs

import org.scalablytyped.runtime.Instantiable1
import typings.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("injection-js/facade/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Type[T]
    extends js.Function
       with Instantiable1[/* args (repeated) */ Any, T]
  @JSImport("injection-js/facade/type", "Type")
  @js.native
  val Type: FunctionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("injection-js/facade/type", "Type")
  @js.native
  open class TypeCls protected ()
    extends js.Function {
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    /* standard es5 */
    def this(args: String*) = this()
  }
  
  inline def isType(v: Any): /* is injection-js.injection-js/facade/type.Type<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(v.asInstanceOf[js.Any]).asInstanceOf[/* is injection-js.injection-js/facade/type.Type<any> */ Boolean]
}
