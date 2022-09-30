package typings.ioTsTypes

import typings.ioTs.mod.Any_
import typings.ioTs.mod.Context
import typings.ioTs.mod.InputOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withMessageMod {
  
  @JSImport("io-ts-types/lib/withMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withMessage[C /* <: Any_ */](codec: C, message: js.Function2[/* i */ InputOf[C], /* c */ Context, String]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withMessage")(codec.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[C]
}
