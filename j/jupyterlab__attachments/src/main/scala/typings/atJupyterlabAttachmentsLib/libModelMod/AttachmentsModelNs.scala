package typings
package atJupyterlabAttachmentsLib.libModelMod

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
  class ContentFactory ()
    extends atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IContentFactory {
    /**
      * Create an attachment model.
      */
    /* CompleteClass */
    override def createAttachmentModel(options: atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModelNs.IOptions): atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModel = js.native
  }
  
  /**
    * The default attachment model factory.
    */
  val defaultContentFactory: ContentFactory = js.native
}

