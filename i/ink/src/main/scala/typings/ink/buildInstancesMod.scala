package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInstancesMod extends Shortcut {
  
  @JSImport("ink/build/instances", JSImport.Default)
  @js.native
  val default: WeakMap[WriteStream, typings.ink.buildInkMod.default] = js.native
  
  type _To = WeakMap[WriteStream, typings.ink.buildInkMod.default]
  
  /* This means you don't have to write `default`, but can instead just say `buildInstancesMod.foo` */
  override def _to: WeakMap[WriteStream, typings.ink.buildInkMod.default] = default
}
