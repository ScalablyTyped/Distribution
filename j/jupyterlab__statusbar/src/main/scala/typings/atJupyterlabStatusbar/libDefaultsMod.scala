package typings.atJupyterlabStatusbar

import typings.atJupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults", JSImport.Namespace)
@js.native
object libDefaultsMod extends js.Object {
  @js.native
  class KernelStatus protected ()
    extends typings.atJupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol ()
    extends typings.atJupyterlabStatusbar.libDefaultsLineColMod.LineCol
  
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage ()
    extends typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsage
  
  @js.native
  class RunningSessions protected ()
    extends typings.atJupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typings.atJupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.IOptions) = this()
  }
  
  @js.native
  object KernelStatus extends js.Object {
    /**
      * A VDomModel for the kernel status indicator.
      */
    @js.native
    class Model ()
      extends typings.atJupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.Model
    
  }
  
  @js.native
  object LineCol extends js.Object {
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @js.native
    class Model ()
      extends typings.atJupyterlabStatusbar.libDefaultsLineColMod.LineCol.Model
    
  }
  
  /**
    * A namespace for LineColComponent.
    */
  @js.native
  object LineColComponent extends js.Object
  
  @js.native
  object MemoryUsage extends js.Object {
    /**
      * A VDomModel for the memory usage status item.
      */
    @js.native
    class Model protected ()
      extends typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsage.Model {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsage.Model.IOptions) = this()
    }
    
    /**
      * A namespace for Model statics.
      */
    @js.native
    object Model extends js.Object
    
  }
  
  @js.native
  object RunningSessions extends js.Object {
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @js.native
    class Model ()
      extends typings.atJupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.Model
    
  }
  
}

