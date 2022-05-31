package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/documentsearch", "CodeMirrorSearchProvider")
  @js.native
  class CodeMirrorSearchProvider ()
    extends typings.jupyterlabDocumentsearch.codemirrorsearchproviderMod.CodeMirrorSearchProvider
  /* static members */
  object CodeMirrorSearchProvider {
    
    @JSImport("@jupyterlab/documentsearch", "CodeMirrorSearchProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    inline def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canSearchOn")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean]
  }
  
  @JSImport("@jupyterlab/documentsearch", "ISearchProviderRegistry")
  @js.native
  val ISearchProviderRegistry: Token[typings.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry] = js.native
  
  @JSImport("@jupyterlab/documentsearch", "NotebookSearchProvider")
  @js.native
  class NotebookSearchProvider ()
    extends typings.jupyterlabDocumentsearch.notebooksearchproviderMod.NotebookSearchProvider
  /* static members */
  object NotebookSearchProvider {
    
    @JSImport("@jupyterlab/documentsearch", "NotebookSearchProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    inline def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canSearchOn")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean]
  }
  
  @JSImport("@jupyterlab/documentsearch", "SearchInstance")
  @js.native
  class SearchInstance protected ()
    extends typings.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
  }
  
  @JSImport("@jupyterlab/documentsearch", "SearchProviderRegistry")
  @js.native
  class SearchProviderRegistry ()
    extends typings.jupyterlabDocumentsearch.searchproviderregistryMod.SearchProviderRegistry
  
  @JSImport("@jupyterlab/documentsearch", "SearchState")
  @js.native
  class SearchState ()
    extends typings.jupyterlabDocumentsearch.codemirrorsearchproviderMod.SearchState
}
