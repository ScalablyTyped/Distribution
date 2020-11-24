package typings.materialComponentsWeb.mod

import typings.materialFormField.adapterMod.MDCFormFieldAdapter
import typings.materialFormField.anon.LABELSELECTOR
import typings.materialFormField.anon.PartialMDCFormFieldAdapte
import typings.materialFormField.anon.ROOT
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "formField")
@js.native
object formField extends js.Object {
  
  @js.native
  class MDCFormField ()
    extends typings.materialFormField.mod.MDCFormField
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    
    def attachTo(root: HTMLElement): typings.materialFormField.componentMod.MDCFormField = js.native
  }
  
  @js.native
  class MDCFormFieldFoundation ()
    extends typings.materialFormField.mod.MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    def defaultAdapter: MDCFormFieldAdapter = js.native
    
    def strings: LABELSELECTOR = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var LABEL_SELECTOR: String = js.native
  }
}
