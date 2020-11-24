package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    @JSName("changed")
    def changed_MSearchProviderRegistry: ISignal[this.type, Unit] = js.native
    
    /**
      * Returns a matching provider for the widget.
      *
      * @param widget - The widget to search over.
      * @returns the search provider, or undefined if none exists.
      */
    def getProviderForWidget[T /* <: Widget */](widget: T): js.UndefOr[ISearchProvider[T]] = js.native
  }
}
