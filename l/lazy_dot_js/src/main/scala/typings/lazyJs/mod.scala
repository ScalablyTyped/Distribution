package typings.lazyJs

import org.scalablytyped.runtime.Shortcut
import typings.lazyJs.LazyJS.LazyStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lazy.js", JSImport.Namespace)
  @js.native
  val ^ : LazyStatic = js.native
  
  type _To = LazyStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LazyStatic = ^
}
