package typings.interactjsTypes.dropPluginMod

import typings.interactjsTypes.anon.DraggableElementElement
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.interactjsTypesStrings.center
import typings.interactjsTypes.interactjsTypesStrings.pointer
import typings.interactjsTypes.optionsMod.PerActionDefaults
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.Listener
import typings.interactjsTypes.typesMod.ListenerMap
import typings.interactjsTypes.typesMod.ListenersArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropzoneOptions
  extends StObject
     with PerActionDefaults {
  
  var accept: js.UndefOr[
    String | Element | (js.Function1[/* hasDropzoneDraggableElement */ DraggableElementElement, Boolean])
  ] = js.undefined
  
  var checker: js.UndefOr[DropFunctionChecker] = js.undefined
  
  var ondragenter: js.UndefOr[ListenersArg] = js.undefined
  
  var ondragleave: js.UndefOr[ListenersArg] = js.undefined
  
  var ondrop: js.UndefOr[ListenersArg] = js.undefined
  
  var ondropactivate: js.UndefOr[ListenersArg] = js.undefined
  
  var ondropdeactivate: js.UndefOr[ListenersArg] = js.undefined
  
  var ondropmove: js.UndefOr[ListenersArg] = js.undefined
  
  var overlap: js.UndefOr[pointer | center | Double] = js.undefined
}
object DropzoneOptions {
  
  inline def apply(): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneOptions]
  }
  
  extension [Self <: DropzoneOptions](x: Self) {
    
    inline def setAccept(
      value: String | Element | (js.Function1[/* hasDropzoneDraggableElement */ DraggableElementElement, Boolean])
    ): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptFunction1(value: /* hasDropzoneDraggableElement */ DraggableElementElement => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setChecker(
      value: (/* dragEvent */ Any, /* event */ Any, /* dropped */ Boolean, /* dropzone */ InteractableActions, /* dropElement */ Element, /* draggable */ InteractableActions, /* draggableElement */ Element) => Boolean
    ): Self = StObject.set(x, "checker", js.Any.fromFunction7(value))
    
    inline def setCheckerUndefined: Self = StObject.set(x, "checker", js.undefined)
    
    inline def setOndragenter(value: ListenersArg): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
    
    inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
    
    inline def setOndragenterVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "ondragenter", js.Array(value*))
    
    inline def setOndragleave(value: ListenersArg): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
    
    inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
    
    inline def setOndragleaveVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "ondragleave", js.Array(value*))
    
    inline def setOndrop(value: ListenersArg): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
    
    inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
    
    inline def setOndropVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "ondrop", js.Array(value*))
    
    inline def setOndropactivate(value: ListenersArg): Self = StObject.set(x, "ondropactivate", value.asInstanceOf[js.Any])
    
    inline def setOndropactivateUndefined: Self = StObject.set(x, "ondropactivate", js.undefined)
    
    inline def setOndropactivateVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "ondropactivate", js.Array(value*))
    
    inline def setOndropdeactivate(value: ListenersArg): Self = StObject.set(x, "ondropdeactivate", value.asInstanceOf[js.Any])
    
    inline def setOndropdeactivateUndefined: Self = StObject.set(x, "ondropdeactivate", js.undefined)
    
    inline def setOndropdeactivateVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "ondropdeactivate", js.Array(value*))
    
    inline def setOndropmove(value: ListenersArg): Self = StObject.set(x, "ondropmove", value.asInstanceOf[js.Any])
    
    inline def setOndropmoveUndefined: Self = StObject.set(x, "ondropmove", js.undefined)
    
    inline def setOndropmoveVarargs(value: (Listener | ListenerMap)*): Self = StObject.set(x, "ondropmove", js.Array(value*))
    
    inline def setOverlap(value: pointer | center | Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
  }
}
