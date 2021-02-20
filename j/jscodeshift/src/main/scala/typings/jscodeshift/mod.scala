package typings.jscodeshift

import org.scalablytyped.runtime.Shortcut
import typings.jscodeshift.coreMod.JSCodeshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jscodeshift", JSImport.Namespace)
  @js.native
  val ^ : JSCodeshift = js.native
  
  type _To = JSCodeshift
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JSCodeshift = ^
}
