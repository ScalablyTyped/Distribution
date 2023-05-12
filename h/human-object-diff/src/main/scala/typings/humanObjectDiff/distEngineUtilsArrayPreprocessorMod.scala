package typings.humanObjectDiff

import typings.humanObjectDiff.humanObjectDiffStrings.I
import typings.humanObjectDiff.humanObjectDiffStrings.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineUtilsArrayPreprocessorMod {
  
  @JSImport("human-object-diff/dist/engine/utils/array-preprocessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[String | Change] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: js.Array[typings.humanObjectDiff.distDiffMod.default]): js.Array[String | Change] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: js.Array[typings.humanObjectDiff.distDiffMod.default], lhs: Any): js.Array[String | Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], lhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: js.Array[typings.humanObjectDiff.distDiffMod.default], lhs: Any, rhs: Any): js.Array[String | Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: js.Array[typings.humanObjectDiff.distDiffMod.default], lhs: Unit, rhs: Any): js.Array[String | Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: Unit, lhs: Any): js.Array[String | Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], lhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: Unit, lhs: Any, rhs: Any): js.Array[String | Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Change]]
  inline def default(diffs: Unit, lhs: Unit, rhs: Any): js.Array[String | Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diffs.asInstanceOf[js.Any], lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Change]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanObjectDiff.anon.DotPath
    - typings.humanObjectDiff.anon.Index
  */
  trait Change extends StObject
  object Change {
    
    inline def DotPath(dotPath: String, index: Double, kind: I | R, path: js.Array[String], `val`: Any): typings.humanObjectDiff.anon.DotPath = {
      val __obj = js.Dynamic.literal(dotPath = dotPath.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.humanObjectDiff.anon.DotPath]
    }
    
    inline def Index(
      dotPath: String,
      isArray: Boolean,
      kind: /* import warning: importer.ImportType#apply Failed type conversion: 'prefilter'['templates'] */ js.Any,
      lhs: Any,
      path: js.Array[String],
      rhs: Any,
      `val`: Any
    ): typings.humanObjectDiff.anon.Index = {
      val __obj = js.Dynamic.literal(dotPath = dotPath.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.humanObjectDiff.anon.Index]
    }
  }
}
