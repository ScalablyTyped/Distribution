package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.sliderSliderMod.SliderTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/components/slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/api/slider/)
    */
  @JSImport("@material-ui/core/Slider", JSImport.Default)
  @js.native
  val default: OverridableComponent[SliderTypeMap[js.Object, "span"]] = js.native
  
  type _To = OverridableComponent[SliderTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: OverridableComponent[SliderTypeMap[js.Object, "span"]] = default
}
