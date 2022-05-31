package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProviderConstructor
import typings.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchproviderregistryMod {
  
  @JSImport("@jupyterlab/documentsearch/lib/searchproviderregistry", "SearchProviderRegistry")
  @js.native
  class SearchProviderRegistry ()
    extends StObject
       with ISearchProviderRegistry {
    
    /* private */ var _changed: js.Any = js.native
    
    /* private */ var _findMatchingProvider: js.Any = js.native
    
    /* private */ var _providerMap: js.Any = js.native
    
    /**
      * Signal that emits when a new search provider has been registered
      * or removed.
      */
    /* CompleteClass */
    var changed: ISignal[ISearchProviderRegistry, Unit] = js.native
    /**
      * Signal that emits when a new search provider has been registered
      * or removed.
      */
    @JSName("changed")
    def changed_MSearchProviderRegistry: ISignal[this.type, Unit] = js.native
    
    /**
      * Returns a matching provider for the widget.
      *
      * @param widget - The widget to search over.
      * @returns the search provider, or undefined if none exists.
      */
    /* CompleteClass */
    override def getProviderForWidget(widget: js.Any): js.UndefOr[ISearchProvider[js.Any]] = js.native
    /**
      * Returns a matching provider for the widget.
      *
      * @param widget - The widget to search over.
      * @returns the search provider, or undefined if none exists.
      */
    def getProviderForWidget[T /* <: Widget */](widget: T): js.UndefOr[ISearchProvider[T]] = js.native
    
    /**
      * Add a provider to the registry.
      *
      * @param key - The provider key.
      * @returns A disposable delegate that, when disposed, deregisters the given search provider
      */
    /* CompleteClass */
    override def register(key: String, provider: ISearchProviderConstructor[js.Any]): IDisposable = js.native
  }
}
