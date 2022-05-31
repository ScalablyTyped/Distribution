package typings.jupyterlabStatusbar

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model
import typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryUsageMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/memoryUsage", "MemoryUsage")
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage () extends VDomRenderer[Model]
  object MemoryUsage {
    
    /**
      * A VDomModel for the memory usage status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/memoryUsage", "MemoryUsage.Model")
    @js.native
    class Model protected () extends VDomModel {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: IOptions) = this()
      
      /* private */ var _currentMemory: js.Any = js.native
      
      /* private */ var _memoryLimit: js.Any = js.native
      
      /* private */ var _metricsAvailable: js.Any = js.native
      
      /* private */ var _poll: js.Any = js.native
      
      /* private */ var _units: js.Any = js.native
      
      /**
        * Given the results of the metrics request, update model values.
        */
      /* private */ var _updateMetricsValues: js.Any = js.native
      
      /* private */ var _warn: js.Any = js.native
      
      /**
        * The current memory usage/
        */
      def currentMemory: Double = js.native
      
      /**
        * The current memory limit, or null if not specified.
        */
      def memoryLimit: Double | Null = js.native
      
      /**
        * Whether the metrics server extension is available.
        */
      def metricsAvailable: Boolean = js.native
      
      /**
        * The units for memory usages and limits.
        */
      def units: MemoryUnit = js.native
      
      /**
        * The warning for memory usage.
        */
      def usageWarning: Boolean = js.native
    }
    /**
      * A namespace for Model statics.
      */
    object Model {
      
      /**
        * Options for creating a MemoryUsage model.
        */
      trait IOptions extends StObject {
        
        /**
          * The refresh rate (in ms) for querying the server.
          */
        var refreshRate: Double
      }
      object IOptions {
        
        inline def apply(refreshRate: Double): IOptions = {
          val __obj = js.Dynamic.literal(refreshRate = refreshRate.asInstanceOf[js.Any])
          __obj.asInstanceOf[IOptions]
        }
        
        extension [Self <: IOptions](x: Self) {
          
          inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /**
      * The type of unit used for reporting memory usage.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.B
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB
    */
    trait MemoryUnit extends StObject
    object MemoryUnit {
      
      inline def B: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.B = "B".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.B]
      
      inline def GB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB = "GB".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB]
      
      inline def KB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB = "KB".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB]
      
      inline def MB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB = "MB".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB]
      
      inline def PB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB = "PB".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB]
      
      inline def TB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB = "TB".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB]
    }
  }
}
