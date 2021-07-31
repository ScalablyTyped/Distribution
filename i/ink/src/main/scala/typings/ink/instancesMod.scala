package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancesMod extends Shortcut {
  
  @JSImport("ink/build/instances", JSImport.Default)
  @js.native
  val default: WeakMap[js.Object, js.Any] = js.native
  
  type _To = WeakMap[js.Object, js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `instancesMod.foo` */
  override def _to: WeakMap[js.Object, js.Any] = default
}
