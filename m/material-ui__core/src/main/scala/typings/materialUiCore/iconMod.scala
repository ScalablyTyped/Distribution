package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.iconIconMod.IconTypeMap
import typings.materialUiCore.materialUiCoreStrings.span
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [Icon API](https://mui.com/api/icon/)
    */
  @JSImport("@material-ui/core/Icon", JSImport.Default)
  @js.native
  val default: OverridableComponent[IconTypeMap[js.Object, span]] = js.native
  
  type _To = OverridableComponent[IconTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `iconMod.foo` */
  override def _to: OverridableComponent[IconTypeMap[js.Object, span]] = default
}
