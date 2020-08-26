package typings.looksSame.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * bounded image
  */
@js.native
trait BoundedImage extends js.Object {
  /**
    * bounding coordinates
    */
  var boundingBox: CoordBounds = js.native
  /**
    * image path or buffer
    */
  var source: String | Buffer = js.native
}

object BoundedImage {
  @scala.inline
  def apply(boundingBox: CoordBounds, source: String | Buffer): BoundedImage = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundedImage]
  }
  @scala.inline
  implicit class BoundedImageOps[Self <: BoundedImage] (val x: Self) extends AnyVal {
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
    def setBoundingBox(value: CoordBounds): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String | Buffer): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

