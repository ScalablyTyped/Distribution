package typings.ionicCore

import typings.ionicCore.radioGroupInterfaceMod.RadioGroupChangeEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@ionic/core/dist/types/components/radio-group/radio-group", "RadioGroup")
  @js.native
  class RadioGroup ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the radios can be deselected.
      */
    var allowEmptySelection: Boolean = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MRadioGroup(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRadioGroup(): js.Promise[Unit] = js.native
    
    var el: HTMLElement = js.native
    
    var getRadios: js.Any = js.native
    
    var inputId: js.Any = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[RadioGroupChangeEventDetail] = js.native
    
    var labelId: js.Any = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    var onClick: js.Any = js.native
    
    def onKeydown(ev: js.Any): Unit = js.native
    
    @JSName("render")
    def render_MRadioGroup(): js.Any = js.native
    
    var setRadioTabindex: js.Any = js.native
    
    /**
      * the value of the radio group.
      */
    var value: js.UndefOr[js.Any | Null] = js.native
    
    def valueChanged(): Unit = js.native
    def valueChanged(value: js.Any): Unit = js.native
  }
}
