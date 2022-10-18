package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreNativePointerEventTypeMod extends Shortcut {
  
  @JSImport("@interactjs/core/NativePointerEventType", JSImport.Default)
  @js.native
  val default: PointerEvent = js.native
  
  type _To = PointerEvent
  
  /* This means you don't have to write `default`, but can instead just say `coreNativePointerEventTypeMod.foo` */
  override def _to: PointerEvent = default
}
