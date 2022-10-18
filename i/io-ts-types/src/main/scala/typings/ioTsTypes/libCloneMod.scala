package typings.ioTsTypes

import typings.ioTs.mod.Any_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCloneMod {
  
  @JSImport("io-ts-types/lib/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_[C /* <: Any_ */](t: C): C = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(t.asInstanceOf[js.Any]).asInstanceOf[C]
}
