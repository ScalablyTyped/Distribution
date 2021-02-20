package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.typographyTypographyMod.TypographyProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod extends Shortcut {
  
  @JSImport("@material-ui/core/Typography", JSImport.Default)
  @js.native
  val default: ComponentType[TypographyProps] = js.native
  
  type _To = ComponentType[TypographyProps]
  
  /* This means you don't have to write `default`, but can instead just say `typographyMod.foo` */
  override def _to: ComponentType[TypographyProps] = default
}
