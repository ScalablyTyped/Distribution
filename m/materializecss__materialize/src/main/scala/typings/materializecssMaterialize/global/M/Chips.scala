package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.M.ChipData
import typings.materializecssMaterialize.M.ChipsOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialChipsOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Chips")
@js.native
open class Chips ()
  extends StObject
     with typings.materializecssMaterialize.M.Chips {
  
  /**
    * Add chip to input.
    * @param chip Chip data object
    */
  /* CompleteClass */
  override def addChip(chip: ChipData): Unit = js.native
  
  /**
    * Autocomplete instance, if any.
    */
  /* CompleteClass */
  var autocomplete: typings.materializecssMaterialize.M.Autocomplete = js.native
  
  /**
    * Array of the current chips data.
    */
  /* CompleteClass */
  var chipsData: js.Array[ChipData] = js.native
  
  /**
    * Delete nth chip.
    * @param n  Index of chip
    */
  /* CompleteClass */
  override def deleteChip(n: Double): Unit = js.native
  
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
    * If the chips has autocomplete enabled.
    */
  /* CompleteClass */
  var hasAutocomplete: Boolean = js.native
  
  /**
    * The options the instance was initialized with.
    */
  /* CompleteClass */
  var options: ChipsOptions = js.native
  
  /**
    * Select nth chip.
    * @param n Index of chip
    */
  /* CompleteClass */
  override def selectChip(n: Double): Unit = js.native
}
object Chips {
  
  @JSGlobal("M.Chips")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance.
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Chips = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Chips]
  
  /**
    * Init Chipses.
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Chips] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Chips]]
  inline def init(els: MElements, options: PartialChipsOptions): js.Array[typings.materializecssMaterialize.M.Chips] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Chips]]
  /**
    * Init Chips.
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Chips = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Chips]
  inline def init(els: Element, options: PartialChipsOptions): typings.materializecssMaterialize.M.Chips = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Chips]
}
