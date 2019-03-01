package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignmentX extends js.Object {
  var alignmentX: scala.Double
  var alignmentY: scala.Double
  var text: java.lang.String
}

object Anon_AlignmentX {
  @scala.inline
  def apply(alignmentX: scala.Double, alignmentY: scala.Double, text: java.lang.String): Anon_AlignmentX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alignmentX")(alignmentX)
    __obj.updateDynamic("alignmentY")(alignmentY)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_AlignmentX]
  }
}

