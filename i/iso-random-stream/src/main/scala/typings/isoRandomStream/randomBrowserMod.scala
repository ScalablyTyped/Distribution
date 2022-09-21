package typings.isoRandomStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomBrowserMod {
  
  /**
    * @param {number} size
    */
  inline def apply(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("iso-random-stream/dist/src/random.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
