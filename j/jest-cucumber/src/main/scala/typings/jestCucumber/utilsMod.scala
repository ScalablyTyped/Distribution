package typings.jestCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("jest-cucumber/dist/src/code-generation/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indent(stringToIndent: String, tabsToIndent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(stringToIndent.asInstanceOf[js.Any], tabsToIndent.asInstanceOf[js.Any])).asInstanceOf[String]
}
