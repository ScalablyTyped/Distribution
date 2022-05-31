package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "KernelStatus")
  @js.native
  class KernelStatus protected ()
    extends typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "KernelStatus.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol ()
    extends typings.jupyterlabStatusbar.lineColMod.LineCol
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "LineCol.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabStatusbar.lineColMod.LineCol.Model
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "MemoryUsage")
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage ()
    extends typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage
  object MemoryUsage {
    
    /**
      * A VDomModel for the memory usage status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "MemoryUsage.Model")
    @js.native
    class Model protected ()
      extends typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions) = this()
    }
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "RunningSessions")
  @js.native
  class RunningSessions protected ()
    extends typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions) = this()
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "RunningSessions.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
  }
}
