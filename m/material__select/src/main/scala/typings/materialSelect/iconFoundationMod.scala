package typings.materialSelect

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSelect.anon.ICONEVENT
import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import typings.materialSelect.iconAdapterMod.MDCSelectIconAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/select/icon/foundation", JSImport.Namespace)
@js.native
object iconFoundationMod extends js.Object {
  
  @js.native
  class MDCSelectIconFoundation () extends MDCFoundation[MDCSelectIconAdapter] {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSelectIconFoundation extends js.Object {
    
    /**
      * See {@link MDCSelectIconAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectIconAdapter = js.native
    
    def strings: ICONEVENT = js.native
  }
  
  @js.native
  class default () extends MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * See {@link MDCSelectIconAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectIconAdapter = js.native
    
    def strings: ICONEVENT = js.native
  }
}
