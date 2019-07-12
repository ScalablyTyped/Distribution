package typings
package linesDashAndDashColumnsLib.linesDashAndDashColumnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinesAndColumns extends js.Object {
  var offsets: js.Any
  var string: js.Any
  def indexForLocation(location: SourceLocation): scala.Double | scala.Null
  /* private */ def lengthOfLine(line: js.Any): js.Any
  def locationForIndex(index: scala.Double): SourceLocation | scala.Null
}

object LinesAndColumns {
  @scala.inline
  def apply(
    indexForLocation: SourceLocation => scala.Double | scala.Null,
    lengthOfLine: js.Any => js.Any,
    locationForIndex: scala.Double => SourceLocation | scala.Null,
    offsets: js.Any,
    string: js.Any
  ): LinesAndColumns = {
    val __obj = js.Dynamic.literal(indexForLocation = js.Any.fromFunction1(indexForLocation), lengthOfLine = js.Any.fromFunction1(lengthOfLine), locationForIndex = js.Any.fromFunction1(locationForIndex), offsets = offsets, string = string)
  
    __obj.asInstanceOf[LinesAndColumns]
  }
}

