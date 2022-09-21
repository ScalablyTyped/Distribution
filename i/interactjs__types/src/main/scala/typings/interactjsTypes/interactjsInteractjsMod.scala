package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.Install
import typings.interactjsTypes.anon.Listeners
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactjsInteractjsMod extends Shortcut {
  
  @JSImport("@interactjs/interactjs/index", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any = js.native
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any
  
  /* This means you don't have to write `default`, but can instead just say `interactjsInteractjsMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any = default
  
  trait internalPluginTypes extends StObject {
    
    var actions: Install
    
    var autoScroll: Plugin
    
    var autoStart: Install
    
    var devTools: Plugin
    
    var inertia: Plugin
    
    var interact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any
    
    var interactablePreventDefault: Listeners
    
    var modifiers: Plugin
    
    var offset: Plugin
    
    var pointerEvents: Plugin
    
    var reflow: Plugin
  }
  object internalPluginTypes {
    
    inline def apply(
      actions: Install,
      autoScroll: Plugin,
      autoStart: Install,
      devTools: Plugin,
      inertia: Plugin,
      interact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any,
      interactablePreventDefault: Listeners,
      modifiers: Plugin,
      offset: Plugin,
      pointerEvents: Plugin,
      reflow: Plugin
    ): internalPluginTypes = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], autoScroll = autoScroll.asInstanceOf[js.Any], autoStart = autoStart.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], inertia = inertia.asInstanceOf[js.Any], interact = interact.asInstanceOf[js.Any], interactablePreventDefault = interactablePreventDefault.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], reflow = reflow.asInstanceOf[js.Any])
      __obj.asInstanceOf[internalPluginTypes]
    }
    
    extension [Self <: internalPluginTypes](x: Self) {
      
      inline def setActions(value: Install): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setAutoScroll(value: Plugin): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
      
      inline def setAutoStart(value: Install): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setDevTools(value: Plugin): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
      
      inline def setInertia(value: Plugin): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
      
      inline def setInteract(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any
      ): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
      
      inline def setInteractablePreventDefault(value: Listeners): Self = StObject.set(x, "interactablePreventDefault", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: Plugin): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Plugin): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPointerEvents(value: Plugin): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setReflow(value: Plugin): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
    }
  }
}
