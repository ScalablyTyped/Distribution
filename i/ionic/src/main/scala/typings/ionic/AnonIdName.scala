package typings.ionic

import typings.ionic.definitionsMod.IntegrationName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdName extends js.Object {
  var id: String
  var name: IntegrationName
}

object AnonIdName {
  @scala.inline
  def apply(id: String, name: IntegrationName): AnonIdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdName]
  }
}

