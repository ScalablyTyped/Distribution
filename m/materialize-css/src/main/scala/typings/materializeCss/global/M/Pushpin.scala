package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialPushpinOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Pushpin")
@js.native
open class Pushpin ()
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
  inline def getInstance(elem: Element): typings.materializeCss.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Pushpin]
  
  /**
    * Init Pushpins
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.Pushpin] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Pushpin]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialPushpinOptions
  ): js.Array[typings.materializeCss.M.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Pushpin]]
  /**
    * Init Pushpin
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Pushpin = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Pushpin]
  inline def init(els: Element, options: PartialPushpinOptions): typings.materializeCss.M.Pushpin = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Pushpin]
}
