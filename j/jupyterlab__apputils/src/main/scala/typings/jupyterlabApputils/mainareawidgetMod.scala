package typings.jupyterlabApputils

import typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions
import typings.jupyterlabApputils.printingMod.Printing.IPrintable
import typings.jupyterlabApputils.toolbarMod.Toolbar
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainareawidgetMod {
  
  @JSImport("@jupyterlab/apputils/lib/mainareawidget", "MainAreaWidget")
  @js.native
  class MainAreaWidget[T /* <: Widget */] protected ()
    extends Widget
       with IPrintable {
    /**
      * Construct a new main area widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IOptions[T]) = this()
    
    var _changeGuard: js.Any = js.native
    
    var _content: js.Any = js.native
    
    /**
      * Give focus to the content.
      */
    var _focusContent: js.Any = js.native
    
    var _isRevealed: js.Any = js.native
    
    var _revealed: js.Any = js.native
    
    var _spinner: js.Any = js.native
    
    var _toolbar: js.Any = js.native
    
    /**
      * Update the content title based on attributes of the main widget.
      */
    var _updateContentTitle: js.Any = js.native
    
    /**
      * Update the title based on the attributes of the child widget.
      */
    var _updateTitle: js.Any = js.native
    
    /**
      * The content hosted by the widget.
      */
    def content: T = js.native
    
    /**
      * Whether the content widget or an error is revealed.
      */
    def isRevealed: Boolean = js.native
    
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
    @js.native
    trait IOptions[T /* <: Widget */]
      extends typings.luminoWidgets.widgetMod.Widget.IOptions {
      
      /**
        * The child widget to wrap.
        */
      var content: T = js.native
      
      /**
        * An optional promise for when the content is ready to be revealed.
        */
      var reveal: js.UndefOr[js.Promise[_]] = js.native
      
      /**
        * The toolbar to use for the widget.  Defaults to an empty toolbar.
        */
      var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: Widget */](content: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T /* <: Widget */] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReveal(value: js.Promise[_]): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
        
        @scala.inline
        def setToolbar(value: Toolbar[Widget]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
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
    @js.native
    trait IOptionsOptionalContent[T /* <: Widget */]
      extends typings.luminoWidgets.widgetMod.Widget.IOptions {
      
      /**
        * The child widget to wrap.
        */
      var content: js.UndefOr[T] = js.native
      
      /**
        * An optional promise for when the content is ready to be revealed.
        */
      var reveal: js.UndefOr[js.Promise[_]] = js.native
      
      /**
        * The toolbar to use for the widget.  Defaults to an empty toolbar.
        */
      var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
    }
    object IOptionsOptionalContent {
      
      @scala.inline
      def apply[T /* <: Widget */](): IOptionsOptionalContent[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptionsOptionalContent[T]]
      }
      
      @scala.inline
      implicit class IOptionsOptionalContentMutableBuilder[Self <: IOptionsOptionalContent[_], T /* <: Widget */] (val x: Self with IOptionsOptionalContent[T]) extends AnyVal {
        
        @scala.inline
        def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setReveal(value: js.Promise[_]): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
        
        @scala.inline
        def setToolbar(value: Toolbar[Widget]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      }
    }
  }
}
