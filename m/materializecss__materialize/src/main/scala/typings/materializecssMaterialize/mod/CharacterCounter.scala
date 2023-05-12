package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.MElements
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "CharacterCounter")
@js.native
open class CharacterCounter ()
  extends StObject
     with typings.materializecssMaterialize.M.Component[Unit] {
  
  /**
    * Destroy plugin instance and teardown.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with.
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * The options the instance was initialized with.
    */
  /* CompleteClass */
  var options: Unit = js.native
}
object CharacterCounter {
  
  @JSImport("@materializecss/materialize", "CharacterCounter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance.
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.CharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.CharacterCounter]
  
  /**
    * Init CharacterCounters.
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.CharacterCounter] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.CharacterCounter]]
  inline def init(els: MElements, options: Partial[Unit]): js.Array[typings.materializecssMaterialize.M.CharacterCounter] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.CharacterCounter]]
  /**
    * Init CharacterCounter.
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.CharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.CharacterCounter]
  inline def init(els: Element, options: Partial[Unit]): typings.materializecssMaterialize.M.CharacterCounter = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.CharacterCounter]
}
