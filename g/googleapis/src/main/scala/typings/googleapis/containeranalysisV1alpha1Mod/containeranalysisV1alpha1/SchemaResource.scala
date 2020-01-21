package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource is an entity that can have metadata. E.g., a Docker image.
  */
@js.native
trait SchemaResource extends js.Object {
  /**
    * The hash of the resource content. E.g., the Docker digest.
    */
  var contentHash: js.UndefOr[SchemaHash] = js.native
  /**
    * The name of the resource. E.g., the name of a Docker image -
    * &quot;Debian&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique URI of the resource. E.g.,
    * &quot;https://gcr.io/project/image@sha256:foo&quot; for a Docker image.
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

