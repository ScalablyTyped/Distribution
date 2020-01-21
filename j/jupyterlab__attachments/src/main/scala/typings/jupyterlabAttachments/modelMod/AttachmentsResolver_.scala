package typings.jupyterlabAttachments.modelMod

import typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Get the download url for a given absolute url path.
    *
    * #### Notes
    * This URL may include a query parameter.
    */
  /* CompleteClass */
  override def getDownloadUrl(url: String): js.Promise[String] = js.native
  /**
    * Whether the URL should be handled by the resolver
    * or not.
    */
  @JSName("isLocal")
  def isLocal_MAttachmentsResolver_(url: String): Boolean = js.native
  /**
    * Resolve a relative url to an absolute url path.
    */
  /* CompleteClass */
  override def resolveUrl(url: String): js.Promise[String] = js.native
}

