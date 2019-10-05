package typings.heremaps.H.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for representing sizes consisting of a width and height.
  * @property w {number} - The size's width value
  * @property h {number} - The size's height value
  */
@JSGlobal("H.math.Size")
@js.native
class Size protected () extends js.Object {
  /**
    * Constructor
    * @param width {number} - Width.
    * @param height {number} - Height.
    */
  def this(width: Double, height: Double) = this()
  var h: Double = js.native
  var w: Double = js.native
}

