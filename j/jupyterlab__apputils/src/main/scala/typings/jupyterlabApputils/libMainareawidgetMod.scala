package typings.jupyterlabApputils

import typings.jupyterlabApputils.libMainareawidgetMod.MainAreaWidget.IOptions
import typings.jupyterlabApputils.libPrintingMod.Printing.IPrintable
import typings.jupyterlabApputils.libToolbarMod.Toolbar
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.BoxPanel
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMainareawidgetMod {
  
  @JSImport("@jupyterlab/apputils/lib/mainareawidget", "MainAreaWidget")
  @js.native
  open class MainAreaWidget[T /* <: Widget */] protected ()
    extends Widget
       with IPrintable {
    /**
      * Construct a new main area widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IOptions[T]) = this()
    
    /* private */ var _changeGuard: Any = js.native
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _contentHeader: Any = js.native
    
    /* private */ var _disposeSpinner: Any = js.native
    
    /* private */ var _evtMouseDown: Any = js.native
    
    /**
      * Give focus to the content.
      */
    /* private */ var _focusContent: Any = js.native
    
    /* private */ var _isRevealed: Any = js.native
    
    /* private */ var _revealed: Any = js.native
    
    /* private */ var _spinner: Any = js.native
    
    /* private */ var _toolbar: Any = js.native
    
    /**
      * Update the content title based on attributes of the main widget.
      */
    /* private */ var _updateContentTitle: Any = js.native
    
    /**
      * Update the title based on the attributes of the child widget.
      */
    /* private */ var _updateTitle: Any = js.native
    
    /**
      * The content hosted by the widget.
      */
    def content: T = js.native
    
    /**
      * A panel for widgets that sit between the toolbar and the content.
      * Imagine a formatting toolbar, notification headers, etc.
      */
    def contentHeader: BoxPanel = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Whether the content widget or an error is revealed.
      */
    def isRevealed: Boolean = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
    
    /**
      * A promise that resolves when the widget is revealed.
      */
    def revealed: js.Promise[Unit] = js.native
    
    /**
      * The toolbar hosted by the widget.
      */
    def toolbar: Toolbar[Widget] = js.native
  }
  object MainAreaWidget {
    
    /**
      * An options object for creating a main area widget.
      */
    trait IOptions[T /* <: Widget */]
      extends StObject
         with typings.luminoWidgets.typesWidgetMod.Widget.IOptions {
      
      /**
        * The child widget to wrap.
        */
      var content: T
      
      /**
        * The layout to sit underneath the toolbar and above the content,
        * and that extensions can populate. Defaults to an empty BoxPanel.
        */
      var contentHeader: js.UndefOr[BoxPanel] = js.undefined
      
      /**
        * An optional promise for when the content is ready to be revealed.
        */
      var reveal: js.UndefOr[js.Promise[Any]] = js.undefined
      
      /**
        * The toolbar to use for the widget.  Defaults to an empty toolbar.
        */
      var toolbar: js.UndefOr[Toolbar[Widget]] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply[T /* <: Widget */](content: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions[?], T /* <: Widget */] (val x: Self & IOptions[T]) extends AnyVal {
        
        inline def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentHeader(value: BoxPanel): Self = StObject.set(x, "contentHeader", value.asInstanceOf[js.Any])
        
        inline def setContentHeaderUndefined: Self = StObject.set(x, "contentHeader", js.undefined)
        
        inline def setReveal(value: js.Promise[Any]): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
        
        inline def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
        
        inline def setToolbar(value: Toolbar[Widget]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
        
        inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
    
    /**
      * An options object for main area widget subclasses providing their own
      * default content.
      *
      * #### Notes
      * This makes it easier to have a subclass that provides its own default
      * content. This can go away once we upgrade to TypeScript 2.8 and have an
      * easy way to make a single property optional, ala
      * https://stackoverflow.com/a/46941824
      */
    trait IOptionsOptionalContent[T /* <: Widget */]
      extends StObject
         with typings.luminoWidgets.typesWidgetMod.Widget.IOptions {
      
      /**
        * The child widget to wrap.
        */
      var content: js.UndefOr[T] = js.undefined
      
      /**
        * An optional promise for when the content is ready to be revealed.
        */
      var reveal: js.UndefOr[js.Promise[Any]] = js.undefined
      
      /**
        * The toolbar to use for the widget.  Defaults to an empty toolbar.
        */
      var toolbar: js.UndefOr[Toolbar[Widget]] = js.undefined
    }
    object IOptionsOptionalContent {
      
      inline def apply[T /* <: Widget */](): IOptionsOptionalContent[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptionsOptionalContent[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptionsOptionalContent[?], T /* <: Widget */] (val x: Self & IOptionsOptionalContent[T]) extends AnyVal {
        
        inline def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setReveal(value: js.Promise[Any]): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
        
        inline def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
        
        inline def setToolbar(value: Toolbar[Widget]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
        
        inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      }
    }
  }
}
