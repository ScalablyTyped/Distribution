package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.badgeBadgeMod.BadgeProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod extends Shortcut {
  
  @JSImport("@material-ui/core/Badge", JSImport.Default)
  @js.native
  val default: ComponentType[BadgeProps] = js.native
  
  type _To = ComponentType[BadgeProps]
  
  /* This means you don't have to write `default`, but can instead just say `badgeMod.foo` */
  override def _to: ComponentType[BadgeProps] = default
}
