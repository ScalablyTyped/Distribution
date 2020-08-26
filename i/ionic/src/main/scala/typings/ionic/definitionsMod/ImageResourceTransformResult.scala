package typings.ionic.definitionsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageResourceTransformResult extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var resource: ImageResource = js.native
  var tmpDest: String = js.native
}

object ImageResourceTransformResult {
  @scala.inline
  def apply(resource: ImageResource, tmpDest: String): ImageResourceTransformResult = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tmpDest = tmpDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResourceTransformResult]
  }
  @scala.inline
  implicit class ImageResourceTransformResultOps[Self <: ImageResourceTransformResult] (val x: Self) extends AnyVal {
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
    def setResource(value: ImageResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setTmpDest(value: String): Self = this.set("tmpDest", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

