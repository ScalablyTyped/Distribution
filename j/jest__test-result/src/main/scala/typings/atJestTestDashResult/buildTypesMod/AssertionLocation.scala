package typings.atJestTestDashResult.buildTypesMod

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
    val __obj = js.Dynamic.literal(fullName = fullName, path = path)
  
    __obj.asInstanceOf[AssertionLocation]
  }
}

