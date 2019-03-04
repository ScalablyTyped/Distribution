package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResult extends js.Object {
  var fullName: java.lang.String
  var success: scala.Boolean
}

object SaveResult {
  @scala.inline
  def apply(fullName: java.lang.String, success: scala.Boolean): SaveResult = {
    val __obj = js.Dynamic.literal(fullName = fullName, success = success)
  
    __obj.asInstanceOf[SaveResult]
  }
}

