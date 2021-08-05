package typings.ionicCore

import typings.ionicCore.pickerInterfaceMod.PickerColumn
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerColumnMod {
  
  @JSImport("@ionic/core/dist/types/components/picker-column/picker-column", "PickerColumnCmp")
  @js.native
  class PickerColumnCmp ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var bounceFrom: js.Any = js.native
    
    /** Picker column data */
    var col: PickerColumn = js.native
    
    /* protected */ def colChanged(): Unit = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MPickerColumnCmp(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MPickerColumnCmp(): js.Promise[Unit] = js.native
    
    /* private */ var decelerate: js.Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MPickerColumnCmp(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitColChange: js.Any = js.native
    
    /* private */ var gesture: js.Any = js.native
    
    /* private */ var indexForY: js.Any = js.native
    
    /**
      * Emitted when the selected value has changed
      * @internal
      */
    var ionPickerColChange: EventEmitter[PickerColumn] = js.native
    
    /* private */ var lastIndex: js.Any = js.native
    
    /* private */ var maxY: js.Any = js.native
    
    /* private */ var minY: js.Any = js.native
    
    /* private */ var noAnimate: js.Any = js.native
    
    /* private */ var onEnd: js.Any = js.native
    
    /* private */ var onMove: js.Any = js.native
    
    /* private */ var onStart: js.Any = js.native
    
    /* private */ var optHeight: js.Any = js.native
    
    /* private */ var optsEl: js.Any = js.native
    
    /* private */ var rafId: js.Any = js.native
    
    /* private */ var refresh: js.Any = js.native
    
    @JSName("render")
    def render_MPickerColumnCmp(): js.Any = js.native
    
    /* private */ var rotateFactor: js.Any = js.native
    
    /* private */ var scaleFactor: js.Any = js.native
    
    /* private */ var setSelected: js.Any = js.native
    
    /* private */ var tmrId: js.Any = js.native
    
    /* private */ var update: js.Any = js.native
    
    /* private */ var velocity: js.Any = js.native
    
    /* private */ var y: js.Any = js.native
  }
}
