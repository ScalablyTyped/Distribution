package typings.libp2p

import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerVisibilityChangeEmitterMod {
  
  @JSImport("libp2p/dist/src/connection-manager/visibility-change-emitter", "VisibilityChangeEmitter")
  @js.native
  open class VisibilityChangeEmitter () extends EventEmitter[VisibilityChangeEmitterEvents] {
    
    /**
      * Adds an event listener on the document that listens to changes in document.visibilityChange
      * (or whatever name by which the visibilityChange variable is known in the browser)
      *
      * @private
      */
    def _addVisibilityChangeListener(): Unit = js.native
    
    /**
      * The function that is called when document.visibilityChange has changed
      * It emits an event called visibilityChange and sends the value of document.hidden as a
      * parameter
      *
      * @private
      */
    def _handleVisibilityChange(): Unit = js.native
    
    /**
      * document.hidden and document.visibilityChange are the two variables we need to check for;
      * Since these variables are named differently in different browsers, this function sets
      * the appropriate name based on the browser being used. Once executed, tha actual names of
      * document.hidden and document.visibilityChange are found in this._hidden and this._visibilityChange
      * respectively
      *
      * @private
      */
    def _initializeVisibilityVarNames(): Unit = js.native
    
    /* private */ var hidden: Any = js.native
    
    /**
      * The function returns ```true``` if the page is visible or ```false``` if the page is not visible and
      * ```undefined``` if the page visibility API is not supported by the browser.
      */
    def isVisible(): js.UndefOr[Boolean] = js.native
    
    /* private */ var visibilityChange: Any = js.native
  }
  
  trait VisibilityChangeEmitterEvents extends StObject {
    
    var visibilityChange: CustomEvent[Boolean]
  }
  object VisibilityChangeEmitterEvents {
    
    inline def apply(visibilityChange: CustomEvent[Boolean]): VisibilityChangeEmitterEvents = {
      val __obj = js.Dynamic.literal(visibilityChange = visibilityChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibilityChangeEmitterEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisibilityChangeEmitterEvents] (val x: Self) extends AnyVal {
      
      inline def setVisibilityChange(value: CustomEvent[Boolean]): Self = StObject.set(x, "visibilityChange", value.asInstanceOf[js.Any])
    }
  }
}
