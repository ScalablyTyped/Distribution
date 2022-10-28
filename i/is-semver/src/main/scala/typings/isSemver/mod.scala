package typings.isSemver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Check if an input value is a valid semver version or not.
    *
    * @param input The version string to check.
    * @returns `true` if the input is a valid semver version or `false` otherwise.
    *
    * @example
    * import isSemver = require("is-semver");
    *
    * console.log(isSemver("1.2.3"));
    * // => true
    *
    * console.log(isSemver("a.b.c"));
    * // => false
    *
    * console.log(isSemver("foo"));
    * // => false
    */
  inline def apply(input: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-semver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
