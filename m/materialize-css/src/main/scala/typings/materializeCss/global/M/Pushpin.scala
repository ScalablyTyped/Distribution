package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialPushpinOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Pushpin")
@js.native
class Pushpin ()
  extends StObject
     with typings.materializeCss.M.Pushpin {
  
  /**
    * Original offsetTop of element
    */
  /* CompleteClass */
  var originalOffset: Double = js.native
}
object Pushpin {
  
  @JSGlobal("M.Pushpin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  @scala.inline
  def getInstance(elem: Element): typings.materializeCss.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Pushpin]
  
  /**
    * Init Pushpins
    */
  /* static member */
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Pushpin] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Pushpin]]
  @scala.inline
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialPushpinOptions
  ): js.Array[typings.materializeCss.M.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Pushpin]]
  /**
    * Init Pushpin
    */
  /* static member */
  @scala.inline
  def init(els: Element): typings.materializeCss.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Pushpin]
  @scala.inline
  def init(els: Element, options: PartialPushpinOptions): typings.materializeCss.M.Pushpin = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Pushpin]
}
