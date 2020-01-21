package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity that can have metadata. For example, a Docker image.
  */
@js.native
trait SchemaResource extends js.Object {
  /**
    * The hash of the resource content. For example, the Docker digest.
    */
  var contentHash: js.UndefOr[SchemaHash] = js.native
  /**
    * The name of the resource. For example, the name of a Docker image -
    * &quot;Debian&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The unique URI of the resource. For example,
    * `https://gcr.io/project/image@sha256:foo` for a Docker image.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaResource {
  @scala.inline
  def apply(contentHash: SchemaHash = null, name: String = null, uri: String = null): SchemaResource = {
    val __obj = js.Dynamic.literal()
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResource]
  }
}

