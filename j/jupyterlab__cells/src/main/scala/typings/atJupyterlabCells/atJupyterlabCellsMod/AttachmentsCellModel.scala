package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabCells.libModelMod.AttachmentsCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "AttachmentsCellModel")
@js.native
class AttachmentsCellModel protected ()
  extends typings.atJupyterlabCells.libModelMod.AttachmentsCellModel {
  /**
    * Construct a new cell with optional attachments.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "AttachmentsCellModel")
@js.native
object AttachmentsCellModel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.atJupyterlabCells.libModelMod.AttachmentsCellModel.ContentFactory
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: typings.atJupyterlabCells.libModelMod.AttachmentsCellModel.ContentFactory = js.native
}

