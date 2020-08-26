package typings.jointjs.mod.shapes.basic

import typings.jointjs.mod.shapes.SVGCircleSelector
import typings.jointjs.mod.shapes.SVGTextSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleSelectors
  extends SVGTextSelector
     with SVGCircleSelector

object CircleSelectors {
  @scala.inline
  def apply(): CircleSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleSelectors]
  }
}

