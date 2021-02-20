package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabFilebrowser.mod.FileBrowser
import typings.jupyterlabFilebrowser.mod.FileBrowserModel
import typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.IOptions
import typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadstatusMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus")
  @js.native
  class FileUploadStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: IOptions) = this()
    
    var _onBrowserChange: js.Any = js.native
    
    var _tracker: js.Any = js.native
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
    class Model () extends VDomModel {
      def this(browserModel: FileBrowserModel) = this()
      
      var _browserModel: js.Any = js.native
      
      var _items: js.Any = js.native
      
      /**
        * Handle an uploadChanged event in the filebrowser model.
        */
      var _uploadChanged: js.Any = js.native
      
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The application file browser tracker.
        */
      val tracker: WidgetTracker[FileBrowser] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(tracker: WidgetTracker[FileBrowser]): IOptions = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTracker(value: WidgetTracker[FileBrowser]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * The interface for an item that is being uploaded to
    * the file system.
    */
  @js.native
  trait IFileUploadItem extends StObject {
    
    /**
      * Whether the upload is complete.
      */
    var complete: Boolean = js.native
    
    /**
      * The path on the filesystem that is being uploaded to.
      */
    var path: String = js.native
    
    /**
      * The upload progress fraction.
      */
    var progress: Double = js.native
  }
  object IFileUploadItem {
    
    @scala.inline
    def apply(complete: Boolean, path: String, progress: Double): IFileUploadItem = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileUploadItem]
    }
    
    @scala.inline
    implicit class IFileUploadItemMutableBuilder[Self <: IFileUploadItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
