package typings.jupyterlabAttachments

import typings.jupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/attachments", "AttachmentsModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  open class AttachmentsModel ()
    extends typings.jupyterlabAttachments.libModelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  object AttachmentsModel {
    
    /**
      * The default implementation of a `IAttachmentsModel.IContentFactory`.
      */
    @JSImport("@jupyterlab/attachments", "AttachmentsModel.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends typings.jupyterlabAttachments.libModelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    @JSImport("@jupyterlab/attachments", "AttachmentsModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabAttachments.libModelMod.AttachmentsModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/attachments", "AttachmentsResolver")
  @js.native
  open class AttachmentsResolver protected ()
    extends typings.jupyterlabAttachments.libModelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typings.jupyterlabAttachments.libModelMod.AttachmentsResolver.IOptions) = this()
  }
}
