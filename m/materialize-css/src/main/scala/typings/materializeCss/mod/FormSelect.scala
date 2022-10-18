package typings.materializeCss.mod

import typings.materializeCss.M.FormSelectOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialFormSelectOptions
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "FormSelect")
@js.native
open class FormSelect ()
  extends StObject
     with typings.materializeCss.M.FormSelect {
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Instance of the dropdown plugin for this select
    */
  /* CompleteClass */
  var dropdown: typings.materializeCss.M.Dropdown = js.native
  
  /**
    * Dropdown UL element
    */
  /* CompleteClass */
  var dropdownOptions: HTMLUListElement = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * Get selected values in an array
    */
  /* CompleteClass */
  override def getSelectedValues(): js.Array[String] = js.native
  
  /**
    * Text input that shows current selected option
    */
  /* CompleteClass */
  var input: HTMLInputElement = js.native
  
  /**
    * If this is a multiple select
    */
  /* CompleteClass */
  var isMultiple: Boolean = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: FormSelectOptions = js.native
  
  /**
    * The select wrapper element
    */
  /* CompleteClass */
  var wrapper: Element = js.native
}
object FormSelect {
  
  @JSImport("materialize-css", "FormSelect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.FormSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.FormSelect]
  
  /**
    * Init FormSelects
    */
  /* static member */
  inline def init(els: MElements): js.Array[typings.materializeCss.M.FormSelect] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.FormSelect]]
  inline def init(els: MElements, options: PartialFormSelectOptions): js.Array[typings.materializeCss.M.FormSelect] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.FormSelect]]
  /**
    * Init FormSelect
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.FormSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.FormSelect]
  inline def init(els: Element, options: PartialFormSelectOptions): typings.materializeCss.M.FormSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.FormSelect]
}
