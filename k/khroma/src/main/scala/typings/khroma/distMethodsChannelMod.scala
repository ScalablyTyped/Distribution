package typings.khroma

import typings.khroma.distTypesMod.CHANNEL
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsChannelMod {
  
  @JSImport("khroma/dist/methods/channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String, channel: CHANNEL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(color: Channels, channel: CHANNEL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
}
