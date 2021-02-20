package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.jupyterlabMainmenu.runMod.IRunMenu.ICodeRunner
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
  - typings.jupyterlabMainmenu.runMod.IRunMenu because var conflicts: isDisposed. Inlined codeRunners */ @JSImport("@jupyterlab/mainmenu/lib/run", "RunMenu")
  @js.native
  class RunMenu protected () extends JupyterLabMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
    
    /**
      * A set storing ICodeRunner for the Run menu.
      *
      * ### Notes
      * The key for the set may be used in menu labels.
      */
    val codeRunners: Set[ICodeRunner[Widget]] = js.native
  }
  
  @js.native
  trait IRunMenu extends IJupyterLabMenu {
    
    /**
      * A set storing ICodeRunner for the Run menu.
      *
      * ### Notes
      * The key for the set may be used in menu labels.
      */
    val codeRunners: Set[ICodeRunner[Widget]] = js.native
  }
  object IRunMenu {
    
    /**
      * An object that runs code, which may be
      * registered with the Run menu.
      */
    @js.native
    trait ICodeRunner[T /* <: Widget */] extends IMenuExtender[T] {
      
      /**
        * A string label for the thing that is being run,
        * which is used to populate the menu labels.
        */
      var noun: String = js.native
      
      /**
        * A function to restart and run all the code hosted by the widget, which
        * returns a promise of whether the action was performed.
        */
      var restartAndRunAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
      
      /**
        * A function to run a chunk of code.
        */
      var run: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
      
      /**
        * A function to run the entirety of the code hosted by the widget.
        */
      var runAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
    }
    object ICodeRunner {
      
      @scala.inline
      def apply[T /* <: Widget */](noun: String, tracker: IWidgetTracker[T]): ICodeRunner[T] = {
        val __obj = js.Dynamic.literal(noun = noun.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICodeRunner[T]]
      }
      
      @scala.inline
      implicit class ICodeRunnerMutableBuilder[Self <: ICodeRunner[_], T /* <: Widget */] (val x: Self with ICodeRunner[T]) extends AnyVal {
        
        @scala.inline
        def setNoun(value: String): Self = StObject.set(x, "noun", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestartAndRunAll(value: /* widget */ T => js.Promise[Boolean]): Self = StObject.set(x, "restartAndRunAll", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRestartAndRunAllUndefined: Self = StObject.set(x, "restartAndRunAll", js.undefined)
        
        @scala.inline
        def setRun(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRunAll(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "runAll", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRunAllUndefined: Self = StObject.set(x, "runAll", js.undefined)
        
        @scala.inline
        def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      }
    }
  }
}
