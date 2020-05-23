package typings.ionic.anon

import typings.ionic.definitionsMod.IntegrationName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdName extends js.Object {
  var id: String
  var name: IntegrationName
}

object IdName {
  @scala.inline
  def apply(id: String, name: IntegrationName): IdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdName]
  }
}

