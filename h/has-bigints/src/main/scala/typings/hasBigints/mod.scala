package typings.hasBigints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Determine if the JS environment has BigInt support. Not polyfillable, not forgeable.
    *
    * @example
    * import hasBigInts = require('has-bigints');
    *
    * hasBigInts() === true;
    */
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  
  @JSImport("has-bigints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
