package typings.atJupyterlabStatusbar.atJupyterlabStatusbarMod

import typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsageNs.ModelNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar", "MemoryUsage")
@js.native
object MemoryUsageNs extends js.Object {
  /**
    * A VDomModel for the memory usage status item.
    */
  @js.native
  class Model protected ()
    extends typings.atJupyterlabStatusbar.libDefaultsMod.MemoryUsageNs.Model {
    /**
      * Construct a new memory usage model.
      *
      * @param options: the options for creating the model.
      */
    def this(options: IOptions) = this()
  }
  
  /**
    * A namespace for Model statics.
    */
  @JSName("Model")
  @js.native
  object ModelNs extends js.Object
  
}

