package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
@js.native
object AttachmentsCellModelNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory {
    /**
      * Create an output area.
      */
    /* CompleteClass */
    override def createAttachmentsModel(options: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IOptions): atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel = js.native
  }
  
  /**
    * A factory for creating code cell model content.
    */
  trait IContentFactory extends js.Object {
    /**
      * Create an output area.
      */
    def createAttachmentsModel(options: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IOptions): atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel
  }
  
  /**
    * The options used to initialize a `AttachmentsCellModel`.
    */
  trait IOptions
    extends atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions {
    /**
      * The factory for attachment model creation.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  }
  
  /**
    * The shared `ContentFactory` instance.
    */
  val defaultContentFactory: ContentFactory = js.native
}

