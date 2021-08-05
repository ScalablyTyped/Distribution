package typings.knuthShuffle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("knuth-shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def knuthShuffle[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("knuthShuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
