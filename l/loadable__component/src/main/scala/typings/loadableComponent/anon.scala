package typings.loadableComponent

import typings.loadableComponent.mod.LoadableLibrary
import typings.loadableComponent.mod.OptionsWithoutResolver
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[Module] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* module */ Module, ReactNode]] = js.undefined
    
    var fallback: js.UndefOr[Element] = js.undefined
    
    var ref: js.UndefOr[Ref[Module]] = js.undefined
  }
  object Children {
    
    inline def apply[Module](): Children[Module] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[Module]]
    }
    
    extension [Self <: Children[?], Module](x: Self & Children[Module]) {
      
      inline def setChildren(value: /* module */ Module => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setRef(value: Ref[Module]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Module | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Fallback extends StObject {
    
    var fallback: js.UndefOr[Element] = js.undefined
  }
  object Fallback {
    
    inline def apply(): Fallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fallback]
    }
    
    extension [Self <: Fallback](x: Self) {
      
      inline def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[Props, Module](loadFn: js.Function1[/* props */ Props, js.Promise[Module]]): LoadableLibrary[Module] = js.native
    def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithoutResolver[Props]
    ): LoadableLibrary[Module] = js.native
  }
}
