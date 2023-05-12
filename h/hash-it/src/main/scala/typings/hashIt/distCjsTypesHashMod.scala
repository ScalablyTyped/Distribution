package typings.hashIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTypesHashMod {
  
  @JSImport("hash-it/dist/cjs/types/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
}
