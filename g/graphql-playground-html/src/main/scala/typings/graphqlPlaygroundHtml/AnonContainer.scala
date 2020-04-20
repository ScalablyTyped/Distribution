package typings.graphqlPlaygroundHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: String
  var script: String
}

object AnonContainer {
  @scala.inline
  def apply(container: String, script: String): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

