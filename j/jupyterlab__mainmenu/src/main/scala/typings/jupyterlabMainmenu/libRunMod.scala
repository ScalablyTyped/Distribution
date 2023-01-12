package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.libRunMod.IRunMenu.ICodeRunner
import typings.jupyterlabMainmenu.libTokensMod.IMenuExtender
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRunMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu because Already inherited
  - typings.jupyterlabMainmenu.libRunMod.IRunMenu because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/mainmenu/lib/run", "RunMenu")
  @js.native
  open class RunMenu protected () extends RankedMenu {
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
  trait IRunMenu
    extends StObject
       with IRankedMenu {
    
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
    trait ICodeRunner[T /* <: Widget */]
      extends StObject
         with IMenuExtender[T] {
      
      /**
        * A function to restart and run all the code hosted by the widget, which
        * returns a promise of whether the action was performed.
        */
      var restartAndRunAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.undefined
      
      /**
        * Return the caption associated to the `restartAndRunAll` function.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var restartAndRunAllCaption: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
      /**
        * Return the label associated to the `restartAndRunAll` function.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var restartAndRunAllLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
      /**
        * A function to run a chunk of code.
        */
      var run: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
      
      /**
        * A function to run the entirety of the code hosted by the widget.
        */
      var runAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.undefined
      
      /**
        * Return the caption associated to the `runAll` function.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var runAllCaption: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
      /**
        * Return the label associated to the `runAll` function.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var runAllLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
      /**
        * Return the caption associated to the `run` function.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var runCaption: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
      
      /**
        * Return the label associated to the `run` function.
        *
        * This function receives the number of items `n` to be able to provided
        * correct pluralized forms of translations.
        */
      var runLabel: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
    }
    object ICodeRunner {
      
      inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): ICodeRunner[T] = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICodeRunner[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICodeRunner[?], T /* <: Widget */] (val x: Self & ICodeRunner[T]) extends AnyVal {
        
        inline def setRestartAndRunAll(value: /* widget */ T => js.Promise[Boolean]): Self = StObject.set(x, "restartAndRunAll", js.Any.fromFunction1(value))
        
        inline def setRestartAndRunAllCaption(value: /* n */ Double => String): Self = StObject.set(x, "restartAndRunAllCaption", js.Any.fromFunction1(value))
        
        inline def setRestartAndRunAllCaptionUndefined: Self = StObject.set(x, "restartAndRunAllCaption", js.undefined)
        
        inline def setRestartAndRunAllLabel(value: /* n */ Double => String): Self = StObject.set(x, "restartAndRunAllLabel", js.Any.fromFunction1(value))
        
        inline def setRestartAndRunAllLabelUndefined: Self = StObject.set(x, "restartAndRunAllLabel", js.undefined)
        
        inline def setRestartAndRunAllUndefined: Self = StObject.set(x, "restartAndRunAll", js.undefined)
        
        inline def setRun(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
        
        inline def setRunAll(value: /* widget */ T => js.Promise[Unit]): Self = StObject.set(x, "runAll", js.Any.fromFunction1(value))
        
        inline def setRunAllCaption(value: /* n */ Double => String): Self = StObject.set(x, "runAllCaption", js.Any.fromFunction1(value))
        
        inline def setRunAllCaptionUndefined: Self = StObject.set(x, "runAllCaption", js.undefined)
        
        inline def setRunAllLabel(value: /* n */ Double => String): Self = StObject.set(x, "runAllLabel", js.Any.fromFunction1(value))
        
        inline def setRunAllLabelUndefined: Self = StObject.set(x, "runAllLabel", js.undefined)
        
        inline def setRunAllUndefined: Self = StObject.set(x, "runAll", js.undefined)
        
        inline def setRunCaption(value: /* n */ Double => String): Self = StObject.set(x, "runCaption", js.Any.fromFunction1(value))
        
        inline def setRunCaptionUndefined: Self = StObject.set(x, "runCaption", js.undefined)
        
        inline def setRunLabel(value: /* n */ Double => String): Self = StObject.set(x, "runLabel", js.Any.fromFunction1(value))
        
        inline def setRunLabelUndefined: Self = StObject.set(x, "runLabel", js.undefined)
        
        inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      }
    }
  }
}
