package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.cardContentCardContentMod.CardContentTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardContent API](https://mui.com/api/card-content/)
    */
  @JSImport("@material-ui/core/CardContent", JSImport.Default)
  @js.native
  val default: OverridableComponent[CardContentTypeMap[js.Object, div]] = js.native
  
  type _To = OverridableComponent[CardContentTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `cardContentMod.foo` */
  override def _to: OverridableComponent[CardContentTypeMap[js.Object, div]] = default
}
