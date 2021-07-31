package typings.grunt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// NodeJS Support
object mod extends Shortcut {
  
  @JSImport("grunt", JSImport.Namespace)
  @js.native
  val ^ : js.Object & IGrunt = js.native
  
  type _To = js.Object & IGrunt
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & IGrunt = ^
}
