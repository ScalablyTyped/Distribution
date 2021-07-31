package typings.jquery

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jquery", JSImport.Namespace)
  @js.native
  val ^ : JQueryStatic = js.native
  
  type _To = JQueryStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JQueryStatic = ^
}
