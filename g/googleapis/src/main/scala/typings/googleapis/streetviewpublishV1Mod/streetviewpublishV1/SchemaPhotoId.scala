package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifier for a Photo.
  */
@js.native
trait SchemaPhotoId extends js.Object {
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaPhotoId {
  @scala.inline
  def apply(id: String = null): SchemaPhotoId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPhotoId]
  }
}

