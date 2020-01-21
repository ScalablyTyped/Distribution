package typings.levenshtein.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("levenshtein", JSImport.Namespace)
@js.native
class ^ protected () extends Levenshtein {
  /**
    * Levenshtein string difference
    * @param m First string
    * @param n Second string
    */
  def this(m: String, n: String) = this()
  /**
    * Distance between strings
    */
  /* CompleteClass */
  override var distance: Double = js.native
  /**
    * Return the Levenshtein table.
    */
  /* CompleteClass */
  override def getMatrix(): js.Array[js.Array[Double]] = js.native
  /**
    * Pretty print Levenshtein table.
    */
  /* CompleteClass */
  override def inspect(): String = js.native
}

