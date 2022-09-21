package typings.materializeCss.mod

import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<undefined> * / any */ @JSImport("materialize-css", "CharacterCounter")
@js.native
open class CharacterCounter () extends StObject
object CharacterCounter {
  
  @JSImport("materialize-css", "CharacterCounter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.CharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.CharacterCounter]
  
  /**
    * Init CharacterCounters
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.CharacterCounter] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.CharacterCounter]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: Partial[Unit]
  ): js.Array[typings.materializeCss.M.CharacterCounter] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.CharacterCounter]]
  /**
    * Init CharacterCounter
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.CharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.CharacterCounter]
  inline def init(els: Element, options: Partial[Unit]): typings.materializeCss.M.CharacterCounter = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.CharacterCounter]
}
