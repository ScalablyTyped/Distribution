package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  def request(comment: java.lang.String): scala.Double
}

object Anon_Comment {
  @scala.inline
  def apply(request: java.lang.String => scala.Double): Anon_Comment = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

