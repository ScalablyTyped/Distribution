package typings.materializeCss.mod

import typings.materializeCss.anon.PartialTapTargetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typings.materializeCss.M.TapTarget
object TapTarget {
  
  /**
    * Get Instance
    */
  /* static member */
  @JSImport("materialize-css", "TapTarget.getInstance")
  @js.native
  def getInstance(elem: Element): typings.materializeCss.M.TapTarget = js.native
  
  /**
    * Init TapTargets
    */
  /* static member */
  @JSImport("materialize-css", "TapTarget.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.TapTarget] = js.native
  @JSImport("materialize-css", "TapTarget.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTapTargetOptions
  ): js.Array[typings.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  /* static member */
  @JSImport("materialize-css", "TapTarget.init")
  @js.native
  def init(els: Element): typings.materializeCss.M.TapTarget = js.native
  @JSImport("materialize-css", "TapTarget.init")
  @js.native
  def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = js.native
}
