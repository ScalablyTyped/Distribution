package typings.jestUtil

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testPathPatternToRegExpMod {
  
  @JSImport("jest-util/build/testPathPatternToRegExp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(testPathPattern: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(testPathPattern.asInstanceOf[js.Any]).asInstanceOf[RegExp]
}
