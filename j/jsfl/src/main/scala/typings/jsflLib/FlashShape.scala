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
    beginEdit: () => scala.Unit,
    closePath: scala.Boolean,
    contours: js.Array[FlashContour],
    deleteEdge: scala.Double => scala.Unit,
    edges: js.Array[FlashEdge],
    endAngle: scala.Double,
    endEdit: () => scala.Unit,
    getCubicSegmentPoints: scala.Double => js.Array[FlashPoint],
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
    val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), closePath = closePath, contours = contours, deleteEdge = js.Any.fromFunction1(deleteEdge), edges = edges, endAngle = endAngle, endEdit = js.Any.fromFunction0(endEdit), getCubicSegmentPoints = js.Any.fromFunction1(getCubicSegmentPoints), innerRadius = innerRadius, isDrawingObject = isDrawingObject, isGroup = isGroup, isOvalObject = isOvalObject, isRectangleObject = isRectangleObject, members = members, numCubicSegments = numCubicSegments, startAngle = startAngle, vertices = vertices)
  
    __obj.asInstanceOf[FlashShape]
  }
}

