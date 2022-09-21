package typings.isIterable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Checks if a given object is iterable.
    *
    * @example
    * import isIterable = require('is-iterable');
    *
    * isIterable([]); // true
    * isIterable({}); // false
    */
  inline def apply(iterable: Any): /* is std.Iterable<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<unknown> */ Boolean]
  
  @JSImport("is-iterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
