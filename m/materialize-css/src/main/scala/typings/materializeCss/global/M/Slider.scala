package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialSliderOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Slider")
@js.native
class Slider ()
  extends typings.materializeCss.M.Slider
/* static members */
@JSGlobal("M.Slider")
@js.native
object Slider extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Slider = js.native
  
  /**
    * Init Sliders
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Slider] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialSliderOptions
  ): js.Array[typings.materializeCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: Element): typings.materializeCss.M.Slider = js.native
  def init(els: Element, options: PartialSliderOptions): typings.materializeCss.M.Slider = js.native
}
