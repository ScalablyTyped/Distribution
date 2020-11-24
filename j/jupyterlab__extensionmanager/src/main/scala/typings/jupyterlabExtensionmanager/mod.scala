package typings.jupyterlabExtensionmanager

import typings.jupyterlabExtensionmanager.modelMod.IEntry
import typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/extensionmanager", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isJupyterOrg(name: String): Boolean = js.native
  
  @js.native
  class CollapsibleSection protected ()
    extends typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection {
    def this(props: IProperties) = this()
  }
  
  @js.native
  class ExtensionView protected ()
    extends typings.jupyterlabExtensionmanager.widgetMod.ExtensionView {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
  }
  
  @js.native
  class ListModel protected ()
    extends typings.jupyterlabExtensionmanager.modelMod.ListModel {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
  }
  @js.native
  object ListModel extends js.Object {
    
    /**
      * Utility function to check whether an entry can be updated.
      *
      * @param entry The entry to check.
      */
    def entryHasUpdate(entry: IEntry): Boolean = js.native
    
    def isDisclaimed(): Boolean = js.native
    
    def toogleDisclaimed(): Unit = js.native
  }
  
  @js.native
  object ListView extends js.Object {
    
    def apply(props: typings.jupyterlabExtensionmanager.widgetMod.ListView.IProperties): ReactElement = js.native
  }
  
  @js.native
  /**
    * Create a Lister object.
    */
  class Lister ()
    extends typings.jupyterlabExtensionmanager.listingsMod.Lister
  
  @js.native
  class SearchBar protected ()
    extends typings.jupyterlabExtensionmanager.widgetMod.SearchBar {
    def this(props: typings.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties) = this()
  }
  
  @js.native
  /**
    * Create a Searcher object.
    *
    * @param repoUri The URI of the NPM registry to use.
    * @param cdnUri The URI of the CDN to use for fetching full package data.
    */
  class Searcher ()
    extends typings.jupyterlabExtensionmanager.npmMod.Searcher {
    def this(repoUri: String) = this()
    def this(repoUri: js.UndefOr[scala.Nothing], cdnUri: String) = this()
    def this(repoUri: String, cdnUri: String) = this()
  }
}
