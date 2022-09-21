package typings.materializecssMaterialize.global.M

import typings.materializecssMaterialize.anon.PartialFormSelectOptions
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.FormSelect")
@js.native
open class FormSelect ()
  extends StObject
     with typings.materializecssMaterialize.M.FormSelect {
  
  /**
    * Instance of the dropdown plugin for this select
    */
  /* CompleteClass */
  var dropdown: typings.materializecssMaterialize.M.Dropdown = js.native
  
  /**
    * Dropdown UL element
    */
  /* CompleteClass */
  var dropdownOptions: HTMLUListElement = js.native
  
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
    * The select wrapper element
    */
  /* CompleteClass */
  var wrapper: Element = js.native
}
object FormSelect {
  
  @JSGlobal("M.FormSelect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializecssMaterialize.M.FormSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.FormSelect]
  
  /**
    * Init FormSelects
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any
  ): js.Array[typings.materializecssMaterialize.M.FormSelect] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializecssMaterialize.M.FormSelect]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ Any,
    options: PartialFormSelectOptions
  ): js.Array[typings.materializecssMaterialize.M.FormSelect] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializecssMaterialize.M.FormSelect]]
  /**
    * Init FormSelect
    */
  /* static member */
  inline def init(els: Element): typings.materializecssMaterialize.M.FormSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializecssMaterialize.M.FormSelect]
  inline def init(els: Element, options: PartialFormSelectOptions): typings.materializecssMaterialize.M.FormSelect = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializecssMaterialize.M.FormSelect]
}
