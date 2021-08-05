package typings.ltx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagStringMod {
  
  @JSImport("ltx/lib/tagString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tagString(literals: js.Array[String], substitutions: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tagString")(literals.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
}
