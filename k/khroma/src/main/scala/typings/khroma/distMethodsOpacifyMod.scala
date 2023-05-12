package typings.khroma

import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsOpacifyMod {
  
  @JSImport("khroma/dist/methods/opacify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
}
