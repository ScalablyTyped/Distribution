package typings.linesAndColumns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinesAndColumns extends js.Object {
  var offsets: js.Any = js.native
  var string: js.Any = js.native
  def indexForLocation(location: SourceLocation): Double | Null = js.native
  /* private */ def lengthOfLine(line: js.Any): js.Any = js.native
  def locationForIndex(index: Double): SourceLocation | Null = js.native
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
  @scala.inline
  implicit class LinesAndColumnsOps[Self <: LinesAndColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexForLocation(value: SourceLocation => Double | Null): Self = this.set("indexForLocation", js.Any.fromFunction1(value))
    @scala.inline
    def setLengthOfLine(value: js.Any => js.Any): Self = this.set("lengthOfLine", js.Any.fromFunction1(value))
    @scala.inline
    def setLocationForIndex(value: Double => SourceLocation | Null): Self = this.set("locationForIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setOffsets(value: js.Any): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: js.Any): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

