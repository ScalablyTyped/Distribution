package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A connection is the link from a source photo to a destination photo.
  */
@js.native
trait SchemaConnection extends js.Object {
  /**
    * Required. The destination of the connection from the containing photo to
    * another photo.
    */
  var target: js.UndefOr[SchemaPhotoId] = js.native
}

object SchemaConnection {
  @scala.inline
  def apply(target: SchemaPhotoId = null): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConnection]
  }
}

