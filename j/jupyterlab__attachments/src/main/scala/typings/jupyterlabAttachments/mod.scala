package typings.jupyterlabAttachments

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/attachments", "AttachmentsModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typings.jupyterlabAttachments.modelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  object AttachmentsModel {
    
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @JSImport("@jupyterlab/attachments", "AttachmentsModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends typings.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    @JSImport("@jupyterlab/attachments", "AttachmentsModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/attachments", "AttachmentsResolver")
  @js.native
  class AttachmentsResolver protected ()
    extends typings.jupyterlabAttachments.modelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions) = this()
  }
}
