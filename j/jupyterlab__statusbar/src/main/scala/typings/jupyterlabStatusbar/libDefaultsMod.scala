package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.IOptions
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "KernelStatus")
  @js.native
  open class KernelStatus protected ()
    extends typings.jupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
    def this(opts: IOptions, translator: ITranslator) = this()
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "KernelStatus.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatus.Model {
      def this(translator: ITranslator) = this()
    }
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  open class LineCol ()
    extends typings.jupyterlabStatusbar.libDefaultsLineColMod.LineCol {
    def this(translator: ITranslator) = this()
  }
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "LineCol.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabStatusbar.libDefaultsLineColMod.LineCol.Model
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "RunningSessions")
  @js.native
  open class RunningSessions protected ()
    extends typings.jupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typings.jupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.IOptions) = this()
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunningSessions status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "RunningSessions.Model")
    @js.native
    open class Model ()
      extends typings.jupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.Model
  }
}
