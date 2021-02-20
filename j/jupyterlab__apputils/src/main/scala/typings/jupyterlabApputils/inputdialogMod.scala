package typings.jupyterlabApputils

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputdialogMod {
  
  object InputDialog {
    
    /**
      * Create and show a input dialog for a boolean.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getBoolean")
    @js.native
    def getBoolean(options: IBooleanOptions): js.Promise[IResult[Boolean]] = js.native
    
    /**
      * Create and show a input dialog for a choice.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getItem")
    @js.native
    def getItem(options: IItemOptions): js.Promise[IResult[String]] = js.native
    
    /**
      * Create and show a input dialog for a number.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getNumber")
    @js.native
    def getNumber(options: INumberOptions): js.Promise[IResult[Double]] = js.native
    
    /**
      * Create and show a input dialog for a password.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getPassword")
    @js.native
    def getPassword(options: ITextOptions): js.Promise[IResult[String]] = js.native
    
    /**
      * Create and show a input dialog for a text.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    @JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getText")
    @js.native
    def getText(options: ITextOptions): js.Promise[IResult[String]] = js.native
    
    /**
      * Constructor options for boolean input dialogs
      */
    @js.native
    trait IBooleanOptions extends IOptions {
      
      /**
        * Default value
        */
      var value: js.UndefOr[Boolean] = js.native
    }
    object IBooleanOptions {
      
      @scala.inline
      def apply(title: Header): IBooleanOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBooleanOptions]
      }
      
      @scala.inline
      implicit class IBooleanOptionsMutableBuilder[Self <: IBooleanOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /**
      * Constructor options for item selection input dialogs
      */
    @js.native
    trait IItemOptions extends IOptions {
      
      /**
        * Default choice
        *
        * If the list is editable a string with a default value can be provided
        * otherwise the index of the default choice should be given.
        */
      var current: js.UndefOr[Double | String] = js.native
      
      /**
        * Is the item editable?
        */
      var editable: js.UndefOr[Boolean] = js.native
      
      /**
        * List of choices
        */
      var items: js.Array[String] = js.native
      
      /**
        * Placeholder text for editable input
        */
      var placeholder: js.UndefOr[String] = js.native
    }
    object IItemOptions {
      
      @scala.inline
      def apply(items: js.Array[String], title: Header): IItemOptions = {
        val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      @scala.inline
      implicit class IItemOptionsMutableBuilder[Self <: IItemOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrent(value: Double | String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        @scala.inline
        def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      }
    }
    
    /**
      * Constructor options for number input dialogs
      */
    @js.native
    trait INumberOptions extends IOptions {
      
      /**
        * Default value
        */
      var value: js.UndefOr[Double] = js.native
    }
    object INumberOptions {
      
      @scala.inline
      def apply(title: Header): INumberOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[INumberOptions]
      }
      
      @scala.inline
      implicit class INumberOptionsMutableBuilder[Self <: INumberOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /**
      * Common constructor options for input dialogs
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Label for cancel button.
        */
      var cancelLabel: js.UndefOr[String] = js.native
      
      /**
        * The host element for the dialog. Defaults to `document.body`.
        */
      var host: js.UndefOr[HTMLElement] = js.native
      
      /**
        * Label of the requested input
        */
      var label: js.UndefOr[String] = js.native
      
      /**
        * Label for ok button.
        */
      var okLabel: js.UndefOr[String] = js.native
      
      /**
        * An optional renderer for dialog items.  Defaults to a shared
        * default renderer.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
      
      /**
        * The top level text for the dialog.  Defaults to an empty string.
        */
      var title: Header = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(title: Header): IOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setOkLabel(value: String): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setTitle(value: Header): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Constructor options for text input dialogs
      */
    @js.native
    trait ITextOptions extends IOptions {
      
      /**
        * Placeholder text
        */
      var placeholder: js.UndefOr[String] = js.native
      
      /**
        * Default input text
        */
      var text: js.UndefOr[String] = js.native
    }
    object ITextOptions {
      
      @scala.inline
      def apply(title: Header): ITextOptions = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITextOptions]
      }
      
      @scala.inline
      implicit class ITextOptionsMutableBuilder[Self <: ITextOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
  }
}
