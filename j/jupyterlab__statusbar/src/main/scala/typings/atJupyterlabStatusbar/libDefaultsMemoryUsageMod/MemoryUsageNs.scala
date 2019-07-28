package typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsageNs.MemoryUnit
import typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsageNs.ModelNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/memoryUsage", "MemoryUsage")
@js.native
object MemoryUsageNs extends js.Object {
  /**
    * The type of unit used for reporting memory usage.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.B
    - typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.KB
    - typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.MB
    - typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.GB
    - typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.TB
    - typings.atJupyterlabStatusbar.atJupyterlabStatusbarStrings.PB
  */
  trait MemoryUnit extends js.Object
  
  /**
    * A VDomModel for the memory usage status item.
    */
  @js.native
  class Model protected () extends VDomModel {
    /**
      * Construct a new memory usage model.
      *
      * @param options: the options for creating the model.
      */
    def this(options: IOptions) = this()
    var _currentMemory: js.Any = js.native
    var _memoryLimit: js.Any = js.native
    var _metricsAvailable: js.Any = js.native
    var _poll: js.Any = js.native
    var _units: js.Any = js.native
    /**
      * Given the results of the metrics request, update model values.
      */
    var _updateMetricsValues: js.Any = js.native
    /**
      * The current memory usage/
      */
    val currentMemory: Double = js.native
    /**
      * The current memory limit, or null if not specified.
      */
    val memoryLimit: Double | Null = js.native
    /**
      * Whether the metrics server extension is available.
      */
    val metricsAvailable: Boolean = js.native
    /**
      * The units for memory usages and limits.
      */
    val units: MemoryUnit = js.native
  }
  
  /**
    * A namespace for Model statics.
    */
  @JSName("Model")
  @js.native
  object ModelNs extends js.Object {
    /**
      * Options for creating a MemoryUsage model.
      */
    trait IOptions extends js.Object {
      /**
        * The refresh rate (in ms) for querying the server.
        */
      var refreshRate: Double
    }
    
  }
  
}

