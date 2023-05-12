package typings.humanObjectDiff

import typings.deepDiff.mod.Diff_
import typings.humanObjectDiff.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDiffUtilsAppendDotPathMod {
  
  @JSImport("human-object-diff/dist/diff/utils/append-dot-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendDotPath(diff: Diff_[Any, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("appendDotPath")(diff.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dotPathReducer(diff: Path): js.Function3[/* acc */ String, /* value */ Any, /* i */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dotPathReducer")(diff.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* acc */ String, /* value */ Any, /* i */ Double, String]]
}
