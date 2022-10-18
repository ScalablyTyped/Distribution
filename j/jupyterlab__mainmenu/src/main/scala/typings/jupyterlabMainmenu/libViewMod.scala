package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.libTokensMod.IMenuExtender
import typings.jupyterlabMainmenu.libViewMod.IViewMenu.IEditorViewer
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu because Already inherited
  - typings.jupyterlabMainmenu.libViewMod.IViewMenu because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/mainmenu/lib/view", "ViewMenu")
  @js.native
  open class ViewMenu protected () extends RankedMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
    
    /**
      * A set storing IEditorViewers for the View menu.
      */
    val editorViewers: Set[IEditorViewer[Widget]] = js.native
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
