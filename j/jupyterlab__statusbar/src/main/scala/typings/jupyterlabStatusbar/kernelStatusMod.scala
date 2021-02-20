package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelStatusMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus")
  @js.native
  class KernelStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
    
    var _handleClick: js.Any = js.native
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus.Model")
    @js.native
    class Model () extends VDomModel {
      
      var _activityName: js.Any = js.native
      
      var _getAllState: js.Any = js.native
      
      var _kernelName: js.Any = js.native
      
      var _kernelStatus: js.Any = js.native
      
      /**
        * React to changes in the kernel.
        */
      var _onKernelChanged: js.Any = js.native
      
      /**
        * React to changes to the kernel status.
        */
      var _onKernelStatusChanged: js.Any = js.native
      
      var _sessionContext: js.Any = js.native
      
      var _triggerChange: js.Any = js.native
      
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
    }
    
    /**
      * Options for creating a KernelStatus object.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A click handler for the item. By default
        * we launch a kernel selection dialog.
        */
      def onClick(): Unit = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(onClick: () => Unit): IOptions = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      }
    }
  }
}
