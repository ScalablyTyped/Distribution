package typings.lyricDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineNum extends js.Object {
  var lineNum: Double
  var txt: String
}

object Anon_LineNum {
  @scala.inline
  def apply(lineNum: Double, txt: String): Anon_LineNum = {
    val __obj = js.Dynamic.literal(lineNum = lineNum.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LineNum]
  }
}

