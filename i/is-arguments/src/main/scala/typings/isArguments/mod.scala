package typings.isArguments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This function determines whether `value` is an `arguments` object.
    *
    * **Caveats:** If you have modified an actual `arguments` object by giving
    * it a `Symbol.toStringTag` property, then this function will return `false`.
    */
  inline def apply(value: Any): /* is std.IArguments */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.IArguments */ Boolean]
  
  @JSImport("is-arguments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
