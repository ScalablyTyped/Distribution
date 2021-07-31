package typings.hyphen

import org.scalablytyped.runtime.Shortcut
import typings.hyphen.mod.PatternsDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teMod extends Shortcut {
  
  @JSImport("hyphen/patterns/te", JSImport.Namespace)
  @js.native
  val ^ : PatternsDefinition = js.native
  
  type _To = PatternsDefinition
  
  /* This means you don't have to write `^`, but can instead just say `teMod.foo` */
  override def _to: PatternsDefinition = ^
}
