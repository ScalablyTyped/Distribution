package typings.materialUiCore

import typings.materialUiCore.materialUiCoreStrings.svg
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.svgIconSvgIconMod.SvgIconTypeMap
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSvgIconMod {
  
  @JSImport("@material-ui/core/utils/createSvgIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: ReactNode, displayName: String): OverridableComponent[SvgIconTypeMap[js.Object, svg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[OverridableComponent[SvgIconTypeMap[js.Object, svg]]]
}
