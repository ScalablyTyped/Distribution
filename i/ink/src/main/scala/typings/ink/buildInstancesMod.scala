package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInstancesMod extends Shortcut {
  
  @JSImport("ink/build/instances", JSImport.Default)
  @js.native
  val default: WeakMap[js.Object, Any] = js.native
  
  type _To = WeakMap[js.Object, Any]
  
  /* This means you don't have to write `default`, but can instead just say `buildInstancesMod.foo` */
  override def _to: WeakMap[js.Object, Any] = default
}
