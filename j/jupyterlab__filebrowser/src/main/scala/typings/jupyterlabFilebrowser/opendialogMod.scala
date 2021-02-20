package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opendialogMod {
  
  object FileDialog {
    
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
    @JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog.getExistingDirectory")
    @js.native
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
    @JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog.getOpenFiles")
    @js.native
    def getOpenFiles(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
    
    /**
      * Options for the open directory dialog
      */
    /* Inlined parent std.Partial<std.Pick<@jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>> */
    @js.native
    trait IDirectoryOptions extends StObject {
      
      var focusNodeSelector: js.UndefOr[String] = js.native
      
      var host: js.UndefOr[HTMLElement] = js.native
      
      /**
        * Document manager
        */
      var manager: IDocumentManager = js.native
      
      var renderer: js.UndefOr[IRenderer] = js.native
      
      var title: js.UndefOr[Header] = js.native
    }
    object IDirectoryOptions {
      
      @scala.inline
      def apply(manager: IDocumentManager): IDirectoryOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IDirectoryOptions]
      }
      
      @scala.inline
      implicit class IDirectoryOptionsMutableBuilder[Self <: IDirectoryOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFocusNodeSelector(value: String): Self = StObject.set(x, "focusNodeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusNodeSelectorUndefined: Self = StObject.set(x, "focusNodeSelector", js.undefined)
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        @scala.inline
        def setManager(value: IDocumentManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setTitle(value: Header): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /**
      * Options for the open file dialog
      */
    @js.native
    trait IFileOptions extends IDirectoryOptions {
      
      /**
        * Filter function on file browser item model
        */
      var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.native
    }
    object IFileOptions {
      
      @scala.inline
      def apply(manager: IDocumentManager): IFileOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFileOptions]
      }
      
      @scala.inline
      implicit class IFileOptionsMutableBuilder[Self <: IFileOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: /* value */ IModel => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
  }
}
