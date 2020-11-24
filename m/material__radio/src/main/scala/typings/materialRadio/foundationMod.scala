package typings.materialRadio

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialRadio.adapterMod.MDCRadioAdapter
import typings.materialRadio.anon.DISABLED
import typings.materialRadio.anon.NATIVECONTROLSELECTOR
import typings.materialRadio.anon.PartialMDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/radio/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCRadioFoundation () extends MDCFoundation[MDCRadioAdapter] {
    def this(adapter: PartialMDCRadioAdapter) = this()
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    
    def cssClasses: DISABLED = js.native
    
    def defaultAdapter: MDCRadioAdapter = js.native
    
    def strings: NATIVECONTROLSELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: DISABLED = js.native
    
    def defaultAdapter: MDCRadioAdapter = js.native
    
    def strings: NATIVECONTROLSELECTOR = js.native
  }
}
