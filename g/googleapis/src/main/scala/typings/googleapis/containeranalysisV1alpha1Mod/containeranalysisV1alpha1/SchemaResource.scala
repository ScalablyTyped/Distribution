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
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  @scala.inline
  implicit class SchemaResourceOps[Self <: SchemaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentHash(value: SchemaHash): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHash: Self = this.set("contentHash", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

