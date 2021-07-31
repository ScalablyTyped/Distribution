package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.cardHeaderCardHeaderMod.CardHeaderProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod extends Shortcut {
  
  @JSImport("@material-ui/core/CardHeader", JSImport.Default)
  @js.native
  val default: ComponentType[CardHeaderProps] = js.native
  
  type _To = ComponentType[CardHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardHeaderMod.foo` */
  override def _to: ComponentType[CardHeaderProps] = default
}
