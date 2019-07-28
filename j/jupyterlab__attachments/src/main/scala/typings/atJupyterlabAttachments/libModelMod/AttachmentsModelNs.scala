package typings.atJupyterlabAttachments.libModelMod

import typings.atJupyterlabAttachments.libModelMod.AttachmentsModelNs.ContentFactory
import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModelNs.IContentFactory
import typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel
import typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModelNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
@js.native
object AttachmentsModelNs extends js.Object {
  /**
    * The default implementation of a `IAttachemntsModel.IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory {
    /**
      * Create an attachment model.
      */
    /* CompleteClass */
    override def createAttachmentModel(options: IOptions): IAttachmentModel = js.native
  }
  
  /**
    * The default attachment model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

