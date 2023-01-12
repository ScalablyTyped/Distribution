package typings.jupyterlabRunning

import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabRunning.mod.IRunningSessions.IManager
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IRunningSessionManagers extends StObject {
    
    /**
      * Add a running item manager.
      *
      * @param manager - The running item manager.
      *
      */
    def add(manager: IManager): IDisposable
    
    /**
      * Return an array of managers.
      */
    def items(): js.Array[IManager]
  }
  object IRunningSessionManagers {
    
    @JSImport("@jupyterlab/running", "IRunningSessionManagers")
    @js.native
    val ^ : Token[IRunningSessionManagers] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRunningSessionManagers] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: IManager => IDisposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setItems(value: () => js.Array[IManager]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
    }
  }
  
  @JSImport("@jupyterlab/running", "RunningSessionManagers")
  @js.native
  open class RunningSessionManagers ()
    extends StObject
       with IRunningSessionManagers {
    
    /* private */ var _managers: Any = js.native
    
    /**
      * Add a running item manager.
      *
      * @param manager - The running item manager.
      *
      */
    /* CompleteClass */
    override def add(manager: IManager): IDisposable = js.native
    
    /**
      * Return an array of managers.
      */
    /* CompleteClass */
    override def items(): js.Array[IManager] = js.native
  }
  
  @JSImport("@jupyterlab/running", "RunningSessions")
  @js.native
  open class RunningSessions protected () extends ReactWidget {
    /**
      * Construct a new running widget.
      */
    def this(managers: IRunningSessionManagers) = this()
    def this(managers: IRunningSessionManagers, translator: ITranslator) = this()
    
    /* private */ var managers: Any = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  
  object IRunningSessions {
    
    /**
      * A manager of running items grouped under a single section.
      */
    trait IManager extends StObject {
      
      var name: String
      
      def refreshRunning(): Unit
      
      def running(): js.Array[IRunningItem]
      
      var runningChanged: ISignal[Any, Any]
      
      def shutdownAll(): Unit
      
      var shutdownAllConfirmationText: js.UndefOr[String] = js.undefined
      
      var shutdownAllLabel: js.UndefOr[String] = js.undefined
      
      var shutdownItemIcon: js.UndefOr[LabIcon] = js.undefined
      
      var shutdownLabel: js.UndefOr[String] = js.undefined
    }
    object IManager {
      
      inline def apply(
        name: String,
        refreshRunning: () => Unit,
        running: () => js.Array[IRunningItem],
        runningChanged: ISignal[Any, Any],
        shutdownAll: () => Unit
      ): IManager = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refreshRunning = js.Any.fromFunction0(refreshRunning), running = js.Any.fromFunction0(running), runningChanged = runningChanged.asInstanceOf[js.Any], shutdownAll = js.Any.fromFunction0(shutdownAll))
        __obj.asInstanceOf[IManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRefreshRunning(value: () => Unit): Self = StObject.set(x, "refreshRunning", js.Any.fromFunction0(value))
        
        inline def setRunning(value: () => js.Array[IRunningItem]): Self = StObject.set(x, "running", js.Any.fromFunction0(value))
        
        inline def setRunningChanged(value: ISignal[Any, Any]): Self = StObject.set(x, "runningChanged", value.asInstanceOf[js.Any])
        
        inline def setShutdownAll(value: () => Unit): Self = StObject.set(x, "shutdownAll", js.Any.fromFunction0(value))
        
        inline def setShutdownAllConfirmationText(value: String): Self = StObject.set(x, "shutdownAllConfirmationText", value.asInstanceOf[js.Any])
        
        inline def setShutdownAllConfirmationTextUndefined: Self = StObject.set(x, "shutdownAllConfirmationText", js.undefined)
        
        inline def setShutdownAllLabel(value: String): Self = StObject.set(x, "shutdownAllLabel", value.asInstanceOf[js.Any])
        
        inline def setShutdownAllLabelUndefined: Self = StObject.set(x, "shutdownAllLabel", js.undefined)
        
        inline def setShutdownItemIcon(value: LabIcon): Self = StObject.set(x, "shutdownItemIcon", value.asInstanceOf[js.Any])
        
        inline def setShutdownItemIconUndefined: Self = StObject.set(x, "shutdownItemIcon", js.undefined)
        
        inline def setShutdownLabel(value: String): Self = StObject.set(x, "shutdownLabel", value.asInstanceOf[js.Any])
        
        inline def setShutdownLabelUndefined: Self = StObject.set(x, "shutdownLabel", js.undefined)
      }
    }
    
    /**
      * A running item.
      */
    trait IRunningItem extends StObject {
      
      var detail: js.UndefOr[js.Function0[String]] = js.undefined
      
      def icon(): LabIcon
      
      def label(): String
      
      var labelTitle: js.UndefOr[js.Function0[String]] = js.undefined
      
      def open(): Unit
      
      def shutdown(): Unit
    }
    object IRunningItem {
      
      inline def apply(icon: () => LabIcon, label: () => String, open: () => Unit, shutdown: () => Unit): IRunningItem = {
        val __obj = js.Dynamic.literal(icon = js.Any.fromFunction0(icon), label = js.Any.fromFunction0(label), open = js.Any.fromFunction0(open), shutdown = js.Any.fromFunction0(shutdown))
        __obj.asInstanceOf[IRunningItem]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IRunningItem] (val x: Self) extends AnyVal {
        
        inline def setDetail(value: () => String): Self = StObject.set(x, "detail", js.Any.fromFunction0(value))
        
        inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
        
        inline def setIcon(value: () => LabIcon): Self = StObject.set(x, "icon", js.Any.fromFunction0(value))
        
        inline def setLabel(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
        
        inline def setLabelTitle(value: () => String): Self = StObject.set(x, "labelTitle", js.Any.fromFunction0(value))
        
        inline def setLabelTitleUndefined: Self = StObject.set(x, "labelTitle", js.undefined)
        
        inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
        
        inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
      }
    }
  }
}
