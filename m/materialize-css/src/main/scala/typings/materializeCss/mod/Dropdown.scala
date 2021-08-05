package typings.materializeCss.mod

import typings.materializeCss.anon.PartialDropdownOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends StObject
     with typings.materializeCss.M.Dropdown {
  
  /**
    * Close dropdown
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * The DOM element of the dropdown
    */
  /* CompleteClass */
  var dropdownEl: Element = js.native
  
  /**
    * The index of the item focused
    */
  /* CompleteClass */
  var focusedIndex: Double = js.native
  
  /**
    * ID of the dropdown element
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * If the dropdown is open
    */
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /**
    * If the dropdown content is scrollable
    */
  /* CompleteClass */
  var isScrollable: Boolean = js.native
  
  /**
    * Open dropdown
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  /* CompleteClass */
  override def recalculateDimensions(): Unit = js.native
}
object Dropdown {
  
  @JSImport("materialize-css", "Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typings.materializeCss.M.Dropdown = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Dropdown]
  
  /**
    * Init Dropdowns
    */
  /* static member */
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Dropdown] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.materializeCss.M.Dropdown]]
  inline def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialDropdownOptions
  ): js.Array[typings.materializeCss.M.Dropdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.materializeCss.M.Dropdown]]
  /**
    * Init Dropdown
    */
  /* static member */
  inline def init(els: Element): typings.materializeCss.M.Dropdown = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typings.materializeCss.M.Dropdown]
  inline def init(els: Element, options: PartialDropdownOptions): typings.materializeCss.M.Dropdown = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materializeCss.M.Dropdown]
}
