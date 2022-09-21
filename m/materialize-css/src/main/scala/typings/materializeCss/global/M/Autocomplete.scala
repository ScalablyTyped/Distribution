package typings.materializeCss.global.M

import typings.materializeCss.M.AutocompleteData
import typings.materializeCss.anon.PartialAutocompleteOption
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Autocomplete")
@js.native
open class Autocomplete ()
  extends StObject
     with typings.materializeCss.M.Autocomplete {
  
  /**
    * Index of the current selected option.
    */
  /* CompleteClass */
  var activeIndex: Double = js.native
  
  /**
    * Hide autocomplete.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Number of matching autocomplete options.
    */
  /* CompleteClass */
  var count: Double = js.native
  
  /**
    * If the autocomplete is open.
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * Show autocomplete.
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
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
  
  @JSGlobal("M.Autocomplete")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Autocomplete = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Autocomplete]
  
  /**
    * Init autocompletes
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializeCss.M.Autocomplete] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Autocomplete]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialAutocompleteOption
  ): js.Array[typings.materializeCss.M.Autocomplete] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Autocomplete]]
  /**
    * Init autocomplete
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Autocomplete = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Autocomplete]
  inline def init(els: Element, options: PartialAutocompleteOption): typings.materializeCss.M.Autocomplete = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Autocomplete]
}
