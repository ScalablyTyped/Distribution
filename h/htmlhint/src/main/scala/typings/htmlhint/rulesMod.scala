package typings.htmlhint

import org.scalablytyped.runtime.Shortcut
import typings.htmlhint.typesMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulesMod extends Shortcut {
  
  @JSImport("htmlhint/rules", JSImport.Default)
  @js.native
  val default: js.Array[Rule] = js.native
  
  type _To = js.Array[Rule]
  
  /* This means you don't have to write `default`, but can instead just say `rulesMod.foo` */
  override def _to: js.Array[Rule] = default
}
