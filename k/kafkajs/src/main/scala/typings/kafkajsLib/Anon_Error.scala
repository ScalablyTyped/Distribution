package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: stdLib.Error
  var groupId: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(error: stdLib.Error, groupId: java.lang.String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, groupId = groupId)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

