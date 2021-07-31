package typings.ltx

import typings.ltx.elementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("ltx/lib/tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tag(literals: js.Array[String], substitutions: String*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("tag")(literals.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Element]
}
