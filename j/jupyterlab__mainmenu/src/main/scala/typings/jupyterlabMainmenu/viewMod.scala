package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
  - typings.jupyterlabMainmenu.viewMod.IViewMenu because var conflicts: isDisposed. Inlined editorViewers */ @JSImport("@jupyterlab/mainmenu/lib/view", "ViewMenu")
  @js.native
  class ViewMenu protected () extends JupyterLabMenu {
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
  trait IViewMenu extends IJupyterLabMenu {
    
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
    @js.native
    trait IEditorViewer[T /* <: Widget */] extends IMenuExtender[T] {
      
      /**
        * Whether line numbers are toggled.
        */
      var lineNumbersToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
      
      /**
        * Whether match brackets is toggled.
        */
      var matchBracketsToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
      
      /**
        * Whether to show line numbers in the editor.
        */
      var toggleLineNumbers: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
      
      /**
        * Whether to match brackets in the editor.
        */
      var toggleMatchBrackets: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
      
      /**
        * Whether to word-wrap the editor.
        */
      var toggleWordWrap: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
      
      /**
        * Whether word wrap is toggled.
        */
      var wordWrapToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
    }
    object IEditorViewer {
      
      @scala.inline
      def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IEditorViewer[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEditorViewer[T]]
      }
      
      @scala.inline
      implicit class IEditorViewerMutableBuilder[Self <: IEditorViewer[_], T /* <: Widget */] (val x: Self with IEditorViewer[T]) extends AnyVal {
        
        @scala.inline
        def setLineNumbersToggled(value: /* widget */ T => Boolean): Self = StObject.set(x, "lineNumbersToggled", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLineNumbersToggledUndefined: Self = StObject.set(x, "lineNumbersToggled", js.undefined)
        
        @scala.inline
        def setMatchBracketsToggled(value: /* widget */ T => Boolean): Self = StObject.set(x, "matchBracketsToggled", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMatchBracketsToggledUndefined: Self = StObject.set(x, "matchBracketsToggled", js.undefined)
        
        @scala.inline
        def setToggleLineNumbers(value: /* widget */ T => Unit): Self = StObject.set(x, "toggleLineNumbers", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToggleLineNumbersUndefined: Self = StObject.set(x, "toggleLineNumbers", js.undefined)
        
        @scala.inline
        def setToggleMatchBrackets(value: /* widget */ T => Unit): Self = StObject.set(x, "toggleMatchBrackets", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToggleMatchBracketsUndefined: Self = StObject.set(x, "toggleMatchBrackets", js.undefined)
        
        @scala.inline
        def setToggleWordWrap(value: /* widget */ T => Unit): Self = StObject.set(x, "toggleWordWrap", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToggleWordWrapUndefined: Self = StObject.set(x, "toggleWordWrap", js.undefined)
        
        @scala.inline
        def setWordWrapToggled(value: /* widget */ T => Boolean): Self = StObject.set(x, "wordWrapToggled", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWordWrapToggledUndefined: Self = StObject.set(x, "wordWrapToggled", js.undefined)
      }
    }
  }
}
