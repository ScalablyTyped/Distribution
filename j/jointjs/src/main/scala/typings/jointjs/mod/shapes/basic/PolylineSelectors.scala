package typings.jointjs.mod.shapes.basic

import typings.jointjs.mod.shapes.SVGPolylineSelector
import typings.jointjs.mod.shapes.SVGTextSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineSelectors
  extends SVGTextSelector
     with SVGPolylineSelector

object PolylineSelectors {
  @scala.inline
  def apply(): PolylineSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineSelectors]
  }
}

