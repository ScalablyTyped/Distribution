package typings.ltx

import typings.ltx.srcElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  inline def apply(el: default): String = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(el: default, indent: Double): String = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(el: default, indent: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(el: default, indent: Unit, level: Double): String = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ltx/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
