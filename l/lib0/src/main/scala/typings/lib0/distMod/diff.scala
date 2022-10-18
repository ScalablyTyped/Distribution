package typings.lib0.distMod

import typings.lib0.anon.Index
import typings.lib0.distDiffMod.SimpleDiff_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diff {
  
  @JSImport("lib0/dist", "diff")
  @js.native
  val ^ : js.Any = js.native
  
  inline def simpleDiff(a: String, b: String): SimpleDiff_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[String]]
  
  inline def simpleDiffArray[T](a: js.Array[T], b: js.Array[T]): SimpleDiff_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[js.Array[T]]]
  inline def simpleDiffArray[T](a: js.Array[T], b: js.Array[T], compare: js.Function2[/* arg0 */ T, /* arg1 */ T, Boolean]): SimpleDiff_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[js.Array[T]]]
  
  inline def simpleDiffString(a: String, b: String): SimpleDiff_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[String]]
  
  inline def simpleDiffStringWithCursor(a: String, b: String, cursor: Double): Index = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffStringWithCursor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Index]
}
