package typings.jotai

import typings.jotai.anon.Children
import typings.jotai.anon.Devgetatomstate
import typings.jotai.anon.Devgetmounted
import typings.jotai.anon.Value
import typings.react.mod.FunctionComponentElement
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactProviderMod {
  
  @JSImport("jotai/react/Provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Provider(param0: Children): FunctionComponentElement[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[Value]]
  
  inline def useStore(): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[Store]
  inline def useStore(options: Options): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(options.asInstanceOf[js.Any]).asInstanceOf[Store]
  
  trait Options extends StObject {
    
    var store: js.UndefOr[Store] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  type Store = ReturnType[js.Function0[Devgetatomstate | Devgetmounted]]
}
