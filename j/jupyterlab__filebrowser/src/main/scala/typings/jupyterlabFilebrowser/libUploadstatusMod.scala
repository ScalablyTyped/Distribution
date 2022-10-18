package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.IOptions
import typings.jupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.Model
import typings.jupyterlabFilebrowser.mod.FileBrowser
import typings.jupyterlabFilebrowser.mod.FileBrowserModel
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUploadstatusMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus")
  @js.native
  open class FileUploadStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: IOptions) = this()
    
    /* private */ var _onBrowserChange: Any = js.native
    
    /* private */ var _tracker: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /* private */ val translator: Any = js.native
  }
  object FileUploadStatus {
    
    /**
      * The VDomModel for the FileUpload renderer.
      */
    @JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus.Model")
    @js.native
    /**
      * Construct a new model.
      */
    open class Model () extends VDomModel {
      def this(browserModel: FileBrowserModel) = this()
      
      /* private */ var _browserModel: Any = js.native
      
      /* private */ var _items: Any = js.native
      
      /**
        * Handle an uploadChanged event in the filebrowser model.
        */
      /* private */ var _uploadChanged: Any = js.native
      
      /**
        * The current file browser model.
        */
      def browserModel: FileBrowserModel | Null = js.native
      def browserModel_=(browserModel: FileBrowserModel | Null): Unit = js.native
      
      /**
        * The currently uploading items.
        */
      def items: js.Array[IFileUploadItem] = js.native
    }
    
    /**
      * Options for creating the upload status item.
      */
    trait IOptions extends StObject {
      
      /**
        * The application file browser tracker.
        */
      val tracker: WidgetTracker[FileBrowser]
      
      /**
        * The translation language bundle.
        */
      val translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(tracker: WidgetTracker[FileBrowser]): IOptions = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTracker(value: WidgetTracker[FileBrowser]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  /**
    * The interface for an item that is being uploaded to
    * the file system.
    */
  trait IFileUploadItem extends StObject {
    
    /**
      * Whether the upload is complete.
      */
    var complete: Boolean
    
    /**
      * The path on the filesystem that is being uploaded to.
      */
    var path: String
    
    /**
      * The upload progress fraction.
      */
    var progress: Double
  }
  object IFileUploadItem {
    
    inline def apply(complete: Boolean, path: String, progress: Double): IFileUploadItem = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileUploadItem]
    }
    
    extension [Self <: IFileUploadItem](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
