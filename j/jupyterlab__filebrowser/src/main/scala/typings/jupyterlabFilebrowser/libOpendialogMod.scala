package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.anon.PartialICheckbox
import typings.jupyterlabApputils.libDialogMod.Dialog.Header
import typings.jupyterlabApputils.libDialogMod.Dialog.IRenderer
import typings.jupyterlabApputils.libDialogMod.Dialog.IResult
import typings.jupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.jupyterlabFilebrowser.anon.PartialIScore
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpendialogMod {
  
  object FileDialog {
    
    @JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog")
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
    
    /**
      * Options for the open directory dialog
      */
    /* Inlined parent std.Partial<std.Pick<@jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>> */
    trait IDirectoryOptions extends StObject {
      
      var checkbox: js.UndefOr[PartialICheckbox | Null] = js.undefined
      
      var focusNodeSelector: js.UndefOr[String] = js.undefined
      
      var hasClose: js.UndefOr[Boolean] = js.undefined
      
      var host: js.UndefOr[HTMLElement] = js.undefined
      
      /**
        * Document manager
        */
      var manager: IDocumentManager
      
      var renderer: js.UndefOr[IRenderer] = js.undefined
      
      var title: js.UndefOr[Header] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IDirectoryOptions {
      
      inline def apply(manager: IDocumentManager): IDirectoryOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IDirectoryOptions]
      }
      
      extension [Self <: IDirectoryOptions](x: Self) {
        
        inline def setCheckbox(value: PartialICheckbox): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
        
        inline def setCheckboxNull: Self = StObject.set(x, "checkbox", null)
        
        inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
        
        inline def setFocusNodeSelector(value: String): Self = StObject.set(x, "focusNodeSelector", value.asInstanceOf[js.Any])
        
        inline def setFocusNodeSelectorUndefined: Self = StObject.set(x, "focusNodeSelector", js.undefined)
        
        inline def setHasClose(value: Boolean): Self = StObject.set(x, "hasClose", value.asInstanceOf[js.Any])
        
        inline def setHasCloseUndefined: Self = StObject.set(x, "hasClose", js.undefined)
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setManager(value: IDocumentManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setTitle(value: Header): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
    
    /**
      * Options for the open file dialog
      */
    trait IFileOptions
      extends StObject
         with IDirectoryOptions {
      
      /**
        * Filter function on file browser item model
        */
      var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean | PartialIScore | Null]] = js.undefined
    }
    object IFileOptions {
      
      inline def apply(manager: IDocumentManager): IFileOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFileOptions]
      }
      
      extension [Self <: IFileOptions](x: Self) {
        
        inline def setFilter(value: /* value */ IModel => Boolean | PartialIScore | Null): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
  }
}
