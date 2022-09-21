package typings.jupyterlabSettingregistry

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IContextMenuItem
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IMenu
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin.Transform
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Composite extends StObject {
    
    var composite: js.UndefOr[PartialJSONValue] = js.undefined
    
    var user: js.UndefOr[PartialJSONValue] = js.undefined
  }
  object Composite {
    
    inline def apply(): Composite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Composite]
    }
    
    extension [Self <: Composite](x: Self) {
      
      inline def setComposite(value: PartialJSONValue): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeNull: Self = StObject.set(x, "composite", null)
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setUser(value: PartialJSONValue): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: js.Array[IContextMenuItem]
    
    var main: js.Array[IMenu]
  }
  object Context {
    
    inline def apply(context: js.Array[IContextMenuItem], main: js.Array[IMenu]): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: js.Array[IContextMenuItem]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextVarargs(value: IContextMenuItem*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setMain(value: js.Array[IMenu]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainVarargs(value: IMenu*): Self = StObject.set(x, "main", js.Array(value*))
    }
  }
  
  trait User extends StObject {
    
    var composite: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
    
    var user: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
  }
  object User {
    
    inline def apply(): User = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setComposite(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeNull: Self = StObject.set(x, "composite", null)
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setUser(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined {[ phase in @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Transform} */
  trait phaseinPhaseTransform extends StObject {
    
    var compose: js.UndefOr[Transform] = js.undefined
    
    var fetch: js.UndefOr[Transform] = js.undefined
  }
  object phaseinPhaseTransform {
    
    inline def apply(): phaseinPhaseTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[phaseinPhaseTransform]
    }
    
    extension [Self <: phaseinPhaseTransform](x: Self) {
      
      inline def setCompose(value: /* plugin */ IPlugin => IPlugin): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      inline def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
      
      inline def setFetch(value: /* plugin */ IPlugin => IPlugin): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    }
  }
}
