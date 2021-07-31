package typings.ltx

import typings.ltx.elementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  @JSImport("ltx/lib/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone_[T /* <: Element */](el: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(el.asInstanceOf[js.Any]).asInstanceOf[T]
}
