package typings.jupyterlabAttachments

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typings.jupyterlabAttachments.modelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class AttachmentsResolver protected ()
    extends typings.jupyterlabAttachments.modelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions) = this()
  }
  
  @js.native
  object AttachmentsModel extends js.Object {
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    val defaultContentFactory: typings.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory = js.native
  }
  
}

