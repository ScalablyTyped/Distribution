package typings.jupyterlabApputils

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputdialogMod {
  
  object InputDialog {
    
    @JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create and show a input dialog for a boolean.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getBoolean(options: IBooleanOptions): js.Promise[IResult[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoolean")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[Boolean]]]
    
    /**
      * Create and show a input dialog for a choice.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getItem(options: IItemOptions): js.Promise[IResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[String]]]
    
    /**
      * Create and show a input dialog for a number.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getNumber(options: INumberOptions): js.Promise[IResult[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[Double]]]
    
    /**
      * Create and show a input dialog for a password.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getPassword(options: ITextOptions): js.Promise[IResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[String]]]
    
    /**
      * Create and show a input dialog for a text.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getText(options: ITextOptions): js.Promise[IResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[String]]]
    
    /**
      * Constructor options for boolean input dialogs
      */
    trait IBooleanOptions
      extends StObject
         with IOptions {
      
      /**
        * Default value
        */
      var value: js.UndefOr[Boolean] = js.undefined
    }
    object IBooleanOptions {
      
      inline def apply(title: Header): IBooleanOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBooleanOptions]
      }
      
      extension [Self <: IBooleanOptions](x: Self) {
        
        inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /**
      * Constructor options for item selection input dialogs
      */
    trait IItemOptions
      extends StObject
         with IOptions {
      
      /**
        * Default choice
        *
        * If the list is editable a string with a default value can be provided
        * otherwise the index of the default choice should be given.
        */
      var current: js.UndefOr[Double | String] = js.undefined
      
      /**
        * Is the item editable?
        */
      var editable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * List of choices
        */
      var items: js.Array[String]
      
      /**
        * Placeholder text for editable input
        */
      var placeholder: js.UndefOr[String] = js.undefined
    }
    object IItemOptions {
      
      inline def apply(items: js.Array[String], title: Header): IItemOptions = {
        val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      extension [Self <: IItemOptions](x: Self) {
        
        inline def setCurrent(value: Double | String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
        inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
        
        inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      }
    }
    
    /**
      * Constructor options for number input dialogs
      */
    trait INumberOptions
      extends StObject
         with IOptions {
      
      /**
        * Default value
        */
      var value: js.UndefOr[Double] = js.undefined
    }
    object INumberOptions {
      
      inline def apply(title: Header): INumberOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[INumberOptions]
      }
      
      extension [Self <: INumberOptions](x: Self) {
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /**
      * Common constructor options for input dialogs
      */
    trait IOptions extends StObject {
      
      /**
        * Label for cancel button.
        */
      var cancelLabel: js.UndefOr[String] = js.undefined
      
      /**
        * The host element for the dialog. Defaults to `document.body`.
        */
      var host: js.UndefOr[HTMLElement] = js.undefined
      
      /**
        * Label of the requested input
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * Label for ok button.
        */
      var okLabel: js.UndefOr[String] = js.undefined
      
      /**
        * An optional renderer for dialog items.  Defaults to a shared
        * default renderer.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
      
      /**
        * The top level text for the dialog.  Defaults to an empty string.
        */
      var title: Header
    }
    object IOptions {
      
      inline def apply(title: Header): IOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
        
        inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setOkLabel(value: String): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
        
        inline def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setTitle(value: Header): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Constructor options for text input dialogs
      */
    trait ITextOptions
      extends StObject
         with IOptions {
      
      /**
        * Placeholder text
        */
      var placeholder: js.UndefOr[String] = js.undefined
      
      /**
        * Default input text
        */
      var text: js.UndefOr[String] = js.undefined
    }
    object ITextOptions {
      
      inline def apply(title: Header): ITextOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITextOptions]
      }
      
      extension [Self <: ITextOptions](x: Self) {
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
  }
}
