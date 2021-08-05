package typings.ltx

import typings.ltx.elementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  @JSImport("ltx/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(el: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(el: Element, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(el: Element, indent: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(el: Element, indent: Unit, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
}
