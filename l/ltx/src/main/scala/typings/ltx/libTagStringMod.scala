package typings.ltx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagStringMod {
  
  inline def apply(literals: js.Array[String], substitutions: String*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(literals.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("ltx/lib/tagString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
