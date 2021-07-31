package typings.hashJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hash.js", JSImport.Namespace)
  @js.native
  val ^ : Hash = js.native
  
  type _To = Hash
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Hash = ^
}
