package typings.jupyterlabApplication

import typings.jupyterlabApplication.jupyterlabApplicationStrings.desktop
import typings.jupyterlabApplication.jupyterlabApplicationStrings.mobile
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatusMod {
  
  trait ILabStatus extends StObject {
    
    /**
      * A signal for when application changes its busy status.
      */
    val busySignal: ISignal[JupyterFrontEnd[Any, Any], Boolean]
    
    /**
      * A signal for when application changes its dirty status.
      */
    val dirtySignal: ISignal[JupyterFrontEnd[Any, Any], Boolean]
    
    /**
      * Whether the application is busy.
      */
    val isBusy: Boolean
    
    /**
      * Whether the application is dirty.
      */
    val isDirty: Boolean
    
    /**
      * Set the application state to busy.
      *
      * @returns A disposable used to clear the busy state for the caller.
      */
    def setBusy(): IDisposable
    
    /**
      * Set the application state to dirty.
      *
      * @returns A disposable used to clear the dirty state for the caller.
      */
    def setDirty(): IDisposable
  }
  object ILabStatus {
    
    @JSImport("@jupyterlab/application/lib/status", "ILabStatus")
    @js.native
    val ^ : Token[ILabStatus] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILabStatus] (val x: Self) extends AnyVal {
      
      inline def setBusySignal(value: ISignal[JupyterFrontEnd[Any, Any], Boolean]): Self = StObject.set(x, "busySignal", value.asInstanceOf[js.Any])
      
      inline def setDirtySignal(value: ISignal[JupyterFrontEnd[Any, Any], Boolean]): Self = StObject.set(x, "dirtySignal", value.asInstanceOf[js.Any])
      
      inline def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
      
      inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
      
      inline def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
      
      inline def setSetDirty(value: () => IDisposable): Self = StObject.set(x, "setDirty", js.Any.fromFunction0(value))
    }
  }
  
  @JSImport("@jupyterlab/application/lib/status", "LabStatus")
  @js.native
  open class LabStatus protected ()
    extends StObject
       with ILabStatus {
    /**
      * Construct a new  status object.
      */
    def this(app: JupyterFrontEnd[Any, Any]) = this()
    
    /* private */ var _busyCount: Any = js.native
    
    /* private */ var _busySignal: Any = js.native
    
    /* private */ var _dirtyCount: Any = js.native
    
    /* private */ var _dirtySignal: Any = js.native
    
    /**
      * A signal for when application changes its busy status.
      */
    /* CompleteClass */
    override val busySignal: ISignal[JupyterFrontEnd[Any, Any], Boolean] = js.native
    /**
      * Returns a signal for when application changes its busy status.
      */
    @JSName("busySignal")
    def busySignal_MLabStatus: ISignal[JupyterFrontEnd[IShell, desktop | mobile], Boolean] = js.native
    
    /**
      * A signal for when application changes its dirty status.
      */
    /* CompleteClass */
    override val dirtySignal: ISignal[JupyterFrontEnd[Any, Any], Boolean] = js.native
    /**
      * Returns a signal for when application changes its dirty status.
      */
    @JSName("dirtySignal")
    def dirtySignal_MLabStatus: ISignal[JupyterFrontEnd[IShell, desktop | mobile], Boolean] = js.native
    
    /**
      * Whether the application is busy.
      */
    /* CompleteClass */
    override val isBusy: Boolean = js.native
    /**
      * Whether the application is busy.
      */
    @JSName("isBusy")
    def isBusy_MLabStatus: Boolean = js.native
    
    /**
      * Whether the application is dirty.
      */
    /* CompleteClass */
    override val isDirty: Boolean = js.native
    /**
      * Whether the application is dirty.
      */
    @JSName("isDirty")
    def isDirty_MLabStatus: Boolean = js.native
    
    /**
      * Set the application state to busy.
      *
      * @returns A disposable used to clear the busy state for the caller.
      */
    /* CompleteClass */
    override def setBusy(): IDisposable = js.native
    
    /**
      * Set the application state to dirty.
      *
      * @returns A disposable used to clear the dirty state for the caller.
      */
    /* CompleteClass */
    override def setDirty(): IDisposable = js.native
  }
}
