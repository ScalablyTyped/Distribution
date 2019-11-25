package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATUS extends js.Object {
  /*The value used to indicate that a file load has caused an error or a timeout to occur.*/
  var ERROR: String
  /*The value used to indicate that a file load has occurred successfully.*/
  var OK: String
}

object STATUS {
  @scala.inline
  def apply(ERROR: String, OK: String): STATUS = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[STATUS]
  }
}

