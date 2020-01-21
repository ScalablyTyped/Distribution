package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionLocation extends js.Object {
  var fullName: String
  var path: String
}

object AssertionLocation {
  @scala.inline
  def apply(fullName: String, path: String): AssertionLocation = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssertionLocation]
  }
}

