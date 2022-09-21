package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.tokensMod.IMenuExtender
import typings.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typings.jupyterlabUiComponents.menuMod.IRankedMenu
import typings.jupyterlabUiComponents.menuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/view", "ViewMenu")
  @js.native
  open class ViewMenu protected ()
    extends RankedMenu
       with IViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* InferMemberOverrides */
    override val isDisposed: Boolean = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
  }
  
  @js.native
  trait IViewMenu
    extends StObject
       with IRankedMenu {
    
    /**
      * A set storing IKernelUsers for the Kernel menu.
      */
    val editorViewers: Set[IEditorViewer[Widget]] = js.native
  }
  object IViewMenu {
    
    /**
      * Interface for a text editor viewer to register
      * itself with the text editor extension points.
      */
    trait IEditorViewer[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * Whether line numbers are toggled.
        */
      var lineNumbersToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
      
      /**
        * Whether match brackets is toggled.
        */
      var matchBracketsToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
      
      /**
        * Whether to show line numbers in the editor.
        */
      var toggleLineNumbers: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * Whether to match brackets in the editor.
        */
      var toggleMatchBrackets: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * Whether to word-wrap the editor.
        */
      var toggleWordWrap: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
      
      /**
        * Whether word wrap is toggled.
        */
      var wordWrapToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
    }
    object IEditorViewer {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IEditorViewer[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEditorViewer[T]]
      }
      
      extension [Self <: IEditorViewer[?], T /* <: Widget */](x: Self & IEditorViewer[T]) {
        
        inline def setLineNumbersToggled(value: /* widget */ T => Boolean): Self = StObject.set(x, "lineNumbersToggled", js.Any.fromFunction1(value))
        
        inline def setLineNumbersToggledUndefined: Self = StObject.set(x, "lineNumbersToggled", js.undefined)
        
        inline def setMatchBracketsToggled(value: /* widget */ T => Boolean): Self = StObject.set(x, "matchBracketsToggled", js.Any.fromFunction1(value))
        
        inline def setMatchBracketsToggledUndefined: Self = StObject.set(x, "matchBracketsToggled", js.undefined)
        
        inline def setToggleLineNumbers(value: /* widget */ T => Unit): Self = StObject.set(x, "toggleLineNumbers", js.Any.fromFunction1(value))
        
        inline def setToggleLineNumbersUndefined: Self = StObject.set(x, "toggleLineNumbers", js.undefined)
        
        inline def setToggleMatchBrackets(value: /* widget */ T => Unit): Self = StObject.set(x, "toggleMatchBrackets", js.Any.fromFunction1(value))
        
        inline def setToggleMatchBracketsUndefined: Self = StObject.set(x, "toggleMatchBrackets", js.undefined)
        
        inline def setToggleWordWrap(value: /* widget */ T => Unit): Self = StObject.set(x, "toggleWordWrap", js.Any.fromFunction1(value))
        
        inline def setToggleWordWrapUndefined: Self = StObject.set(x, "toggleWordWrap", js.undefined)
        
        inline def setWordWrapToggled(value: /* widget */ T => Boolean): Self = StObject.set(x, "wordWrapToggled", js.Any.fromFunction1(value))
        
        inline def setWordWrapToggledUndefined: Self = StObject.set(x, "wordWrapToggled", js.undefined)
      }
    }
  }
}
