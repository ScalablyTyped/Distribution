package typings.matchIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A safer `String.prototype.match()`/`RegExp.exec()`.
    *
    * @example
    * import matchIt = require("match-it");
    *
    * const re = /(World|Mars)/;
    *
    * console.log(matchIt("Hello World!", re)[1]);
    * // => World
    *
    * console.log(matchIt("Hello Mars!", re)[1]);
    * // => Mars
    *
    * console.log(matchIt("Hello Pluto!", re)[1]);
    * // => undefined
    */
  inline def apply(input: String, re: js.RegExp): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], re.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("match-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
