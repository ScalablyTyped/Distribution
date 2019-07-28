package typings.atJupyterlabOutputarea.libModelMod

import typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModelNs.IContentFactory
import typings.atJupyterlabOutputarea.libModelMod.OutputAreaModelNs.ContentFactory
import typings.atJupyterlabRendermime.libOutputmodelMod.IOutputModel
import typings.atJupyterlabRendermime.libOutputmodelMod.IOutputModelNs.IOptions
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
  class ContentFactory () extends IContentFactory {
    /**
      * Create an output model.
      */
    /* CompleteClass */
    override def createOutputModel(options: IOptions): IOutputModel = js.native
  }
  
  /**
    * The default output model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

