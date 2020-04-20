package typings.linesAndColumns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinesAndColumns extends js.Object {
  var offsets: js.Any
  var string: js.Any
  def indexForLocation(location: SourceLocation): Double | Null
  /* private */ def lengthOfLine(line: js.Any): js.Any
  def locationForIndex(index: Double): SourceLocation | Null
}

object LinesAndColumns {
  @scala.inline
  def apply(
    indexForLocation: SourceLocation => Double | Null,
    lengthOfLine: js.Any => js.Any,
    locationForIndex: Double => SourceLocation | Null,
    offsets: js.Any,
    string: js.Any
  ): LinesAndColumns = {
    val __obj = js.Dynamic.literal(indexForLocation = js.Any.fromFunction1(indexForLocation), lengthOfLine = js.Any.fromFunction1(lengthOfLine), locationForIndex = js.Any.fromFunction1(locationForIndex), offsets = offsets.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinesAndColumns]
  }
}

