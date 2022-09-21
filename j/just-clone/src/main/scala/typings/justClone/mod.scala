package typings.justClone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Object */](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
}
