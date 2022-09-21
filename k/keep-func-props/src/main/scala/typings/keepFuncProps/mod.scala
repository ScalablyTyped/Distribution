package typings.keepFuncProps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keep-func-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function */](wrapper: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapper.asInstanceOf[js.Any]).asInstanceOf[T]
}
