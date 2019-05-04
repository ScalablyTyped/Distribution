package typings
package atJupyterlabAttachmentsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments/lib/model", "AttachmentsResolver")
@js.native
class AttachmentsResolver protected ()
  extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver {
  /**
    * Create an attachments resolver object.
    */
  def this(options: atJupyterlabAttachmentsLib.libModelMod.AttachmentsResolverNs.IOptions) = this()
  var _model: js.Any = js.native
  var _parent: js.Any = js.native
  /**
    * Get the download url for a given absolute url path.
    */
  /* CompleteClass */
  override def getDownloadUrl(url: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
    * Whether the URL should be handled by the resolver
    * or not.
    */
  @JSName("isLocal")
  def isLocal_MAttachmentsResolver(url: java.lang.String): scala.Boolean = js.native
  /**
    * Resolve a relative url to an absolute url path.
    */
  /* CompleteClass */
  override def resolveUrl(url: java.lang.String): js.Promise[java.lang.String] = js.native
}

