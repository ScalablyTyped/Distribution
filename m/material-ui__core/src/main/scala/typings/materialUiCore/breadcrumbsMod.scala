package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.breadcrumbsBreadcrumbsMod.BreadcrumbsTypeMap
import typings.materialUiCore.materialUiCoreStrings.nav
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    *
    * API:
    *
    * - [Breadcrumbs API](https://mui.com/api/breadcrumbs/)
    */
  @JSImport("@material-ui/core/Breadcrumbs", JSImport.Default)
  @js.native
  val default: OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]] = js.native
  
  type _To = OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbsMod.foo` */
  override def _to: OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]] = default
}
