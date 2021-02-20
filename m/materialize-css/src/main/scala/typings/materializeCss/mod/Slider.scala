package typings.materializeCss.mod

import typings.materializeCss.anon.PartialSliderOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends typings.materializeCss.M.Slider
object Slider {
  
  /**
    * Get Instance
    */
  /* static member */
  @JSImport("materialize-css", "Slider.getInstance")
  @js.native
  def getInstance(elem: Element): typings.materializeCss.M.Slider = js.native
  
  /**
    * Init Sliders
    */
  /* static member */
  @JSImport("materialize-css", "Slider.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Slider] = js.native
  @JSImport("materialize-css", "Slider.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialSliderOptions
  ): js.Array[typings.materializeCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  /* static member */
  @JSImport("materialize-css", "Slider.init")
  @js.native
  def init(els: Element): typings.materializeCss.M.Slider = js.native
  @JSImport("materialize-css", "Slider.init")
  @js.native
  def init(els: Element, options: PartialSliderOptions): typings.materializeCss.M.Slider = js.native
}
