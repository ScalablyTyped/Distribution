package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATUS extends js.Object {
  /*The value used to indicate that a file load has caused an error or a timeout to occur.*/
  var ERROR: java.lang.String
  /*The value used to indicate that a file load has occurred successfully.*/
  var OK: java.lang.String
}

object STATUS {
  @scala.inline
  def apply(ERROR: java.lang.String, OK: java.lang.String): STATUS = {
    val __obj = js.Dynamic.literal(ERROR = ERROR, OK = OK)
  
    __obj.asInstanceOf[STATUS]
  }
}

