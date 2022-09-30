package typings.ioTsTypes

import typings.ioTs.mod.Any_
import typings.ioTs.mod.TypeOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFallbackMod {
  
  @JSImport("io-ts-types/lib/withFallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withFallback[C /* <: Any_ */](codec: C, a: TypeOf[C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withFallback")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def withFallback[C /* <: Any_ */](codec: C, a: TypeOf[C], name: String): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withFallback")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[C]
}
