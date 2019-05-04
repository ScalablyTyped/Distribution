package typings
package atJupyterlabOutputareaLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel")
@js.native
object OutputAreaModelNs extends js.Object {
  /**
    * The default implementation of a `IModelOutputFactory`.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs.IContentFactory {
    /**
      * Create an output model.
      */
    /* CompleteClass */
    override def createOutputModel(options: atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModelNs.IOptions): atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel = js.native
  }
  
  /**
    * The default output model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

