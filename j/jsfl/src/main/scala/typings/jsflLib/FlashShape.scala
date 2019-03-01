package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Shape object is a subclass of the Element object. The Shape object provides more precise control
  * than the drawing APIs when manipulating or creating geometry on the Stage. This control is necessary
  * so that scripts can create useful effects and other drawing commands (seeElement object).
  * All Shape methods and properties that change a shape or any of its subordinate parts must be placed between
  * shape.beginEdit() and shape.endEdit() calls to function correctly.
  */
trait FlashShape extends FlashOval {
  var contours: js.Array[FlashContour]
  var edges: js.Array[FlashEdge]
  var isDrawingObject: scala.Boolean
  var isGroup: scala.Boolean
  var isOvalObject: scala.Boolean
  var isRectangleObject: scala.Boolean
  var members: js.Array[FlashShape]
  var numCubicSegments: scala.Double
  var vertices: js.Array[FlashVertex]
  def beginEdit(): scala.Unit
  def deleteEdge(index: scala.Double): scala.Unit
  def endEdit(): scala.Unit
  def getCubicSegmentPoints(cubicSegmentIndex: scala.Double): js.Array[FlashPoint]
}

object FlashShape {
  @scala.inline
  def apply(
    beginEdit: js.Function0[scala.Unit],
    closePath: scala.Boolean,
    contours: js.Array[FlashContour],
    deleteEdge: js.Function1[scala.Double, scala.Unit],
    edges: js.Array[FlashEdge],
    endAngle: scala.Double,
    endEdit: js.Function0[scala.Unit],
    getCubicSegmentPoints: js.Function1[scala.Double, js.Array[FlashPoint]],
    innerRadius: scala.Double,
    isDrawingObject: scala.Boolean,
    isGroup: scala.Boolean,
    isOvalObject: scala.Boolean,
    isRectangleObject: scala.Boolean,
    members: js.Array[FlashShape],
    numCubicSegments: scala.Double,
    startAngle: scala.Double,
    vertices: js.Array[FlashVertex]
  ): FlashShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginEdit")(beginEdit)
    __obj.updateDynamic("closePath")(closePath)
    __obj.updateDynamic("contours")(contours)
    __obj.updateDynamic("deleteEdge")(deleteEdge)
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("endEdit")(endEdit)
    __obj.updateDynamic("getCubicSegmentPoints")(getCubicSegmentPoints)
    __obj.updateDynamic("innerRadius")(innerRadius)
    __obj.updateDynamic("isDrawingObject")(isDrawingObject)
    __obj.updateDynamic("isGroup")(isGroup)
    __obj.updateDynamic("isOvalObject")(isOvalObject)
    __obj.updateDynamic("isRectangleObject")(isRectangleObject)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("numCubicSegments")(numCubicSegments)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[FlashShape]
  }
}

