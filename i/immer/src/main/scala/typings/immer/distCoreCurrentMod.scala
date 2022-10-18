package typings.immer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCurrentMod {
  
  @JSImport("immer/dist/core/current", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def current[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("current")(value.asInstanceOf[js.Any]).asInstanceOf[T]
}
