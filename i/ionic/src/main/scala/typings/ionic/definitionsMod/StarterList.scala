package typings.ionic.definitionsMod

import typings.ionic.anon.IdName
import typings.ionic.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterList extends js.Object {
  var integrations: js.Array[IdName]
  var starters: js.Array[Type]
}

object StarterList {
  @scala.inline
  def apply(integrations: js.Array[IdName], starters: js.Array[Type]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterList]
  }
}

