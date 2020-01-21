package typings.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the worker stops pulling an image.
  */
@js.native
trait SchemaPullStoppedEvent extends js.Object {
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object SchemaPullStoppedEvent {
  @scala.inline
  def apply(imageUri: String = null): SchemaPullStoppedEvent = {
    val __obj = js.Dynamic.literal()
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPullStoppedEvent]
  }
}

