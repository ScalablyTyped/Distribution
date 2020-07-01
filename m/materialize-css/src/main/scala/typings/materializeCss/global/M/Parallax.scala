package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialParallaxOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ParallaxOptions> * / any */ @JSGlobal("M.Parallax")
@js.native
class Parallax () extends js.Object

/* static members */
@JSGlobal("M.Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Parallax] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialParallaxOptions
  ): js.Array[typings.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typings.materializeCss.M.Parallax = js.native
  def init(els: Element, options: PartialParallaxOptions): typings.materializeCss.M.Parallax = js.native
}

