package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a selection in a selection model.
  */
trait Selection extends js.Object {
  /**
    * The first column of the selection.
    *
    * This may be greater than `c2`.
    */
  val c1: Double
  /**
    * The last column of the selection.
    *
    * This may be less than `c1`.
    */
  val c2: Double
  /**
    * The first row of the selection.
    *
    * This may be greater than `r2`.
    */
  val r1: Double
  /**
    * The last row of the selection.
    *
    * This may be less than `r1`.
    */
  val r2: Double
}

object Selection {
  @scala.inline
  def apply(c1: Double, c2: Double, r1: Double, r2: Double): Selection = {
    val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

