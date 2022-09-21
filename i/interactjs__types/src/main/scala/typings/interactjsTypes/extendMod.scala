package typings.interactjsTypes

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendMod {
  
  @JSImport("@interactjs/utils/extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, U /* <: js.Object */](dest: U & Partial[T], source: T): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
}
