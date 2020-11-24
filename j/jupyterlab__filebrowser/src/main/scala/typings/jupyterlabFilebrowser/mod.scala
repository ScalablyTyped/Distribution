package typings.jupyterlabFilebrowser

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabFilebrowser.crumbsMod.BreadCrumbs.IOptions
import typings.jupyterlabFilebrowser.opendialogMod.FileDialog.IDirectoryOptions
import typings.jupyterlabFilebrowser.opendialogMod.FileDialog.IFileOptions
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val CHUNK_SIZE: Double = js.native
  
  val LARGE_FILE_SIZE: Double = js.native
  
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
  @js.native
  object DirListing extends js.Object {
    
    /**
      * The default `IRenderer` instance.
      */
    val defaultRenderer: typings.jupyterlabFilebrowser.listingMod.DirListing.Renderer = js.native
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabFilebrowser.listingMod.DirListing.Renderer
  }
  
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
  
  @js.native
  class FileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.modelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typings.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions) = this()
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
  class FileUploadStatus protected ()
    extends typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.IOptions) = this()
  }
  @js.native
  object FileUploadStatus extends js.Object {
    
    /**
      * The VDomModel for the FileUpload renderer.
      */
    @js.native
    /**
      * Construct a new model.
      */
    class Model ()
      extends typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.Model {
      def this(browserModel: FileBrowserModel) = this()
    }
  }
  
  @js.native
  class FilterFileBrowserModel protected ()
    extends typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  @js.native
  object IFileBrowserFactory
    extends TopLevel[Token[typings.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory]]
  
  @js.native
  class Uploader protected ()
    extends typings.jupyterlabFilebrowser.uploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typings.jupyterlabFilebrowser.uploadMod.Uploader.IOptions) = this()
  }
}
