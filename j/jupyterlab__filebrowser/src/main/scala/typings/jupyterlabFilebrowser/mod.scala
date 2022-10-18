package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.libDialogMod.Dialog.IResult
import typings.jupyterlabFilebrowser.libCrumbsMod.BreadCrumbs.IOptions
import typings.jupyterlabFilebrowser.libOpendialogMod.FileDialog.IDirectoryOptions
import typings.jupyterlabFilebrowser.libOpendialogMod.FileDialog.IFileOptions
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/filebrowser", "BreadCrumbs")
  @js.native
  open class BreadCrumbs protected ()
    extends typings.jupyterlabFilebrowser.libCrumbsMod.BreadCrumbs {
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
  open class DirListing protected ()
    extends typings.jupyterlabFilebrowser.libListingMod.DirListing {
    /**
      * Construct a new file browser directory listing widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: typings.jupyterlabFilebrowser.libListingMod.DirListing.IOptions) = this()
  }
  object DirListing {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/filebrowser", "DirListing.Renderer")
    @js.native
    open class Renderer ()
      extends typings.jupyterlabFilebrowser.libListingMod.DirListing.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/filebrowser", "DirListing.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabFilebrowser.libListingMod.DirListing.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileBrowser")
  @js.native
  open class FileBrowser protected ()
    extends typings.jupyterlabFilebrowser.libBrowserMod.FileBrowser {
    /**
      * Construct a new file browser.
      *
      * @param options - The file browser options.
      */
    def this(options: typings.jupyterlabFilebrowser.libBrowserMod.FileBrowser.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileBrowserModel")
  @js.native
  open class FileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.libModelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typings.jupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions) = this()
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
  open class FileUploadStatus protected ()
    extends typings.jupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typings.jupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.IOptions) = this()
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
    open class Model ()
      extends typings.jupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.Model {
      def this(browserModel: FileBrowserModel) = this()
    }
  }
  
  @JSImport("@jupyterlab/filebrowser", "FilterFileBrowserModel")
  @js.native
  open class FilterFileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/filebrowser", "IFileBrowserCommands")
  @js.native
  val IFileBrowserCommands: Token[Unit] = js.native
  
  @JSImport("@jupyterlab/filebrowser", "IFileBrowserFactory")
  @js.native
  val IFileBrowserFactory: Token[typings.jupyterlabFilebrowser.libTokensMod.IFileBrowserFactory] = js.native
  
  @JSImport("@jupyterlab/filebrowser", "LARGE_FILE_SIZE")
  @js.native
  val LARGE_FILE_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser", "TogglableHiddenFileBrowserModel")
  @js.native
  open class TogglableHiddenFileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/filebrowser", "Uploader")
  @js.native
  open class Uploader protected ()
    extends typings.jupyterlabFilebrowser.libUploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typings.jupyterlabFilebrowser.libUploadMod.Uploader.IOptions) = this()
  }
}
