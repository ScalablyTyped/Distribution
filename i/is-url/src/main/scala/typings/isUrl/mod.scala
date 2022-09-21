package typings.isUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @returns Whether `string` is a URL.
    */
  inline def apply(string: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
