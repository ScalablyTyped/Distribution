package typings.materializecssMaterialize.mod

import typings.materializecssMaterialize.M.AutocompleteData
import typings.materializecssMaterialize.M.AutocompleteOptions
import typings.materializecssMaterialize.MElements
import typings.materializecssMaterialize.anon.PartialAutocompleteOption
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Autocomplete")
@js.native
open class Autocomplete ()
  extends StObject
     with typings.materializecssMaterialize.M.Autocomplete {
  
  /**
    * Index of the current selected option.
    */
  /* CompleteClass */
  var activeIndex: Double = js.native
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Number of matching autocomplete options.
    */
  /* CompleteClass */
  var count: Double = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: AutocompleteOptions = js.native
  
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  /* CompleteClass */
  override def selectOption(el: Element): Unit = js.native
  
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  /* CompleteClass */
  override def updateData(data: AutocompleteData): Unit = js.native
}
object Autocomplete {
  
  @JSImport("@materializecss/materialize", "Autocomplete")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.Autocomplete = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Autocomplete]
  
  /**
    * Init autocompletes
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializecssMaterialize.M.Autocomplete] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Autocomplete]]
  inline def init(els: MElements, options: PartialAutocompleteOption): js.Array[typings.materializecssMaterialize.M.Autocomplete] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.Autocomplete]]
  /**
    * Init autocomplete
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.Autocomplete = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.Autocomplete]
  inline def init(els: Element, options: PartialAutocompleteOption): typings.materializecssMaterialize.M.Autocomplete = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.Autocomplete]
}
