package typings.materialUiIcons

import typings.materialUiCore.svgIconSvgIconMod.SvgIconProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSvgIconMod {
  
  @JSImport("@material-ui/icons/utils/createSvgIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: ReactNode, displayName: String): ComponentType[SvgIconProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[ComponentType[SvgIconProps]]
}
