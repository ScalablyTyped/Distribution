package typings.humanObjectDiff

import typings.deepDiff.mod.PreFilter
import typings.humanObjectDiff.distTypesMod.DiffConfigWithoutTemplates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineUtilsGetPrefilterMod {
  
  @JSImport("human-object-diff/dist/engine/utils/get-prefilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: DiffConfigWithoutTemplates): js.UndefOr[PreFilter[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PreFilter[Any, Any]]]
}
