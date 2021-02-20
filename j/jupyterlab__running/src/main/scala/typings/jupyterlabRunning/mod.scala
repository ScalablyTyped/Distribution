package typings.jupyterlabRunning

import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabRunning.mod.IRunningSessions.IManager
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait IRunningSessionManagers extends StObject {
    
    /**
      * Add a running item manager.
      *
      * @param manager - The running item manager.
      *
      */
    def add(manager: IManager): IDisposable = js.native
    
    /**
      * Return an array of managers.
      */
    def items(): js.Array[IManager] = js.native
  }
  object IRunningSessionManagers {
    
    @JSImport("@jupyterlab/running", "IRunningSessionManagers")
    @js.native
    val ^ : Token[IRunningSessionManagers] = js.native
    
    @scala.inline
    implicit class IRunningSessionManagersMutableBuilder[Self <: IRunningSessionManagers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: IManager => IDisposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItems(value: () => js.Array[IManager]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
    }
  }
  
  @JSImport("@jupyterlab/running", "RunningSessionManagers")
  @js.native
  class RunningSessionManagers () extends IRunningSessionManagers {
    
    var _managers: js.Any = js.native
  }
  
  @JSImport("@jupyterlab/running", "RunningSessions")
  @js.native
  class RunningSessions protected () extends ReactWidget {
    /**
      * Construct a new running widget.
      */
    def this(managers: IRunningSessionManagers) = this()
    
    var managers: js.Any = js.native
  }
  
  object IRunningSessions {
    
    /**
      * A manager of running items grouped under a single section.
      */
    @js.native
    trait IManager extends StObject {
      
      var name: String = js.native
      
      def refreshRunning(): Unit = js.native
      
      def running(): js.Array[IRunningItem] = js.native
      
      var runningChanged: ISignal[_, _] = js.native
      
      def shutdownAll(): Unit = js.native
    }
    object IManager {
      
      @scala.inline
      def apply(
        name: String,
        refreshRunning: () => Unit,
        running: () => js.Array[IRunningItem],
        runningChanged: ISignal[_, _],
        shutdownAll: () => Unit
      ): IManager = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refreshRunning = js.Any.fromFunction0(refreshRunning), running = js.Any.fromFunction0(running), runningChanged = runningChanged.asInstanceOf[js.Any], shutdownAll = js.Any.fromFunction0(shutdownAll))
        __obj.asInstanceOf[IManager]
      }
      
      @scala.inline
      implicit class IManagerMutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshRunning(value: () => Unit): Self = StObject.set(x, "refreshRunning", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRunning(value: () => js.Array[IRunningItem]): Self = StObject.set(x, "running", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRunningChanged(value: ISignal[_, _]): Self = StObject.set(x, "runningChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShutdownAll(value: () => Unit): Self = StObject.set(x, "shutdownAll", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * A running item.
      */
    @js.native
    trait IRunningItem extends StObject {
      
      def icon(): LabIcon = js.native
      
      def label(): String = js.native
      
      var labelTitle: js.UndefOr[js.Function0[String]] = js.native
      
      def open(): Unit = js.native
      
      def shutdown(): Unit = js.native
    }
    object IRunningItem {
      
      @scala.inline
      def apply(icon: () => LabIcon, label: () => String, open: () => Unit, shutdown: () => Unit): IRunningItem = {
        val __obj = js.Dynamic.literal(icon = js.Any.fromFunction0(icon), label = js.Any.fromFunction0(label), open = js.Any.fromFunction0(open), shutdown = js.Any.fromFunction0(shutdown))
        __obj.asInstanceOf[IRunningItem]
      }
      
      @scala.inline
      implicit class IRunningItemMutableBuilder[Self <: IRunningItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIcon(value: () => LabIcon): Self = StObject.set(x, "icon", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLabel(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLabelTitle(value: () => String): Self = StObject.set(x, "labelTitle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLabelTitleUndefined: Self = StObject.set(x, "labelTitle", js.undefined)
        
        @scala.inline
        def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
        
        @scala.inline
        def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
      }
    }
  }
}
