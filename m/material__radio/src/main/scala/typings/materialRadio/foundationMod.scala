package typings.materialRadio

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialRadio.adapterMod.MDCRadioAdapter
import typings.materialRadio.anon.PartialMDCRadioAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/radio/foundation", JSImport.Default)
  @js.native
  class default () extends MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  @JSImport("@material/radio/foundation", "MDCRadioFoundation")
  @js.native
  class MDCRadioFoundation () extends MDCFoundation[MDCRadioAdapter] {
    def this(adapter: PartialMDCRadioAdapter) = this()
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
