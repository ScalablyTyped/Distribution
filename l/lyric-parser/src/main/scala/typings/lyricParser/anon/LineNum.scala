package typings.lyricParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineNum extends js.Object {
  var lineNum: Double
  var txt: String
}

object LineNum {
  @scala.inline
  def apply(lineNum: Double, txt: String): LineNum = {
    val __obj = js.Dynamic.literal(lineNum = lineNum.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNum]
  }
}

