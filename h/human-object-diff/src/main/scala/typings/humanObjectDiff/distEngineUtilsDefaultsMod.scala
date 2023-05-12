package typings.humanObjectDiff

import typings.humanObjectDiff.distTypesMod.DefaultDiffConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineUtilsDefaultsMod {
  
  @JSImport("human-object-diff/dist/engine/utils/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultConfig(): DefaultDiffConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultConfig")().asInstanceOf[DefaultDiffConfig]
}
