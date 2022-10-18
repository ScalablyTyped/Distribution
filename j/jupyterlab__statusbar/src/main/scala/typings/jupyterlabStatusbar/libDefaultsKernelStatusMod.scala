package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.IOptions
import typings.jupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.Model
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultsKernelStatusMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus")
  @js.native
  open class KernelStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
    def this(opts: IOptions, translator: ITranslator) = this()
    
    /* private */ var _handleClick: Any = js.native
    
    var translator: ITranslator = js.native
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus.Model")
    @js.native
    open class Model () extends VDomModel {
      def this(translator: ITranslator) = this()
      
      /* private */ var _activityName: Any = js.native
      
      /* private */ var _getAllState: Any = js.native
      
      /* private */ var _kernelName: Any = js.native
      
      /* private */ var _kernelStatus: Any = js.native
      
      /**
        * React to changes in the kernel.
        */
      /* private */ var _onKernelChanged: Any = js.native
      
      /**
        * React to changes to the kernel status.
        */
      /* private */ var _onKernelStatusChanged: Any = js.native
      
      /* private */ var _sessionContext: Any = js.native
      
      /* private */ val _statusNames: Any = js.native
      
      /* private */ var _trans: Any = js.native
      
      /* private */ var _triggerChange: Any = js.native
      
      /**
        * A display name for the activity.
        */
      def activityName: String = js.native
      def activityName_=(`val`: String): Unit = js.native
      
      /**
        * The name of the kernel.
        */
      def kernelName: String = js.native
      
      /**
        * The current client session associated with the kernel status indicator.
        */
      def sessionContext: ISessionContext | Null = js.native
      def sessionContext_=(sessionContext: ISessionContext | Null): Unit = js.native
      
      /**
        * The current status of the kernel.
        */
      def status: js.UndefOr[String] = js.native
      
      /* protected */ var translation: ITranslator = js.native
    }
    
    /**
      * Options for creating a KernelStatus object.
      */
    trait IOptions extends StObject {
      
      /**
        * A click handler for the item. By default
        * we launch a kernel selection dialog.
        */
      def onClick(): Unit
    }
    object IOptions {
      
      inline def apply(onClick: () => Unit): IOptions = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      }
    }
  }
}
