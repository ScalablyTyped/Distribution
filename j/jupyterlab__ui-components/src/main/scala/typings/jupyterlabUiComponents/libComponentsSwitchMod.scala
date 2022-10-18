package typings.jupyterlabUiComponents

import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.value
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSwitchMod {
  
  @JSImport("@jupyterlab/ui-components/lib/components/switch", "Switch")
  @js.native
  open class Switch () extends Widget {
    
    /* private */ var _button: Any = js.native
    
    /* private */ var _label: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /* private */ var _valueChanged: Any = js.native
    
    /**
      * The caption (title) of the switch.
      */
    def caption: String = js.native
    def caption_=(x: String): Unit = js.native
    
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The visible label of the switch.
      */
    def label: String = js.native
    def label_=(x: String): Unit = js.native
    
    /* protected */ def onAfterAttach(): Unit = js.native
    
    /* protected */ def onBeforeDetach(): Unit = js.native
    
    /**
      * The value of the switch.
      */
    def value: Boolean = js.native
    
    /**
      * A signal emitted when the value changes.
      */
    def valueChanged: ISignal[this.type, IChangedArgs[Boolean, Boolean, value]] = js.native
    
    def value_=(newValue: Boolean): Unit = js.native
  }
}
