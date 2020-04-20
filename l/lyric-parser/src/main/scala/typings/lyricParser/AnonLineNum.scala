package typings.lyricParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineNum extends js.Object {
  var lineNum: Double
  var txt: String
}

object AnonLineNum {
  @scala.inline
  def apply(lineNum: Double, txt: String): AnonLineNum = {
    val __obj = js.Dynamic.literal(lineNum = lineNum.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineNum]
  }
}

