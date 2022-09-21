package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.cardHeaderCardHeaderMod.OverridableCardHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardHeader API](https://mui.com/api/card-header/)
    */
  @JSImport("@material-ui/core/CardHeader", JSImport.Default)
  @js.native
  val default: OverridableCardHeader = js.native
  
  type _To = OverridableCardHeader
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderMod.foo` */
  override def _to: OverridableCardHeader = default
}
