package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalObject extends js.Object {
  var packageName: String
  var variableName: String
}

object ExternalObject {
  @scala.inline
  def apply(packageName: String, variableName: String): ExternalObject = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalObject]
  }
}

