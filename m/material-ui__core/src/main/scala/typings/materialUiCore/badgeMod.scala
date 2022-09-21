package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.badgeBadgeMod.BadgeTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    * - [Badges](https://mui.com/components/badges/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/api/badge/)
    */
  @JSImport("@material-ui/core/Badge", JSImport.Default)
  @js.native
  val default: OverridableComponent[BadgeTypeMap[js.Object, div]] = js.native
  
  type _To = OverridableComponent[BadgeTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `badgeMod.foo` */
  override def _to: OverridableComponent[BadgeTypeMap[js.Object, div]] = default
}
