package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the worker starts pulling an image.
  */
@js.native
trait SchemaPullStartedEvent extends js.Object {
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object SchemaPullStartedEvent {
  @scala.inline
  def apply(imageUri: String = null): SchemaPullStartedEvent = {
    val __obj = js.Dynamic.literal()
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPullStartedEvent]
  }
}

