package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialScrollSpyOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ScrollSpyOptions> * / any */ @JSGlobal("M.ScrollSpy")
@js.native
class ScrollSpy () extends StObject
object ScrollSpy {
  
  @JSGlobal("M.ScrollSpy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.ScrollSpy]
  
  /**
    * Init ScrollSpies
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.ScrollSpy] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.ScrollSpy]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialScrollSpyOptions
  ): js.Array[typings.materializeCss.M.ScrollSpy] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.ScrollSpy]]
  /**
    * Init ScrollSpy
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.ScrollSpy]
  inline def init(els: Element, options: PartialScrollSpyOptions): typings.materializeCss.M.ScrollSpy = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.ScrollSpy]
}
