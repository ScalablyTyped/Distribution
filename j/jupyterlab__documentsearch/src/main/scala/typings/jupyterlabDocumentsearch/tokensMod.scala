package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProviderConstructor
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  trait ISearchProviderRegistry extends StObject {
    
    /**
      * Signal that emits when a new search provider has been registered
      * or removed.
      */
    var changed: ISignal[ISearchProviderRegistry, Unit]
    
    /**
      * Returns a matching provider for the widget.
      *
      * @param widget - The widget to search over.
      * @returns the search provider, or undefined if none exists.
      */
    def getProviderForWidget(widget: js.Any): js.UndefOr[ISearchProvider[js.Any]]
    
    /**
      * Add a provider to the registry.
      *
      * @param key - The provider key.
      * @returns A disposable delegate that, when disposed, deregisters the given search provider
      */
    def register(key: String, provider: ISearchProviderConstructor[js.Any]): IDisposable
  }
  object ISearchProviderRegistry {
    
    @JSImport("@jupyterlab/documentsearch/lib/tokens", "ISearchProviderRegistry")
    @js.native
    val ^ : Token[ISearchProviderRegistry] = js.native
    
    extension [Self <: ISearchProviderRegistry](x: Self) {
      
      inline def setChanged(value: ISignal[ISearchProviderRegistry, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setGetProviderForWidget(value: js.Any => js.UndefOr[ISearchProvider[js.Any]]): Self = StObject.set(x, "getProviderForWidget", js.Any.fromFunction1(value))
      
      inline def setRegister(value: (String, ISearchProviderConstructor[js.Any]) => IDisposable): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
}
