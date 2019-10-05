package typings.atJupyterlabAttachments

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments", JSImport.Namespace)
@js.native
object atJupyterlabAttachmentsMod extends js.Object {
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typings.atJupyterlabAttachments.libModelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class AttachmentsResolver protected ()
    extends typings.atJupyterlabAttachments.libModelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typings.atJupyterlabAttachments.libModelMod.AttachmentsResolver.IOptions) = this()
  }
  
  @js.native
  object AttachmentsModel extends js.Object {
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.atJupyterlabAttachments.libModelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    val defaultContentFactory: typings.atJupyterlabAttachments.libModelMod.AttachmentsModel.ContentFactory = js.native
  }
  
}

