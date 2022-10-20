package typings.lightship

import org.scalablytyped.runtime.Shortcut
import typings.roarr.distSrcTypesMod.JsonObject
import typings.roarr.distSrcTypesMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLoggerMod extends Shortcut {
  
  @JSImport("lightship/dist/src/Logger", JSImport.Default)
  @js.native
  val default: Logger[JsonObject] = js.native
  
  type _To = Logger[JsonObject]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcLoggerMod.foo` */
  override def _to: Logger[JsonObject] = default
}
