package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialFormDashField.adapterMod.MDCFormFieldAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "formField")
@js.native
object formField extends js.Object {
  @js.native
  class MDCFormField ()
    extends typings.atMaterialFormDashField.atMaterialFormDashFieldMod.MDCFormField
  
  @js.native
  class MDCFormFieldFoundation ()
    extends typings.atMaterialFormDashField.atMaterialFormDashFieldMod.MDCFormFieldFoundation
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): typings.atMaterialFormDashField.atMaterialFormDashFieldMod.MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typings.atMaterialFormDashField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typings.atMaterialFormDashField.constantsMod.strings = js.native
  }
  
}

