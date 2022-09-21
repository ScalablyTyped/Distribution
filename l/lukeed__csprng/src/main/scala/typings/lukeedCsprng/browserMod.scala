package typings.lukeedCsprng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@lukeed/csprng/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def random[T](len: Double): T = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(len.asInstanceOf[js.Any]).asInstanceOf[T]
}
