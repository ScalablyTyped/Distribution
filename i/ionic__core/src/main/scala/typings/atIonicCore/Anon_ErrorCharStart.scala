package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCharStart extends js.Object {
  var errorCharStart: Double
  var errorLength: js.UndefOr[Double] = js.undefined
  var lineIndex: Double
  var lineNumber: Double
  var text: js.UndefOr[String] = js.undefined
}

object Anon_ErrorCharStart {
  @scala.inline
  def apply(
    errorCharStart: Double,
    lineIndex: Double,
    lineNumber: Double,
    errorLength: Int | Double = null,
    text: String = null
  ): Anon_ErrorCharStart = {
    val __obj = js.Dynamic.literal(errorCharStart = errorCharStart, lineIndex = lineIndex, lineNumber = lineNumber)
    if (errorLength != null) __obj.updateDynamic("errorLength")(errorLength.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_ErrorCharStart]
  }
}

