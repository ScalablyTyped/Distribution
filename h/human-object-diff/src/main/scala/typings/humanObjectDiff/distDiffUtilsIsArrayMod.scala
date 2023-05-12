package typings.humanObjectDiff

import typings.deepDiff.mod.Diff_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDiffUtilsIsArrayMod {
  
  @JSImport("human-object-diff/dist/diff/utils/is-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArrayDiff(diff: Diff_[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayDiff")(diff.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
