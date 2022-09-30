package typings.ltx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTagStringMod {
  
  @JSImport("ltx/src/tagString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(literals: js.Array[String], substitutions: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(literals.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
