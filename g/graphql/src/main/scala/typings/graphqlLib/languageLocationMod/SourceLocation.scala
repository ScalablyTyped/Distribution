package typings
package graphqlLib.languageLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  val column: scala.Double
  val line: scala.Double
}

object SourceLocation {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[SourceLocation]
  }
}

