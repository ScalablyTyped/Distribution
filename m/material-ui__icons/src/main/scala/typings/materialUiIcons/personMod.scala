package typings.materialUiIcons

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.svgIconSvgIconMod.SvgIconProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personMod extends Shortcut {
  
  @JSImport("@material-ui/icons/Person", JSImport.Default)
  @js.native
  val default: ComponentType[SvgIconProps] = js.native
  
  type _To = ComponentType[SvgIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `personMod.foo` */
  override def _to: ComponentType[SvgIconProps] = default
}
