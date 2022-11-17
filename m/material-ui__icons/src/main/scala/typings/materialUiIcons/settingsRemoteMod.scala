package typings.materialUiIcons

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.svgIconSvgIconMod.SvgIconTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsRemoteMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/api/svg-icon/)
    */
  @JSImport("@material-ui/icons/SettingsRemote", JSImport.Default)
  @js.native
  val default: OverridableComponent[SvgIconTypeMap[js.Object, "svg"]] = js.native
  
  type _To = OverridableComponent[SvgIconTypeMap[js.Object, "svg"]]
  
  /* This means you don't have to write `default`, but can instead just say `settingsRemoteMod.foo` */
  override def _to: OverridableComponent[SvgIconTypeMap[js.Object, "svg"]] = default
}
