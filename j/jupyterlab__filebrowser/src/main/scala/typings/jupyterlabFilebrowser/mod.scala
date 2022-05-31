package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabFilebrowser.crumbsMod.BreadCrumbs.IOptions
import typings.jupyterlabFilebrowser.opendialogMod.FileDialog.IDirectoryOptions
import typings.jupyterlabFilebrowser.opendialogMod.FileDialog.IFileOptions
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/filebrowser", "BreadCrumbs")
  @js.native
  class BreadCrumbs protected ()
    extends typings.jupyterlabFilebrowser.crumbsMod.BreadCrumbs {
    /**
      * Construct a new file browser crumb widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/filebrowser", "CHUNK_SIZE")
  @js.native
  val CHUNK_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser", "DirListing")
  @js.native
  class DirListing protected ()
    extends typings.jupyterlabFilebrowser.listingMod.DirListing {
    /**
      * Construct a new file browser directory listing widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: typings.jupyterlabFilebrowser.listingMod.DirListing.IOptions) = this()
  }
  object DirListing {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/filebrowser", "DirListing.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabFilebrowser.listingMod.DirListing.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/filebrowser", "DirListing.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabFilebrowser.listingMod.DirListing.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileBrowser")
  @js.native
  class FileBrowser protected ()
    extends typings.jupyterlabFilebrowser.browserMod.FileBrowser {
    /**
      * Construct a new file browser.
      *
      * @param model - The file browser view model.
      */
    def this(options: typings.jupyterlabFilebrowser.browserMod.FileBrowser.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileBrowserModel")
  @js.native
  class FileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.modelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typings.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions) = this()
  }
  
  object FileDialog {
    
    @JSImport("@jupyterlab/filebrowser", "FileDialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create and show a open directory dialog.
      *
      * Note: if nothing is selected when `getValue` will return the browser
      * model current path.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted.
      */
    inline def getExistingDirectory(options: IDirectoryOptions): js.Promise[IResult[js.Array[IModel]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExistingDirectory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[js.Array[IModel]]]]
    
    /**
      * Create and show a open files dialog.
      *
      * Note: if nothing is selected when `getValue` will return the browser
      * model current path.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted.
      */
    inline def getOpenFiles(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenFiles")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[js.Array[IModel]]]]
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileUploadStatus")
  @js.native
  class FileUploadStatus protected ()
    extends typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.IOptions) = this()
  }
  object FileUploadStatus {
    
    /**
      * The VDomModel for the FileUpload renderer.
      */
    @JSImport("@jupyterlab/filebrowser", "FileUploadStatus.Model")
    @js.native
    /**
      * Construct a new model.
      */
    class Model ()
      extends typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.Model {
      def this(browserModel: FileBrowserModel) = this()
    }
  }
  
  @JSImport("@jupyterlab/filebrowser", "FilterFileBrowserModel")
  @js.native
  class FilterFileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/filebrowser", "IFileBrowserFactory")
  @js.native
  val IFileBrowserFactory: Token[typings.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory] = js.native
  
  @JSImport("@jupyterlab/filebrowser", "LARGE_FILE_SIZE")
  @js.native
  val LARGE_FILE_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser", "Uploader")
  @js.native
  class Uploader protected ()
    extends typings.jupyterlabFilebrowser.uploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typings.jupyterlabFilebrowser.uploadMod.Uploader.IOptions) = this()
  }
}
