package typings.materializeCss.mod

import typings.materializeCss.anon.PartialParallaxOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ParallaxOptions> * / any */ @JSImport("materialize-css", "Parallax")
@js.native
class Parallax () extends StObject
object Parallax {
  
  /**
    * Get Instance
    */
  /* static member */
  @JSImport("materialize-css", "Parallax.getInstance")
  @js.native
  def getInstance(elem: Element): typings.materializeCss.M.Parallax = js.native
  
  /**
    * Init Parallaxs
    */
  /* static member */
  @JSImport("materialize-css", "Parallax.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Parallax] = js.native
  @JSImport("materialize-css", "Parallax.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialParallaxOptions
  ): js.Array[typings.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  /* static member */
  @JSImport("materialize-css", "Parallax.init")
  @js.native
  def init(els: Element): typings.materializeCss.M.Parallax = js.native
  @JSImport("materialize-css", "Parallax.init")
  @js.native
  def init(els: Element, options: PartialParallaxOptions): typings.materializeCss.M.Parallax = js.native
}
