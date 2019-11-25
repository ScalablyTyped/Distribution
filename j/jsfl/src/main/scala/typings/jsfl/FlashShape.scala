package typings.jsfl

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
  var isDrawingObject: Boolean
  var isGroup: Boolean
  var isOvalObject: Boolean
  var isRectangleObject: Boolean
  var members: js.Array[FlashShape]
  var numCubicSegments: Double
  var vertices: js.Array[FlashVertex]
  def beginEdit(): Unit
  def deleteEdge(index: Double): Unit
  def endEdit(): Unit
  def getCubicSegmentPoints(cubicSegmentIndex: Double): js.Array[FlashPoint]
}

object FlashShape {
  @scala.inline
  def apply(
    beginEdit: () => Unit,
    closePath: Boolean,
    contours: js.Array[FlashContour],
    deleteEdge: Double => Unit,
    edges: js.Array[FlashEdge],
    endAngle: Double,
    endEdit: () => Unit,
    getCubicSegmentPoints: Double => js.Array[FlashPoint],
    innerRadius: Double,
    isDrawingObject: Boolean,
    isGroup: Boolean,
    isOvalObject: Boolean,
    isRectangleObject: Boolean,
    members: js.Array[FlashShape],
    numCubicSegments: Double,
    startAngle: Double,
    vertices: js.Array[FlashVertex]
  ): FlashShape = {
    val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), closePath = closePath.asInstanceOf[js.Any], contours = contours.asInstanceOf[js.Any], deleteEdge = js.Any.fromFunction1(deleteEdge), edges = edges.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endEdit = js.Any.fromFunction0(endEdit), getCubicSegmentPoints = js.Any.fromFunction1(getCubicSegmentPoints), innerRadius = innerRadius.asInstanceOf[js.Any], isDrawingObject = isDrawingObject.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isOvalObject = isOvalObject.asInstanceOf[js.Any], isRectangleObject = isRectangleObject.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], numCubicSegments = numCubicSegments.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlashShape]
  }
}

