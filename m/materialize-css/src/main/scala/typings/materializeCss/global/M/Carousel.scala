package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialCarouselOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Carousel")
@js.native
class Carousel ()
  extends StObject
     with typings.materializeCss.M.Carousel
object Carousel {
  
  @JSGlobal("M.Carousel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  @scala.inline
  def getInstance(elem: Element): typings.materializeCss.M.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Carousel]
  
  /**
    * Init carousels
    */
  /* static member */
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Carousel] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Carousel]]
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialCarouselOptions
  ): js.Array[typings.materializeCss.M.Carousel] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Carousel]]
  /**
    * Init carousel
    */
  /* static member */
  @scala.inline
  def init(els: Element): typings.materializeCss.M.Carousel = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Carousel]
  @scala.inline
  def init(els: Element, options: PartialCarouselOptions): typings.materializeCss.M.Carousel = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Carousel]
}
