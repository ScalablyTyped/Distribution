package typings.ionicCore

import typings.ionicCore.pickerInterfaceMod.PickerColumn
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerColumnMod {
  
  @JSImport("@ionic/core/dist/types/components/picker-column/picker-column", "PickerColumnCmp")
  @js.native
  class PickerColumnCmp () extends ComponentInterface {
    
    var bounceFrom: js.Any = js.native
    
    /** Picker column data */
    var col: PickerColumn = js.native
    
    /* protected */ def colChanged(): Unit = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MPickerColumnCmp(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MPickerColumnCmp(): js.Promise[Unit] = js.native
    
    var decelerate: js.Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MPickerColumnCmp(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var emitColChange: js.Any = js.native
    
    var gesture: js.Any = js.native
    
    var indexForY: js.Any = js.native
    
    /**
      * Emitted when the selected value has changed
      * @internal
      */
    var ionPickerColChange: EventEmitter[PickerColumn] = js.native
    
    var lastIndex: js.Any = js.native
    
    var maxY: js.Any = js.native
    
    var minY: js.Any = js.native
    
    var noAnimate: js.Any = js.native
    
    var onEnd: js.Any = js.native
    
    var onMove: js.Any = js.native
    
    var onStart: js.Any = js.native
    
    var optHeight: js.Any = js.native
    
    var optsEl: js.Any = js.native
    
    var rafId: js.Any = js.native
    
    var refresh: js.Any = js.native
    
    @JSName("render")
    def render_MPickerColumnCmp(): js.Any = js.native
    
    var rotateFactor: js.Any = js.native
    
    var scaleFactor: js.Any = js.native
    
    var setSelected: js.Any = js.native
    
    var tmrId: js.Any = js.native
    
    var update: js.Any = js.native
    
    var velocity: js.Any = js.native
    
    var y: js.Any = js.native
  }
}
