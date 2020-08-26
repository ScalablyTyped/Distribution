package typings.jointjs.mod.shapes.basic

import typings.jointjs.mod.shapes.SVGPolygonSelector
import typings.jointjs.mod.shapes.SVGTextSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonSelectors
  extends SVGTextSelector
     with SVGPolygonSelector

object PolygonSelectors {
  @scala.inline
  def apply(): PolygonSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonSelectors]
  }
}

