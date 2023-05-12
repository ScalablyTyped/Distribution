package typings.khroma

import typings.khroma.distTypesMod.CHANNEL
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsAdjustChannelMod {
  
  @JSImport("khroma/dist/methods/adjust_channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String, channel: CHANNEL, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color: Channels, channel: CHANNEL, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
}
