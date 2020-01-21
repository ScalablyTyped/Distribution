package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProviderConstructor
import typings.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import typings.phosphorDisposable.mod.IDisposable
import typings.phosphorSignaling.mod.ISignal
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib/searchproviderregistry", JSImport.Namespace)
@js.native
object searchproviderregistryMod extends js.Object {
  @js.native
  class SearchProviderRegistry () extends ISearchProviderRegistry {
    var _changed: js.Any = js.native
    var _findMatchingProvider: js.Any = js.native
    var _providerMap: js.Any = js.native
    /**
      * Signal that emits when a new search provider has been registered
      * or removed.
      */
    /* CompleteClass */
    override var changed: ISignal[ISearchProviderRegistry, Unit] = js.native
    /**
      * Signal that emits when a new search provider has been registered
      * or removed.
      */
    @JSName("changed")
    val changed_SearchProviderRegistry: ISignal[this.type, Unit] = js.native
    /**
      * Returns a matching provider for the widget.
      *
      * @param widget - The widget to search over.
      * @returns the search provider, or undefined if none exists.
      */
    /* CompleteClass */
    override def getProviderForWidget(widget: js.Any): js.UndefOr[ISearchProvider[_]] = js.native
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
    override def register(key: String, provider: ISearchProviderConstructor[_]): IDisposable = js.native
  }
  
}

