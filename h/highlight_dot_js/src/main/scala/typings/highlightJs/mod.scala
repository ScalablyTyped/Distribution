package typings.highlightJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// deprecated API since v10
// declare module 'highlight.js/lib/highlight.js';
object mod extends Shortcut {
  
  @JSImport("highlight.js", JSImport.Namespace)
  @js.native
  val ^ : HLJSApi = js.native
  
  type _To = HLJSApi
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HLJSApi = ^
}
