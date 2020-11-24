package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialScrollSpyOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ScrollSpyOptions> * / any */ @JSGlobal("M.ScrollSpy")
@js.native
class ScrollSpy () extends js.Object
/* static members */
@JSGlobal("M.ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.ScrollSpy = js.native
  
  /**
    * Init ScrollSpies
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialScrollSpyOptions
  ): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): typings.materializeCss.M.ScrollSpy = js.native
  def init(els: Element, options: PartialScrollSpyOptions): typings.materializeCss.M.ScrollSpy = js.native
}
