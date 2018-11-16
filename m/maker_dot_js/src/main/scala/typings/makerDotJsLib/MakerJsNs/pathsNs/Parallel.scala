package typings
package makerDotJsLib.MakerJsNs.pathsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class for a parallel line path.
     *
     * @param toLine A line to be parallel to.
     * @param distance Distance between parallel and original line.
     * @param nearPoint Any point to determine which side of the line to place the parallel.
     */
@JSGlobal("MakerJs.paths.Parallel")
@js.native
class Parallel protected ()
  extends makerDotJsLib.MakerJsNs.IPathLine {
  def this(toLine: makerDotJsLib.MakerJsNs.IPathLine, distance: scala.Double, nearPoint: makerDotJsLib.MakerJsNs.IPoint) = this()
  /**
           * The end point defining the line. The start point is the origin.
           */
  /* CompleteClass */
  override var end: makerDotJsLib.MakerJsNs.IPoint = js.native
  /**
           * The main point of reference for this path.
           */
  /* CompleteClass */
  override var origin: makerDotJsLib.MakerJsNs.IPoint = js.native
  /**
           * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
           */
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
}

