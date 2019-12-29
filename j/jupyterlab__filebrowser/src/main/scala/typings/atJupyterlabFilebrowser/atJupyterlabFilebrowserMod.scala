package typings.atJupyterlabFilebrowser

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabApputils.libDialogMod.Dialog.IResult
import typings.atJupyterlabFilebrowser.libCrumbsMod.BreadCrumbs.IOptions
import typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialog.IDirectoryOptions
import typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialog.IFileOptions
import typings.atJupyterlabServices.libContentsMod.Contents.IModel
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser", JSImport.Namespace)
@js.native
object atJupyterlabFilebrowserMod extends js.Object {
  @js.native
  class BreadCrumbs protected ()
    extends typings.atJupyterlabFilebrowser.libCrumbsMod.BreadCrumbs {
    /**
      * Construct a new file browser crumb widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DirListing protected ()
    extends typings.atJupyterlabFilebrowser.libListingMod.DirListing {
    /**
      * Construct a new file browser directory listing widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: typings.atJupyterlabFilebrowser.libListingMod.DirListing.IOptions) = this()
  }
  
  @js.native
  class FileBrowser protected ()
    extends typings.atJupyterlabFilebrowser.libBrowserMod.FileBrowser {
    /**
      * Construct a new file browser.
      *
      * @param model - The file browser view model.
      */
    def this(options: typings.atJupyterlabFilebrowser.libBrowserMod.FileBrowser.IOptions) = this()
  }
  
  @js.native
  class FileBrowserModel protected ()
    extends typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions) = this()
  }
  
  @js.native
  class FileUploadStatus protected ()
    extends typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.IOptions) = this()
  }
  
  @js.native
  class FilterFileBrowserModel protected ()
    extends typings.atJupyterlabFilebrowser.libModelMod.FilterFileBrowserModel {
    def this(options: typings.atJupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  @js.native
  class Uploader protected ()
    extends typings.atJupyterlabFilebrowser.libUploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typings.atJupyterlabFilebrowser.libUploadMod.Uploader.IOptions) = this()
  }
  
  val CHUNK_SIZE: Double = js.native
  val LARGE_FILE_SIZE: Double = js.native
  @js.native
  object DirListing extends js.Object {
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer protected ()
      extends typings.atJupyterlabFilebrowser.libListingMod.DirListing.Renderer {
      def this(icoReg: IIconRegistry) = this()
    }
    
  }
  
  @js.native
  object FileDialog extends js.Object {
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
    def getExistingDirectory(options: IDirectoryOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
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
    def getOpenFiles(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
  }
  
  @js.native
  object FileUploadStatus extends js.Object {
    /**
      * The VDomModel for the FileUpload renderer.
      */
    @js.native
    class Model ()
      extends typings.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.Model {
      /**
        * Construct a new model.
        */
      def this(browserModel: FileBrowserModel) = this()
    }
    
  }
  
  @js.native
  object IFileBrowserFactory
    extends TopLevel[Token[typings.atJupyterlabFilebrowser.libTokensMod.IFileBrowserFactory]]
  
}

