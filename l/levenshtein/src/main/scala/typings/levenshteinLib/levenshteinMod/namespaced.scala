package typings
package levenshteinLib.levenshteinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("levenshtein", JSImport.Namespace)
@js.native
class namespaced protected () extends Levenshtein {
  /**
    * Levenshtein string difference
    * @param m First string
    * @param n Second string
    */
  def this(m: java.lang.String, n: java.lang.String) = this()
  /**
    * Distance between strings
    */
  /* CompleteClass */
  override var distance: scala.Double = js.native
  /**
    * Return the Levenshtein table.
    */
  /* CompleteClass */
  override def getMatrix(): js.Array[js.Array[scala.Double]] = js.native
  /**
    * Pretty print Levenshtein table.
    */
  /* CompleteClass */
  override def inspect(): java.lang.String = js.native
}

