package typings
package graphqlLib.languageSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object Location {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): Location = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[Location]
  }
}

