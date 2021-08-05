package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffStringsMod {
  
  @JSImport("jest-diff/build/diffStrings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: String, b: String): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
}
