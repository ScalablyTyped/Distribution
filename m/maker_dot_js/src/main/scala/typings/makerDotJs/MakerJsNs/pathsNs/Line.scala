package typings.makerDotJs.MakerJsNs.pathsNs

import typings.makerDotJs.MakerJsNs.IPathLine
import typings.makerDotJs.MakerJsNs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for line path.
  */
@JSGlobal("MakerJs.paths.Line")
@js.native
class Line protected () extends IPathLine {
  /**
    * Class for line path, constructed from array of 2 points.
    *
    * @param points Array of 2 points.
    */
  def this(points: js.Array[IPoint]) = this()
  /**
    * Class for line path, constructed from 2 points.
    *
    * @param origin The origin point of the line.
    * @param end The end point of the line.
    */
  def this(origin: IPoint, end: IPoint) = this()
  /**
    * The end point defining the line. The start point is the origin.
    */
  /* CompleteClass */
  override var end: IPoint = js.native
  /**
    * The main point of reference for this path.
    */
  /* CompleteClass */
  override var origin: IPoint = js.native
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  /* CompleteClass */
  override var `type`: String = js.native
}

