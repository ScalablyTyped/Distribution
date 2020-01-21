package typings.ionic.definitionsMod

import typings.ionic.AnonIdName
import typings.ionic.AnonIdNameIntegrationName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterList extends js.Object {
  var integrations: js.Array[AnonIdNameIntegrationName]
  var starters: js.Array[AnonIdName]
}

object StarterList {
  @scala.inline
  def apply(integrations: js.Array[AnonIdNameIntegrationName], starters: js.Array[AnonIdName]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StarterList]
  }
}

