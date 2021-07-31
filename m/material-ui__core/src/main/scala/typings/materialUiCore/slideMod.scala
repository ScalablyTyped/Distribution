package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.slideSlideMod.SlideProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideMod extends Shortcut {
  
  @JSImport("@material-ui/core/Slide", JSImport.Default)
  @js.native
  val default: ComponentType[SlideProps] = js.native
  
  type _To = ComponentType[SlideProps]
  
  /* This means you don't have to write `default`, but can instead just say `slideMod.foo` */
  override def _to: ComponentType[SlideProps] = default
}
