package typings.highlightjs

import org.scalablytyped.runtime.Shortcut
import typings.highlightJs.HLJSApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("highlightjs", JSImport.Namespace)
  @js.native
  val ^ : HLJSApi = js.native
  
  type _To = HLJSApi
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HLJSApi = ^
}
