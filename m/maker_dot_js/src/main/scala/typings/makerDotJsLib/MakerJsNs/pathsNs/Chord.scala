package typings
package makerDotJsLib.MakerJsNs.pathsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for chord, which is simply a line path that connects the endpoints of an arc.
  *
  * @param arc Arc to use as the basic for the chord.
  */
@JSGlobal("MakerJs.paths.Chord")
@js.native
class Chord protected ()
  extends makerDotJsLib.MakerJsNs.IPathLine {
  def this(arc: makerDotJsLib.MakerJsNs.IPathArc) = this()
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

