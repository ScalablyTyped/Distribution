package typings.jupyterlabFilebrowser

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabFilebrowser.libBrowserMod.FileBrowser
import typings.jupyterlabFilebrowser.libTokensMod.IFileBrowserFactory.IOptions
import typings.jupyterlabStatedb.libTokensMod.IStateDB
import typings.luminoCoreutils.mod.Token
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/tokens", "IFileBrowserCommands")
  @js.native
  val IFileBrowserCommands: Token[Unit] = js.native
  
  @js.native
  trait IFileBrowserFactory extends StObject {
    
    /**
      * Create a new file browser instance.
      *
      * @param id - The widget/DOM id of the file browser.
      *
      * @param options - The optional file browser configuration object.
      *
      * #### Notes
      * The ID parameter is used to set the widget ID. It is also used as part of
      * the unique key necessary to store the file browser's restoration data in
      * the state database if that functionality is enabled.
      *
      * If, after the file browser has been generated by the factory, the ID of the
      * resulting widget is changed by client code, the restoration functionality
      * will not be disrupted as long as there are no ID collisions, i.e., as long
      * as the initial ID passed into the factory is used for only one file browser
      * instance.
      */
    def createFileBrowser(id: String): FileBrowser = js.native
    def createFileBrowser(id: String, options: IOptions): FileBrowser = js.native
    
    /**
      * The default file browser for the application.
      */
    var defaultBrowser: FileBrowser = js.native
    
    /**
      * The widget tracker used by the factory to track file browsers.
      */
    val tracker: WidgetTracker[FileBrowser] = js.native
  }
  object IFileBrowserFactory extends Shortcut {
    
    @JSImport("@jupyterlab/filebrowser/lib/tokens", "IFileBrowserFactory")
    @js.native
    val ^ : Token[IFileBrowserFactory] = js.native
    
    /**
      * The options for creating a file browser using a file browser factory.
      *
      * #### Notes
      * In future versions of JupyterLab, some of these options may disappear,
      * which is a backward-incompatible API change and will necessitate a new
      * version release. This is because in future versions, there will likely be
      * an application-wide notion of a singleton command registry and a singleton
      * state database.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether a file browser automatically loads its initial path.
        *
        * #### Notes
        * The default is `true`.
        */
      var auto: js.UndefOr[Boolean] = js.undefined
      
      /**
        * An optional `Contents.IDrive` name for the model.
        * If given, the model will prepend `driveName:` to
        * all paths used in file operations.
        */
      var driveName: js.UndefOr[String] = js.undefined
      
      /**
        * The time interval for browser refreshing, in ms.
        */
      var refreshInterval: js.UndefOr[Double] = js.undefined
      
      /**
        * Whether a file browser automatically restores state when instantiated.
        * The default is `true`.
        *
        * #### Notes
        * The file browser model will need to be restored before for the file
        * browser to start saving its state.
        */
      var restore: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The state database to use for saving file browser state and restoring it.
        *
        * #### Notes
        * Unless the value `null` is set for this option, the application state
        * database will be automatically passed in and used for state restoration.
        */
      var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue] | Null] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
        
        inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
        
        inline def setDriveName(value: String): Self = StObject.set(x, "driveName", value.asInstanceOf[js.Any])
        
        inline def setDriveNameUndefined: Self = StObject.set(x, "driveName", js.undefined)
        
        inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
        
        inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
        
        inline def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
        
        inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
        
        inline def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateNull: Self = StObject.set(x, "state", null)
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    type _To = Token[IFileBrowserFactory]
    
    /* This means you don't have to write `^`, but can instead just say `IFileBrowserFactory.foo` */
    override def _to: Token[IFileBrowserFactory] = ^
  }
}
