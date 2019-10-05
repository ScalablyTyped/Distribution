package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialRadio.adapterMod.MDCRadioAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "radio")
@js.native
object radio extends js.Object {
  @js.native
  class MDCRadio ()
    extends typings.atMaterialRadio.atMaterialRadioMod.MDCRadio
  
  @js.native
  class MDCRadioFoundation ()
    extends typings.atMaterialRadio.atMaterialRadioMod.MDCRadioFoundation
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): typings.atMaterialRadio.atMaterialRadioMod.MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typings.atMaterialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typings.atMaterialRadio.constantsMod.strings = js.native
  }
  
}

