package typings.hashIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMinTypesHashMod {
  
  @JSImport("hash-it/dist/min/types/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
}
