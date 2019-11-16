package typings.atJestCore.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterResult extends js.Object {
  var message: String
  var test: String
}

object FilterResult {
  @scala.inline
  def apply(message: String, test: String): FilterResult = {
    val __obj = js.Dynamic.literal(message = message, test = test)
  
    __obj.asInstanceOf[FilterResult]
  }
}

