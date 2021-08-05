package typings.isNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Will test to see if the argument is a valid number, excluding Infinity and NaN.
    * @param num Any value that should be tested for being a number
    * @returns true if the parameter is a valid number, otherwise false
    */
  inline def apply(num: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
