package typings.khroma

import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsMixMod {
  
  @JSImport("khroma/dist/methods/mix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color1: String, color2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: String, color2: String, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: String, color2: Channels): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: String, color2: Channels, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: Channels, color2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: Channels, color2: String, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: Channels, color2: Channels): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(color1: Channels, color2: Channels, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
}
