package typings.materialRadio

import typings.materialRadio.adapterMod.MDCRadioAdapter
import typings.materialRadio.foundationMod.default
import typings.materialRipple.mod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/radio", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialSelectionControl.mod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCRadio ()
    extends typings.materialBase.componentMod.default[MDCRadioAdapter, default] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    val ripple: MDCRipple = js.native
    var value: String = js.native
  }
  
  @js.native
  class MDCRadioFoundation () extends default
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typings.materialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typings.materialRadio.constantsMod.strings = js.native
  }
  
}

