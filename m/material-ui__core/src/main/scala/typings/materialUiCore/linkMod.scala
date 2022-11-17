package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.linkLinkMod.LinkTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Links](https://mui.com/components/links/)
    *
    * API:
    *
    * - [Link API](https://mui.com/api/link/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/Link", JSImport.Default)
  @js.native
  val default: OverridableComponent[LinkTypeMap[js.Object, "a"]] = js.native
  
  type _To = OverridableComponent[LinkTypeMap[js.Object, "a"]]
  
  /* This means you don't have to write `default`, but can instead just say `linkMod.foo` */
  override def _to: OverridableComponent[LinkTypeMap[js.Object, "a"]] = default
}
