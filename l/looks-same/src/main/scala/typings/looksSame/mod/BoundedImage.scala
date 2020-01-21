package typings.looksSame.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * bounded image
  */
trait BoundedImage extends js.Object {
  /**
    * bounding coordinates
    */
  var boundingBox: CoordBounds
  /**
    * image path or buffer
    */
  var source: String | Buffer
}

object BoundedImage {
  @scala.inline
  def apply(boundingBox: CoordBounds, source: String | Buffer): BoundedImage = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundedImage]
  }
}

