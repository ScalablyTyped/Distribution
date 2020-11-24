package typings.jupyterlabAttachments.modelMod

import typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsResolver")
@js.native
class AttachmentsResolver_ protected () extends IResolver {
  /**
    * Create an attachments resolver object.
    */
  def this(options: IOptions) = this()
  
  var _model: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  /**
    * Whether the URL should be handled by the resolver
    * or not.
    */
  @JSName("isLocal")
  def isLocal_MAttachmentsResolver_(url: String): Boolean = js.native
}
