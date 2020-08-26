package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoProviderOptions extends js.Object {
  /**
    * If set, the renderer will use technologies (like webgl) that only work when cors headers are appropiately set on the provided images.
    * It is the developer's task to serve the images correctly in combination with this flag, which might otherwise lead to SecurityErrors.
    */
  var cors: js.UndefOr[Boolean] = js.native
}

object PanoProviderOptions {
  @scala.inline
  def apply(): PanoProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoProviderOptions]
  }
  @scala.inline
  implicit class PanoProviderOptionsOps[Self <: PanoProviderOptions] (val x: Self) extends AnyVal {
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
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
  }
  
}

