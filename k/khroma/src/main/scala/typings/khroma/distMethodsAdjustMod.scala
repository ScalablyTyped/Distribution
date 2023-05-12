package typings.khroma

import typings.khroma.anon.PartialCHANNELS
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsAdjustMod {
  
  @JSImport("khroma/dist/methods/adjust", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color: Channels, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
}
