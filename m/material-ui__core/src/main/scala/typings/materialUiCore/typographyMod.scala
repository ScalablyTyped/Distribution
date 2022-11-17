package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.typographyTypographyMod.TypographyTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Typography](https://mui.com/components/typography/)
    *
    * API:
    *
    * - [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/Typography", JSImport.Default)
  @js.native
  val default: OverridableComponent[TypographyTypeMap[js.Object, "span"]] = js.native
  
  type _To = OverridableComponent[TypographyTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `typographyMod.foo` */
  override def _to: OverridableComponent[TypographyTypeMap[js.Object, "span"]] = default
}
