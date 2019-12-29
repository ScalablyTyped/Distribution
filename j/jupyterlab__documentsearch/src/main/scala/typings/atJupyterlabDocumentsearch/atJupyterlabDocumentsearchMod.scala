package typings.atJupyterlabDocumentsearch

import typings.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProvider
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch", JSImport.Namespace)
@js.native
object atJupyterlabDocumentsearchMod extends js.Object {
  @js.native
  class CodeMirrorSearchProvider ()
    extends typings.atJupyterlabDocumentsearch.libProvidersCodemirrorsearchproviderMod.CodeMirrorSearchProvider
  
  @js.native
  class NotebookSearchProvider ()
    extends typings.atJupyterlabDocumentsearch.libProvidersNotebooksearchproviderMod.NotebookSearchProvider
  
  @js.native
  class SearchInstance protected ()
    extends typings.atJupyterlabDocumentsearch.libSearchinstanceMod.SearchInstance {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
  }
  
  @js.native
  class SearchProviderRegistry ()
    extends typings.atJupyterlabDocumentsearch.libSearchproviderregistryMod.SearchProviderRegistry
  
  @js.native
  class SearchState ()
    extends typings.atJupyterlabDocumentsearch.libProvidersCodemirrorsearchproviderMod.SearchState
  
  val ISearchProviderRegistry: Token[typings.atJupyterlabDocumentsearch.libTokensMod.ISearchProviderRegistry] = js.native
  /* static members */
  @js.native
  object CodeMirrorSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
  }
  
}

