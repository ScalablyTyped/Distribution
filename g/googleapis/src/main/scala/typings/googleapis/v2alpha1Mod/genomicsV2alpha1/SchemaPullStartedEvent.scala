package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

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
  def apply(): SchemaPullStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullStartedEvent]
  }
  @scala.inline
  implicit class SchemaPullStartedEventOps[Self <: SchemaPullStartedEvent] (val x: Self) extends AnyVal {
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
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
  }
  
}

