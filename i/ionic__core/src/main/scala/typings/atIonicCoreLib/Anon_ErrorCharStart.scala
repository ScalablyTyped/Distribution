package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCharStart extends js.Object {
  var errorCharStart: scala.Double
  var errorLength: js.UndefOr[scala.Double] = js.undefined
  var lineIndex: scala.Double
  var lineNumber: scala.Double
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ErrorCharStart {
  @scala.inline
  def apply(
    errorCharStart: scala.Double,
    lineIndex: scala.Double,
    lineNumber: scala.Double,
    errorLength: scala.Int | scala.Double = null,
    text: java.lang.String = null
  ): Anon_ErrorCharStart = {
    val __obj = js.Dynamic.literal(errorCharStart = errorCharStart, lineIndex = lineIndex, lineNumber = lineNumber)
    if (errorLength != null) __obj.updateDynamic("errorLength")(errorLength.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_ErrorCharStart]
  }
}

