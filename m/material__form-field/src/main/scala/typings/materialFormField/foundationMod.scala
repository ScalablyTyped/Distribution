package typings.materialFormField

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialFormField.adapterMod.MDCFormFieldAdapter
import typings.materialFormField.anon.LABELSELECTOR
import typings.materialFormField.anon.PartialMDCFormFieldAdapte
import typings.materialFormField.anon.ROOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCFormFieldFoundation () extends MDCFoundation[MDCFormFieldAdapter] {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  @js.native
  class default () extends MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    def cssClasses: ROOT = js.native
    def defaultAdapter: MDCFormFieldAdapter = js.native
    def strings: LABELSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: ROOT = js.native
    def defaultAdapter: MDCFormFieldAdapter = js.native
    def strings: LABELSELECTOR = js.native
  }
  
}

