package typings.jointjs.mod.shapes.basic

import typings.jointjs.mod.shapes.SVGImageSelector
import typings.jointjs.mod.shapes.SVGTextSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSelectors
  extends SVGTextSelector
     with SVGImageSelector

object ImageSelectors {
  @scala.inline
  def apply(): ImageSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSelectors]
  }
}

